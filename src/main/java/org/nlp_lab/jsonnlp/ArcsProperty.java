
package org.nlp_lab.jsonnlp;

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
     * 
     * (Required)
     * 
     */
    @JsonProperty("label")
    private String lab;
    /**
     * Token Id corresponding to the governor
     * (Required)
     * 
     */
    @JsonProperty("governor")
    @JsonPropertyDescription("Token Id corresponding to the governor")
    private Integer gov;
    /**
     * Token Id corresponding to the dependent
     * 
     */
    @JsonProperty("dependent")
    @JsonPropertyDescription("Token Id corresponding to the dependent")
    private Integer dep;
    /**
     * Confidence levels of a particular attribute
     * 
     */
    @JsonProperty("scores")
    @JsonPropertyDescription("Confidence levels of a particular attribute")
    private Scores scores;


    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("label")
    public String getLabel() {
        return lab;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("label")
    public void setLabel(String label) {
        this.lab = label;
    }

    /**
     * Token Id corresponding to the governor
     * (Required)
     * 
     */
    @JsonProperty("governor")
    public Integer getGovernor() {
        return gov;
    }

    /**
     * Token Id corresponding to the governor
     * (Required)
     * 
     */
    @JsonProperty("governor")
    public void setGovernor(Integer governor) {
        this.gov = governor;
    }

    /**
     * Token Id corresponding to the dependent
     * 
     */
    @JsonProperty("dependent")
    public Integer getDependent() {
        return dep;
    }

    /**
     * Token Id corresponding to the dependent
     * 
     */
    @JsonProperty("dependent")
    public void setDependent(Integer dependent) {
        this.dep = dependent;
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
        //sb.append(((this.sentenceId == null)?"<null>":this.sentenceId));
        sb.append(',');
        sb.append("label");
        sb.append('=');
        sb.append(((this.lab == null)?"<null>":this.lab));
        sb.append(',');
        sb.append("governor");
        sb.append('=');
        sb.append(((this.gov == null)?"<null>":this.gov));
        sb.append(',');
        sb.append("dependent");
        sb.append('=');
        sb.append(((this.dep == null)?"<null>":this.dep));
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
        //result = ((result* 31)+((this.sentenceId == null)? 0 :this.sentenceId.hashCode()));
        result = ((result* 31)+((this.lab == null)? 0 :this.lab.hashCode()));
        result = ((result* 31)+((this.gov == null)? 0 :this.gov.hashCode()));
        result = ((result* 31)+((this.dep == null)? 0 :this.dep.hashCode()));
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
        return ((((((this.lab == rhs.lab)||((this.lab!= null)&&this.lab.equals(rhs.lab))))&&((this.gov == rhs.gov)||((this.gov!= null)&&this.gov.equals(rhs.gov))))&&((this.dep == rhs.dep)||((this.dep!= null)&&this.dep.equals(rhs.dep))))&&((this.scores == rhs.scores)||((this.scores!= null)&&this.scores.equals(rhs.scores))));
    }

}
