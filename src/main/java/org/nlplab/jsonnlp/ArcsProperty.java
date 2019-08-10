/**
 * ArcsProperty.java
 * <p>
 * (C) 2019 by Damir Cavar
 * <p>
 * NLP-Lab code version.
 */

package org.nlplab.jsonnlp;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        //"sentenceId",
        "lab",
        "gov",
        "dep",
        "scores"
})


public class ArcsProperty {

    /**
     * (Required)
     */
    @JsonProperty("lab")
    @JsonPropertyDescription("Label of the dependency.")
    private String lab;

    /**
     * Token Id corresponding to the governor
     * (Required)
     */
    @JsonProperty("gov")
    @JsonPropertyDescription("Token Id corresponding to the governor")
    private Integer gov;

    /**
     * Token Id corresponding to the dependent
     */
    @JsonProperty("dep")
    @JsonPropertyDescription("Token Id corresponding to the dependent")
    private Integer dep;

    /**
     * Confidence levels of a particular attribute
     */
    @JsonProperty("scores")
    @JsonPropertyDescription("Confidence levels of a particular attribute")
    private Scores scores;


    /**
     * (Required)
     */
    @JsonProperty("lab")
    public String getLabel() {
        return lab;
    }

    /**
     * (Required)
     */
    @JsonProperty("lab")
    public void setLabel(String label) {
        this.lab = label;
    }

    /**
     * Token Id corresponding to the governor
     * (Required)
     */
    @JsonProperty("gov")
    public Integer getGovernor() {
        return gov;
    }

    /**
     * Token Id corresponding to the governor
     * (Required)
     */
    @JsonProperty("gov")
    public void setGovernor(Integer governor) {
        this.gov = governor;
    }

    /**
     * Token Id corresponding to the dependent
     */
    @JsonProperty("dep")
    public Integer getDependent() {
        return dep;
    }

    /**
     * Token Id corresponding to the dependent
     */
    @JsonProperty("dep")
    public void setDependent(Integer dependent) {
        this.dep = dependent;
    }

    /**
     * Confidence levels of a particular attribute
     */
    @JsonProperty("scores")
    public Scores getScores() {
        return scores;
    }

    /**
     * Confidence levels of a particular attribute
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
        //sb.append(((this.sentenceId == null)?"<null>":this.sentenceId));
        sb.append(',');
        sb.append("lab");
        sb.append('=');
        sb.append(((this.lab == null) ? "<null>" : this.lab));
        sb.append(',');
        sb.append("gov");
        sb.append('=');
        sb.append(((this.gov == null) ? "<null>" : this.gov));
        sb.append(',');
        sb.append("dep");
        sb.append('=');
        sb.append(((this.dep == null) ? "<null>" : this.dep));
        sb.append(',');
        sb.append("scores");
        sb.append('=');
        sb.append(((this.scores == null) ? "<null>" : this.scores));
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
        //result = ((result* 31)+((this.sentenceId == null)? 0 :this.sentenceId.hashCode()));
        result = ((result * 31) + ((this.lab == null) ? 0 : this.lab.hashCode()));
        result = ((result * 31) + ((this.gov == null) ? 0 : this.gov.hashCode()));
        result = ((result * 31) + ((this.dep == null) ? 0 : this.dep.hashCode()));
        return ((result * 31) + ((this.scores == null) ? 0 : this.scores.hashCode()));
        //return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (!(other instanceof ArcsProperty)) return false;

        ArcsProperty rhs = (ArcsProperty) other;
        // TODO (string1 == string2) returns 0 !
        return (((((this.lab.equals(rhs.lab) || ((this.lab != null) &&
                this.lab.equals(rhs.lab)))) &&
                (this.gov.equals(rhs.gov) || ((this.gov != null) && this.gov.equals(rhs.gov)))) &&
                ((this.dep.equals(rhs.dep)) || ((this.dep != null) && this.dep.equals(rhs.dep)))) &&
                ((this.scores == rhs.scores) || ((this.scores != null) && this.scores.equals(rhs.scores))));
    }

}
