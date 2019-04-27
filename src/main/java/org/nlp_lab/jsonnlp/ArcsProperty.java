
package org.nlp_lab.jsonnlp;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sentenceId",
    "label",
    "governor",
    "dependent",
    "scores"
})
public class ArcsProperty {

    @JsonProperty("sentenceId")
    private String sentenceId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("label")
    private String label;
    /**
     * Token Id corresponding to the governor
     * (Required)
     * 
     */
    @JsonProperty("governor")
    @JsonPropertyDescription("Token Id corresponding to the governor")
    private Integer governor;
    /**
     * Token Id corresponding to the dependent
     * 
     */
    @JsonProperty("dependent")
    @JsonPropertyDescription("Token Id corresponding to the dependent")
    private Integer dependent;
    /**
     * Confidence levels of a particular attribute
     * 
     */
    @JsonProperty("scores")
    @JsonPropertyDescription("Confidence levels of a particular attribute")
    private Scores scores;

    @JsonProperty("sentenceId")
    public String getSentenceId() {
        return sentenceId;
    }

    @JsonProperty("sentenceId")
    public void setSentenceId(String sentenceId) {
        this.sentenceId = sentenceId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Token Id corresponding to the governor
     * (Required)
     * 
     */
    @JsonProperty("governor")
    public Integer getGovernor() {
        return governor;
    }

    /**
     * Token Id corresponding to the governor
     * (Required)
     * 
     */
    @JsonProperty("governor")
    public void setGovernor(Integer governor) {
        this.governor = governor;
    }

    /**
     * Token Id corresponding to the dependent
     * 
     */
    @JsonProperty("dependent")
    public Integer getDependent() {
        return dependent;
    }

    /**
     * Token Id corresponding to the dependent
     * 
     */
    @JsonProperty("dependent")
    public void setDependent(Integer dependent) {
        this.dependent = dependent;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ArcsProperty.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sentenceId");
        sb.append('=');
        sb.append(((this.sentenceId == null)?"<null>":this.sentenceId));
        sb.append(',');
        sb.append("label");
        sb.append('=');
        sb.append(((this.label == null)?"<null>":this.label));
        sb.append(',');
        sb.append("governor");
        sb.append('=');
        sb.append(((this.governor == null)?"<null>":this.governor));
        sb.append(',');
        sb.append("dependent");
        sb.append('=');
        sb.append(((this.dependent == null)?"<null>":this.dependent));
        sb.append(',');
        sb.append("scores");
        sb.append('=');
        sb.append(((this.scores == null)?"<null>":this.scores));
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
        result = ((result* 31)+((this.sentenceId == null)? 0 :this.sentenceId.hashCode()));
        result = ((result* 31)+((this.label == null)? 0 :this.label.hashCode()));
        result = ((result* 31)+((this.governor == null)? 0 :this.governor.hashCode()));
        result = ((result* 31)+((this.dependent == null)? 0 :this.dependent.hashCode()));
        result = ((result* 31)+((this.scores == null)? 0 :this.scores.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ArcsProperty) == false) {
            return false;
        }
        ArcsProperty rhs = ((ArcsProperty) other);
        return ((((((this.sentenceId == rhs.sentenceId)||((this.sentenceId!= null)&&this.sentenceId.equals(rhs.sentenceId)))&&((this.label == rhs.label)||((this.label!= null)&&this.label.equals(rhs.label))))&&((this.governor == rhs.governor)||((this.governor!= null)&&this.governor.equals(rhs.governor))))&&((this.dependent == rhs.dependent)||((this.dependent!= null)&&this.dependent.equals(rhs.dependent))))&&((this.scores == rhs.scores)||((this.scores!= null)&&this.scores.equals(rhs.scores))));
    }

}
