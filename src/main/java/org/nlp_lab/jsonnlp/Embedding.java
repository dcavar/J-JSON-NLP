/**
 * Embedding.java
 *
 * (C) 2019 by Damir Cavar
 *
 */
package org.nlp_lab.jsonnlp;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "vector",
    "model"
})
public class Embedding {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("vector")
    private List<Double> vector = new ArrayList<Double>();
    /**
     * Which model, language, version are these embeddings from?
     * (Required)
     * 
     */
    @JsonProperty("model")
    @JsonPropertyDescription("Which model, language, version are these embeddings from?")
    private String model;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("vector")
    public List<Double> getVector() {
        return vector;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("vector")
    public void setVector(List<Double> vector) {
        this.vector = vector;
    }

    /**
     * Which model, language, version are these embeddings from?
     * (Required)
     * 
     */
    @JsonProperty("model")
    public String getModel() {
        return model;
    }

    /**
     * Which model, language, version are these embeddings from?
     * (Required)
     * 
     */
    @JsonProperty("model")
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Embedding.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("vector");
        sb.append('=');
        sb.append(((this.vector == null)?"<null>":this.vector));
        sb.append(',');
        sb.append("model");
        sb.append('=');
        sb.append(((this.model == null)?"<null>":this.model));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.vector == null)? 0 :this.vector.hashCode()));
        result = ((result* 31)+((this.model == null)? 0 :this.model.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Embedding) == false) {
            return false;
        }
        Embedding rhs = ((Embedding) other);
        return (((this.vector == rhs.vector)||((this.vector!= null)&&this.vector.equals(rhs.vector)))&&((this.model == rhs.model)||((this.model!= null)&&this.model.equals(rhs.model))));
    }

}
