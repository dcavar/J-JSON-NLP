/**
 * CharacterEmbedding.java
 * (C) 2019 by Damir Cavar
 */

package org.nlplab.jsonnlp;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "model",
        "vector"
})


public class CharacterEmbedding {

    @JsonProperty("model")
    private String model;

    /**
     * (Required)
     */
    @JsonProperty("vector")
    private List<List<Double>> vector = new ArrayList<>();

    @JsonProperty("model")
    public String getModel() {
        return model;
    }

    @JsonProperty("model")
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * (Required)
     */
    @JsonProperty("vector")
    public List<List<Double>> getVector() {
        return vector;
    }

    /**
     * (Required)
     */
    @JsonProperty("vector")
    public void setVector(List<List<Double>> vector) {
        this.vector = vector;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CharacterEmbedding.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("model");
        sb.append('=');
        sb.append(((this.model == null) ? "<null>" : this.model));
        sb.append(',');
        sb.append("vector");
        sb.append('=');
        sb.append(((this.vector == null) ? "<null>" : this.vector));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.model == null) ? 0 : this.model.hashCode()));
        return ((result * 31) + ((this.vector == null) ? 0 : this.vector.hashCode()));
        //return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) return true;

        if (!(other instanceof CharacterEmbedding)) return false;

        CharacterEmbedding rhs = ((CharacterEmbedding) other);
        return (((this.model.equals(rhs.model)) || ((this.model != null) && this.model.equals(rhs.model))) && ((this.vector == rhs.vector) || ((this.vector != null) && this.vector.equals(rhs.vector))));
    }

}
