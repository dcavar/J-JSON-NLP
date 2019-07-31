/**
 * Conll.java
 * (C) 2019 by Damir Cavar
 *
 */
package org.nlp_lab.jsonnlp;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Metadata for parsing to and from CoNLL formats
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sentence_ids"
})
public class Conll {

    /**
     * Are sentence ids provided for each sentence
     * 
     */
    @JsonProperty("sentence_ids")
    @JsonPropertyDescription("Are sentence ids provided for each sentence")
    private Boolean sentenceIds = false;

    /**
     * Are sentence ids provided for each sentence
     * 
     */
    @JsonProperty("sentence_ids")
    public Boolean getSentenceIds() {
        return sentenceIds;
    }

    /**
     * Are sentence ids provided for each sentence
     * 
     */
    @JsonProperty("sentence_ids")
    public void setSentenceIds(Boolean sentenceIds) {
        this.sentenceIds = sentenceIds;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Conll.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sentenceIds");
        sb.append('=');
        sb.append(((this.sentenceIds == null)?"<null>":this.sentenceIds));
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
        result = ((result* 31)+((this.sentenceIds == null)? 0 :this.sentenceIds.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Conll) == false) {
            return false;
        }
        Conll rhs = ((Conll) other);
        return ((this.sentenceIds == rhs.sentenceIds)||((this.sentenceIds!= null)&&this.sentenceIds.equals(rhs.sentenceIds)));
    }

}
