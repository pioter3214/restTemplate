
package com.example.demo;

import java.util.HashMap;
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
        "verified",
        "sentCount"
})
@Generated("jsonschema2pojo")
public class Status {

    @JsonProperty("verified")
    private Object verified;
    @JsonProperty("sentCount")
    private Integer sentCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("verified")
    public Object getVerified() {
        return verified;
    }

    @JsonProperty("verified")
    public void setVerified(Object verified) {
        this.verified = verified;
    }

    @JsonProperty("sentCount")
    public Integer getSentCount() {
        return sentCount;
    }

    @JsonProperty("sentCount")
    public void setSentCount(Integer sentCount) {
        this.sentCount = sentCount;
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
