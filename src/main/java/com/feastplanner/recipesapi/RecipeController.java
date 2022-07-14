package com.feastplanner.recipesapi;


import com.feastplanner.recipesapi.dto.Recipes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@RestController
//@Component
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
    //RestTemplate restTemplate;
    private RestTemplate restTemplate;

//    public RecipeController(RestTemplateBuilder restTemplateBuilder) {
//        restTemplate = restTemplateBuilder.build();
//    }


    @RequestMapping(value = "/allrecipes")
    private Recipes getAllRecipes(@RequestParam(required = false) String query,
                                  @RequestParam(required = false) String excludeIngredients,
                                  @RequestParam(required = false) String intolerances,
                                  @RequestParam(required = false) String diet,
                                  @RequestParam(required = false) String cuisine,
                                  @RequestParam(required = false) String type,
                                  @RequestParam(required = false, defaultValue = "10") String number,
                                  @RequestParam(required = false, defaultValue = "0") String offset) {
//        URI uri;
//        uri = new URI(webknoxUrl);
        String uri = webknoxUrl;
        HttpHeaders headers = new HttpHeaders();
        headers.set(apiKeyName, apiKeyValue);
        headers.set(hostName, hostValue);
        headers.setContentType(MediaType.APPLICATION_JSON);

        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        HttpEntity<String> request = new HttpEntity<>(headers);
        ResponseEntity<Recipes> recipesEntity = restTemplate.exchange(uri, HttpMethod.GET, request,
                Recipes.class);
        Recipes recipes = recipesEntity.getBody();

        return recipes;
    }
}

//    @RequestMapping("/hello")
//    public String hello() {
//        return "Hello World!";
//    }

//    @GetMapping(value = "/hello2")
//    private String getHello2() {
//        String uri = "http://localhost:8085/hello";
//        RestTemplate restTemplate = new RestTemplate();
//        String result = restTemplate.getForObject(uri, String.class);
//        return result;
//    }
//
//    @GetMapping(value = "/callclienthello")
//    private String getHelloClient() {
//        String uri = "https://restcountries.com/v3.1/all";
//        RestTemplate restTemplate = new RestTemplate();
//        String result = restTemplate.getForObject(uri, String.class);
//        return result;
//    }