/**
 * Coreference.java
 * <p>
 * (C) 2019 by Damir Cavar
 *
 * NLP-Lab code version.
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
        "id",
        "scores",
        "representative",
        "referents"
})
public class Coreference {

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("id")
    private Integer id;
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
    @JsonProperty("representative")
    private Representative representative;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("referents")
    private List<Referent> referents = new ArrayList<>();

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
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
     *
     * (Required)
     *
     */
    @JsonProperty("representative")
    public Representative getRepresentative() {
        return representative;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("representative")
    public void setRepresentative(Representative representative) {
        this.representative = representative;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("referents")
    public List<Referent> getReferents() {
        return referents;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("referents")
    public void setReferents(List<Referent> referents) {
        this.referents = referents;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Coreference.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null) ? "<null>" : this.id));
        sb.append(',');
        sb.append("scores");
        sb.append('=');
        sb.append(((this.scores == null) ? "<null>" : this.scores));
        sb.append(',');
        sb.append("representative");
        sb.append('=');
        sb.append(((this.representative == null) ? "<null>" : this.representative));
        sb.append(',');
        sb.append("referents");
        sb.append('=');
        sb.append(((this.referents == null) ? "<null>" : this.referents));
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
        result = ((result * 31) + ((this.id == null) ? 0 : this.id.hashCode()));
        result = ((result * 31) + ((this.referents == null) ? 0 : this.referents.hashCode()));
        result = ((result * 31) + ((this.scores == null) ? 0 : this.scores.hashCode()));
        result = ((result * 31) + ((this.representative == null) ? 0 : this.representative.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Coreference)) {
            return false;
        }
        Coreference rhs = ((Coreference) other);
        return (((((this.id == rhs.id) || ((this.id != null) && this.id.equals(rhs.id))) && ((this.referents == rhs.referents) || ((this.referents != null) && this.referents.equals(rhs.referents)))) && ((this.scores == rhs.scores) || ((this.scores != null) && this.scores.equals(rhs.scores)))) && ((this.representative == rhs.representative) || ((this.representative != null) && this.representative.equals(rhs.representative))));
    }

}
