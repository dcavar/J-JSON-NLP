/**
 * Constituent.java
 * (C) 2019 by Damir Cavar
 */
package org.nlplab.jsonnlp;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "scores",
        "sentenceId",
        "labeledBracketing",
        "enumeratedLabeledBracketing",
        "nodes"
})
public class Constituent {

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
    @JsonProperty("sentenceId")
    private Integer sentenceId;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("labeledBracketing")
    private String labeledBracketing;
    @JsonProperty("enumeratedLabeledBracketing")
    private String enumeratedLabeledBracketing;
    @JsonProperty("nodes")
    private List<Node> nodes = new ArrayList<>();

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
     *
     * (Required)
     *
     */
    @JsonProperty("sentenceId")
    public Integer getSentenceId() {
        return sentenceId;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("sentenceId")
    public void setSentenceId(Integer sentenceId) {
        this.sentenceId = sentenceId;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("labeledBracketing")
    public String getLabeledBracketing() {
        return labeledBracketing;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("labeledBracketing")
    public void setLabeledBracketing(String labeledBracketing) {
        this.labeledBracketing = labeledBracketing;
    }

    @JsonProperty("enumeratedLabeledBracketing")
    public String getEnumeratedLabeledBracketing() {
        return enumeratedLabeledBracketing;
    }

    @JsonProperty("enumeratedLabeledBracketing")
    public void setEnumeratedLabeledBracketing(String enumeratedLabeledBracketing) {
        this.enumeratedLabeledBracketing = enumeratedLabeledBracketing;
    }

    @JsonProperty("nodes")
    public List<Node> getNodes() {
        return nodes;
    }

    @JsonProperty("nodes")
    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Constituent.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scores");
        sb.append('=');
        sb.append(((this.scores == null) ? "<null>" : this.scores));
        sb.append(',');
        sb.append("sentenceId");
        sb.append('=');
        sb.append(((this.sentenceId == null) ? "<null>" : this.sentenceId));
        sb.append(',');
        sb.append("labeledBracketing");
        sb.append('=');
        sb.append(((this.labeledBracketing == null) ? "<null>" : this.labeledBracketing));
        sb.append(',');
        sb.append("enumeratedLabeledBracketing");
        sb.append('=');
        sb.append(((this.enumeratedLabeledBracketing == null) ? "<null>" : this.enumeratedLabeledBracketing));
        sb.append(',');
        sb.append("nodes");
        sb.append('=');
        sb.append(((this.nodes == null) ? "<null>" : this.nodes));
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
        result = ((result * 31) + ((this.enumeratedLabeledBracketing == null) ? 0 : this.enumeratedLabeledBracketing.hashCode()));
        result = ((result * 31) + ((this.sentenceId == null) ? 0 : this.sentenceId.hashCode()));
        result = ((result * 31) + ((this.nodes == null) ? 0 : this.nodes.hashCode()));
        result = ((result * 31) + ((this.scores == null) ? 0 : this.scores.hashCode()));
        result = ((result * 31) + ((this.labeledBracketing == null) ? 0 : this.labeledBracketing.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Constituent)) {
            return false;
        }
        Constituent rhs = ((Constituent) other);
        return ((((((this.enumeratedLabeledBracketing == rhs.enumeratedLabeledBracketing) || ((this.enumeratedLabeledBracketing != null) && this.enumeratedLabeledBracketing.equals(rhs.enumeratedLabeledBracketing))) && ((this.sentenceId == rhs.sentenceId) || ((this.sentenceId != null) && this.sentenceId.equals(rhs.sentenceId)))) && ((this.nodes == rhs.nodes) || ((this.nodes != null) && this.nodes.equals(rhs.nodes)))) && ((this.scores == rhs.scores) || ((this.scores != null) && this.scores.equals(rhs.scores)))) && ((this.labeledBracketing == rhs.labeledBracketing) || ((this.labeledBracketing != null) && this.labeledBracketing.equals(rhs.labeledBracketing))));
    }

}
