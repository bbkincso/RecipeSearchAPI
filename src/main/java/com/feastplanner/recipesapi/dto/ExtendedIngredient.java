
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
    "amount",
    "unit",
    "metaInformation",
    "unitShort",
    "aisle",
    "name",
    "originalString",
    "unitLong"
})
@Generated("jsonschema2pojo")
public class ExtendedIngredient {

    @JsonProperty("amount")
    private Double amount;
    @JsonProperty("unit")
    private String unit;
    @JsonProperty("metaInformation")
    private List<Object> metaInformation = null;
    @JsonProperty("unitShort")
    private String unitShort;
    @JsonProperty("aisle")
    private String aisle;
    @JsonProperty("name")
    private String name;
    @JsonProperty("originalString")
    private String originalString;
    @JsonProperty("unitLong")
    private String unitLong;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @JsonProperty("unit")
    public String getUnit() {
        return unit;
    }

    @JsonProperty("unit")
    public void setUnit(String unit) {
        this.unit = unit;
    }

    @JsonProperty("metaInformation")
    public List<Object> getMetaInformation() {
        return metaInformation;
    }

    @JsonProperty("metaInformation")
    public void setMetaInformation(List<Object> metaInformation) {
        this.metaInformation = metaInformation;
    }

    @JsonProperty("unitShort")
    public String getUnitShort() {
        return unitShort;
    }

    @JsonProperty("unitShort")
    public void setUnitShort(String unitShort) {
        this.unitShort = unitShort;
    }

    @JsonProperty("aisle")
    public String getAisle() {
        return aisle;
    }

    @JsonProperty("aisle")
    public void setAisle(String aisle) {
        this.aisle = aisle;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("originalString")
    public String getOriginalString() {
        return originalString;
    }

    @JsonProperty("originalString")
    public void setOriginalString(String originalString) {
        this.originalString = originalString;
    }

    @JsonProperty("unitLong")
    public String getUnitLong() {
        return unitLong;
    }

    @JsonProperty("unitLong")
    public void setUnitLong(String unitLong) {
        this.unitLong = unitLong;
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
