
package com.feastplanner.recipesapi.dto;

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
    "expires",
    "results",
    "number",
    "offset",
    "processingTimeMs",
    "isStale"
})
@Generated("jsonschema2pojo")
public class Recipes {

    @JsonProperty("expires")
    private Long expires;
    @JsonProperty("results")
    private List<Result> results = null;
    @JsonProperty("number")
    private Integer number;
    @JsonProperty("offset")
    private Integer offset;
    @JsonProperty("processingTimeMs")
    private Integer processingTimeMs;
    @JsonProperty("isStale")
    private Boolean isStale;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("expires")
    public Long getExpires() {
        return expires;
    }

    @JsonProperty("expires")
    public void setExpires(Long expires) {
        this.expires = expires;
    }

    @JsonProperty("results")
    public List<Result> getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(List<Result> results) {
        this.results = results;
    }

    @JsonProperty("number")
    public Integer getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(Integer number) {
        this.number = number;
    }

    @JsonProperty("offset")
    public Integer getOffset() {
        return offset;
    }

    @JsonProperty("offset")
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @JsonProperty("processingTimeMs")
    public Integer getProcessingTimeMs() {
        return processingTimeMs;
    }

    @JsonProperty("processingTimeMs")
    public void setProcessingTimeMs(Integer processingTimeMs) {
        this.processingTimeMs = processingTimeMs;
    }

    @JsonProperty("isStale")
    public Boolean getIsStale() {
        return isStale;
    }

    @JsonProperty("isStale")
    public void setIsStale(Boolean isStale) {
        this.isStale = isStale;
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
