/**
 * Label.java
 *
 * (C) 2019 by Damir Cavar
 *
 * NLP-Lab code base.
 */

package org.nlplab.jsonnlp;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "type",
        "label",
        "scores"
})

public class Label {

    /**
     * (Required)
     */
    @JsonProperty("type")
    private String type;
    /**
     * (Required)
     */
    @JsonProperty("label")
    private String label;
    /**
     * Confidence levels of a particular attribute
     */
    @JsonProperty("scores")
    @JsonPropertyDescription("Confidence levels of a particular attribute")
    private Scores scores;

    /**
     * (Required)
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * (Required)
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * (Required)
     */
    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    /**
     * (Required)
     */
    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
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
        sb.append(Label.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null) ? "<null>" : this.type));
        sb.append(',');
        sb.append("label");
        sb.append('=');
        sb.append(((this.label == null) ? "<null>" : this.label));
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
        result = ((result * 31) + ((this.label == null) ? 0 : this.label.hashCode()));
        result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
        result = ((result * 31) + ((this.scores == null) ? 0 : this.scores.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Label)) {
            return false;
        }
        Label rhs = ((Label) other);
        return ((((this.label == rhs.label) || ((this.label != null) && this.label.equals(rhs.label))) && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type)))) && ((this.scores == rhs.scores) || ((this.scores != null) && this.scores.equals(rhs.scores))));
    }

}
