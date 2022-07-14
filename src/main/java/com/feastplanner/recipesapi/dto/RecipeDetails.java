
package com.feastplanner.recipesapi.dto;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dairyFree",
    "text",
    "aggregateLikes",
    "imageUrls",
    "image",
    "sustainable",
    "sourceUrl",
    "spoonacularSourceUrl",
    "veryHealthy",
    "id",
    "glutenFree",
    "vegan",
    "servings",
    "title",
    "vegetarian",
    "cheap",
    "veryPopular",
    "extendedIngredients"
})
@Generated("jsonschema2pojo")
public class RecipeDetails {

    @JsonProperty("dairyFree")
    private Boolean dairyFree;
    @JsonProperty("text")
    private String text;
    @JsonProperty("aggregateLikes")
    private Integer aggregateLikes;
    @JsonProperty("imageUrls")
    private List<URI> imageUrls = null;
    @JsonProperty("image")
    private URI image;
    @JsonProperty("sustainable")
    private Boolean sustainable;
    @JsonProperty("sourceUrl")
    private URI sourceUrl;
    @JsonProperty("spoonacularSourceUrl")
    private URI spoonacularSourceUrl;
    @JsonProperty("veryHealthy")
    private Boolean veryHealthy;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("glutenFree")
    private Boolean glutenFree;
    @JsonProperty("vegan")
    private Boolean vegan;
    @JsonProperty("servings")
    private Integer servings;
    @JsonProperty("title")
    private String title;
    @JsonProperty("vegetarian")
    private Boolean vegetarian;
    @JsonProperty("cheap")
    private Boolean cheap;
    @JsonProperty("veryPopular")
    private Boolean veryPopular;
    @JsonProperty("extendedIngredients")
    private List<ExtendedIngredient> extendedIngredients = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("dairyFree")
    public Boolean getDairyFree() {
        return dairyFree;
    }

    @JsonProperty("dairyFree")
    public void setDairyFree(Boolean dairyFree) {
        this.dairyFree = dairyFree;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("aggregateLikes")
    public Integer getAggregateLikes() {
        return aggregateLikes;
    }

    @JsonProperty("aggregateLikes")
    public void setAggregateLikes(Integer aggregateLikes) {
        this.aggregateLikes = aggregateLikes;
    }

    @JsonProperty("imageUrls")
    public List<URI> getImageUrls() {
        return imageUrls;
    }

    @JsonProperty("imageUrls")
    public void setImageUrls(List<URI> imageUrls) {
        this.imageUrls = imageUrls;
    }

    @JsonProperty("image")
    public URI getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(URI image) {
        this.image = image;
    }

    @JsonProperty("sustainable")
    public Boolean getSustainable() {
        return sustainable;
    }

    @JsonProperty("sustainable")
    public void setSustainable(Boolean sustainable) {
        this.sustainable = sustainable;
    }

    @JsonProperty("sourceUrl")
    public URI getSourceUrl() {
        return sourceUrl;
    }

    @JsonProperty("sourceUrl")
    public void setSourceUrl(URI sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    @JsonProperty("spoonacularSourceUrl")
    public URI getSpoonacularSourceUrl() {
        return spoonacularSourceUrl;
    }

    @JsonProperty("spoonacularSourceUrl")
    public void setSpoonacularSourceUrl(URI spoonacularSourceUrl) {
        this.spoonacularSourceUrl = spoonacularSourceUrl;
    }

    @JsonProperty("veryHealthy")
    public Boolean getVeryHealthy() {
        return veryHealthy;
    }

    @JsonProperty("veryHealthy")
    public void setVeryHealthy(Boolean veryHealthy) {
        this.veryHealthy = veryHealthy;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("glutenFree")
    public Boolean getGlutenFree() {
        return glutenFree;
    }

    @JsonProperty("glutenFree")
    public void setGlutenFree(Boolean glutenFree) {
        this.glutenFree = glutenFree;
    }

    @JsonProperty("vegan")
    public Boolean getVegan() {
        return vegan;
    }

    @JsonProperty("vegan")
    public void setVegan(Boolean vegan) {
        this.vegan = vegan;
    }

    @JsonProperty("servings")
    public Integer getServings() {
        return servings;
    }

    @JsonProperty("servings")
    public void setServings(Integer servings) {
        this.servings = servings;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("vegetarian")
    public Boolean getVegetarian() {
        return vegetarian;
    }

    @JsonProperty("vegetarian")
    public void setVegetarian(Boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    @JsonProperty("cheap")
    public Boolean getCheap() {
        return cheap;
    }

    @JsonProperty("cheap")
    public void setCheap(Boolean cheap) {
        this.cheap = cheap;
    }

    @JsonProperty("veryPopular")
    public Boolean getVeryPopular() {
        return veryPopular;
    }

    @JsonProperty("veryPopular")
    public void setVeryPopular(Boolean veryPopular) {
        this.veryPopular = veryPopular;
    }

    @JsonProperty("extendedIngredients")
    public List<ExtendedIngredient> getExtendedIngredients() {
        return extendedIngredients;
    }

    @JsonProperty("extendedIngredients")
    public void setExtendedIngredients(List<ExtendedIngredient> extendedIngredients) {
        this.extendedIngredients = extendedIngredients;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
