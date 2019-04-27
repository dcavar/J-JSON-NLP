
package org.nlp_lab.jsonnlp;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "tokens",
    "embeddings",
    "features",
    "scores",
    "labels"
})
public class ParagraphsProperty {

    /**
     * Unique paragraph ID
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Unique paragraph ID")
    private String id;
    /**
     * Token id lists cannot be empty
     * (Required)
     * 
     */
    @JsonProperty("tokens")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("Token id lists cannot be empty")
    private Set<Integer> tokens = new LinkedHashSet<Integer>();
    /**
     * Allow for embeddings from multiple sources
     * 
     */
    @JsonProperty("embeddings")
    @JsonPropertyDescription("Allow for embeddings from multiple sources")
    private List<Embedding> embeddings = new ArrayList<Embedding>();
    /**
     * Linguistic features, corresponding to the ConLL format
     * 
     */
    @JsonProperty("features")
    @JsonPropertyDescription("Linguistic features, corresponding to the ConLL format")
    private Features features;
    /**
     * Confidence levels of a particular attribute
     * 
     */
    @JsonProperty("scores")
    @JsonPropertyDescription("Confidence levels of a particular attribute")
    private Scores scores;
    /**
     * Classification labels applied to a given section
     * 
     */
    @JsonProperty("labels")
    @JsonPropertyDescription("Classification labels applied to a given section")
    private List<Label> labels = new ArrayList<Label>();

    /**
     * Unique paragraph ID
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Unique paragraph ID
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Token id lists cannot be empty
     * (Required)
     * 
     */
    @JsonProperty("tokens")
    public Set<Integer> getTokens() {
        return tokens;
    }

    /**
     * Token id lists cannot be empty
     * (Required)
     * 
     */
    @JsonProperty("tokens")
    public void setTokens(Set<Integer> tokens) {
        this.tokens = tokens;
    }

    /**
     * Allow for embeddings from multiple sources
     * 
     */
    @JsonProperty("embeddings")
    public List<Embedding> getEmbeddings() {
        return embeddings;
    }

    /**
     * Allow for embeddings from multiple sources
     * 
     */
    @JsonProperty("embeddings")
    public void setEmbeddings(List<Embedding> embeddings) {
        this.embeddings = embeddings;
    }

    /**
     * Linguistic features, corresponding to the ConLL format
     * 
     */
    @JsonProperty("features")
    public Features getFeatures() {
        return features;
    }

    /**
     * Linguistic features, corresponding to the ConLL format
     * 
     */
    @JsonProperty("features")
    public void setFeatures(Features features) {
        this.features = features;
    }

    /**
     * Confidence levels of a particular attribute
     * 
     */
    @JsonProperty("scores")
    public Scores getScores() {
        return scores;
    }

    /**
     * Confidence levels of a particular attribute
     * 
     */
    @JsonProperty("scores")
    public void setScores(Scores scores) {
        this.scores = scores;
    }

    /**
     * Classification labels applied to a given section
     * 
     */
    @JsonProperty("labels")
    public List<Label> getLabels() {
        return labels;
    }

    /**
     * Classification labels applied to a given section
     * 
     */
    @JsonProperty("labels")
    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ParagraphsProperty.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("tokens");
        sb.append('=');
        sb.append(((this.tokens == null)?"<null>":this.tokens));
        sb.append(',');
        sb.append("embeddings");
        sb.append('=');
        sb.append(((this.embeddings == null)?"<null>":this.embeddings));
        sb.append(',');
        sb.append("features");
        sb.append('=');
        sb.append(((this.features == null)?"<null>":this.features));
        sb.append(',');
        sb.append("scores");
        sb.append('=');
        sb.append(((this.scores == null)?"<null>":this.scores));
        sb.append(',');
        sb.append("labels");
        sb.append('=');
        sb.append(((this.labels == null)?"<null>":this.labels));
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
        result = ((result* 31)+((this.embeddings == null)? 0 :this.embeddings.hashCode()));
        result = ((result* 31)+((this.features == null)? 0 :this.features.hashCode()));
        result = ((result* 31)+((this.scores == null)? 0 :this.scores.hashCode()));
        result = ((result* 31)+((this.tokens == null)? 0 :this.tokens.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.labels == null)? 0 :this.labels.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ParagraphsProperty) == false) {
            return false;
        }
        ParagraphsProperty rhs = ((ParagraphsProperty) other);
        return (((((((this.embeddings == rhs.embeddings)||((this.embeddings!= null)&&this.embeddings.equals(rhs.embeddings)))&&((this.features == rhs.features)||((this.features!= null)&&this.features.equals(rhs.features))))&&((this.scores == rhs.scores)||((this.scores!= null)&&this.scores.equals(rhs.scores))))&&((this.tokens == rhs.tokens)||((this.tokens!= null)&&this.tokens.equals(rhs.tokens))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.labels == rhs.labels)||((this.labels!= null)&&this.labels.equals(rhs.labels))));
    }

}
