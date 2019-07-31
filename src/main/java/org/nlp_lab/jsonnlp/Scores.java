/**
 * Scores.java
 *
 * (C) 2019 by Damir Cavar
 *
 */


package org.nlp_lab.jsonnlp;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Confidence levels of a particular attribute
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({

})
public class Scores {

    /**
     * Universal part of speech tag probability
     *
     */
    @JsonProperty("upos")
    @JsonPropertyDescription("Universal part of speech tag probability")
    private double upos;

    /**
     * Language-specific part of speech tag probability
     *
     */
    @JsonProperty("xpos")
    @JsonPropertyDescription("Language-specific part of speech tag probability")
    private double xpos;

    /**
     * The Named Entity Tag Probability
     *
     */
    @JsonProperty("entity")
    @JsonPropertyDescription("The Named Entity Tag Probability")
    private double entity;

    /**
     * The Wordnet_ID probability
     *
     */
    @JsonProperty("wordnetId")
    @JsonPropertyDescription("The Wordnet_ID probability")
    private double wordnetId;

    /**
     * The sentiment label probability
     *
     */
    @JsonProperty("label")
    @JsonPropertyDescription("The sentiment label probability")
    private double label;

    /**
     * The expression type probability
     *
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The expression type probability")
    private double type;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Scores.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Scores) == false) {
            return false;
        }
        Scores rhs = ((Scores) other);
        return true;
    }

}
