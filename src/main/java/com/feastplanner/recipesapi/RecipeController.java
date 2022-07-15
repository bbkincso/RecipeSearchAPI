package com.feastplanner.recipesapi;


import com.feastplanner.recipesapi.dto.RecipeDetails;
import com.feastplanner.recipesapi.dto.Recipes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Collections;

@RestController
public class RecipeController {


    @Value("${rapidapi.url}")
    String webknoxUrl;
    @Value("${rapidapi.key.name}")
    String apiKeyName;
    @Value("${rapidapi.key.value}")
    String apiKeyValue;
    @Value("${rapidapi.host.name}")
    String hostName;
    @Value("${rapidapi.host.value}")
    String hostValue;

    @Autowired
    private RestTemplate restTemplate;


    private HttpEntity<String> createHttpEntity(){
        HttpHeaders headers = new HttpHeaders();
        headers.set(apiKeyName, apiKeyValue);
        headers.set(hostName, hostValue);
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        HttpEntity<String> request = new HttpEntity<>(headers);
        return request;
    }


    @RequestMapping(value = "/all-recipes")
    private Recipes getAllRecipes(@RequestParam(defaultValue = "", required = false) String query,
                                  @RequestParam(defaultValue = "", required = false) String excludeIngredients,
                                  @RequestParam(defaultValue = "", required = false) String intolerances,
                                  @RequestParam(defaultValue = "", required = false) String diet,
                                  @RequestParam(defaultValue = "", required = false) String cuisine,
                                  @RequestParam(defaultValue = "", required = false) String type,
                                  @RequestParam(defaultValue = "", required = false) String number,
                                  @RequestParam(defaultValue = "", required = false) String offset) {

        String uri = webknoxUrl + "search?"
                + (query != "" ? "query=" + query : "")
                + (excludeIngredients != "" ? "&excludeIngredients=" + excludeIngredients : "")
                + (intolerances != "" ? "&intolerances=" + intolerances : "")
                + (diet != "" ? "&diet=" + diet : "")
                + (cuisine != "" ? "&cuisine=" + cuisine : "")
                + (type != "" ? "&type=" + type : "")
                + (number != "" ? "&number=" + number : "")
                + (offset != "" ? "&offset=" + offset : "");

        ResponseEntity<Recipes> recipesEntity = restTemplate.exchange(uri, HttpMethod.GET, createHttpEntity(),
                Recipes.class);
        Recipes recipes = recipesEntity.getBody();
        return recipes;
    }

    @RequestMapping(value = "/recipe")
    private RecipeDetails getRecipe(@RequestParam(required = false) URI url) {

        String uri = webknoxUrl + "extract?url=" + url;

        ResponseEntity<RecipeDetails> recipesEntity = restTemplate.exchange(uri, HttpMethod.GET, createHttpEntity(),
                RecipeDetails.class);
        RecipeDetails recipe = recipesEntity.getBody();

        return recipe;
    }

}

