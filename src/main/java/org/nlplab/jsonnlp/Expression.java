/**
 * Expression.java
 * <p>
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
        "id",
        "tokens",
        "type",
        "head",
        "alternatePhrasing",
        "dependency",
        "scores"
})
public class Expression {

    @JsonProperty("id")
    private String id;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("tokens")
    private List<Integer> tokens = new ArrayList<>();
    /**
     * Upper case
     *
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Upper case")
    private String type;
    /**
     * The Head token of this expression
     *
     */
    @JsonProperty("head")
    @JsonPropertyDescription("The Head token of this expression")
    private Integer head;
    @JsonProperty("alternatePhrasing")
    private String alternatePhrasing;
    /**
     * The dependency arc for this expression
     *
     */
    @JsonProperty("dependency")
    @JsonPropertyDescription("The dependency arc for this expression")
    private String dependency;
    /**
     * Confidence levels of a particular attribute
     *
     */
    @JsonProperty("scores")
    @JsonPropertyDescription("Confidence levels of a particular attribute")
    private Scores scores;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("tokens")
    public List<Integer> getTokens() {
        return tokens;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("tokens")
    public void setTokens(List<Integer> tokens) {
        this.tokens = tokens;
    }

    /**
     * Upper case
     *
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Upper case
     *
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * The Head token of this expression
     *
     */
    @JsonProperty("head")
    public Integer getHead() {
        return head;
    }

    /**
     * The Head token of this expression
     *
     */
    @JsonProperty("head")
    public void setHead(Integer head) {
        this.head = head;
    }

    @JsonProperty("alternatePhrasing")
    public String getAlternatePhrasing() {
        return alternatePhrasing;
    }

    @JsonProperty("alternatePhrasing")
    public void setAlternatePhrasing(String alternatePhrasing) {
        this.alternatePhrasing = alternatePhrasing;
    }

    /**
     * The dependency arc for this expression
     *
     */
    @JsonProperty("dependency")
    public String getDependency() {
        return dependency;
    }

    /**
     * The dependency arc for this expression
     *
     */
    @JsonProperty("dependency")
    public void setDependency(String dependency) {
        this.dependency = dependency;
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
        sb.append(Expression.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null) ? "<null>" : this.id));
        sb.append(',');
        sb.append("tokens");
        sb.append('=');
        sb.append(((this.tokens == null) ? "<null>" : this.tokens));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null) ? "<null>" : this.type));
        sb.append(',');
        sb.append("head");
        sb.append('=');
        sb.append(((this.head == null) ? "<null>" : this.head));
        sb.append(',');
        sb.append("alternatePhrasing");
        sb.append('=');
        sb.append(((this.alternatePhrasing == null) ? "<null>" : this.alternatePhrasing));
        sb.append(',');
        sb.append("dependency");
        sb.append('=');
        sb.append(((this.dependency == null) ? "<null>" : this.dependency));
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
        result = ((result * 31) + ((this.head == null) ? 0 : this.head.hashCode()));
        result = ((result * 31) + ((this.dependency == null) ? 0 : this.dependency.hashCode()));
        result = ((result * 31) + ((this.scores == null) ? 0 : this.scores.hashCode()));
        result = ((result * 31) + ((this.tokens == null) ? 0 : this.tokens.hashCode()));
        result = ((result * 31) + ((this.id == null) ? 0 : this.id.hashCode()));
        result = ((result * 31) + ((this.alternatePhrasing == null) ? 0 : this.alternatePhrasing.hashCode()));
        result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Expression)) {
            return false;
        }
        Expression rhs = ((Expression) other);
        return ((((((((this.head == rhs.head) || ((this.head != null) && this.head.equals(rhs.head))) && ((this.dependency == rhs.dependency) || ((this.dependency != null) && this.dependency.equals(rhs.dependency)))) && ((this.scores == rhs.scores) || ((this.scores != null) && this.scores.equals(rhs.scores)))) && ((this.tokens == rhs.tokens) || ((this.tokens != null) && this.tokens.equals(rhs.tokens)))) && ((this.id == rhs.id) || ((this.id != null) && this.id.equals(rhs.id)))) && ((this.alternatePhrasing == rhs.alternatePhrasing) || ((this.alternatePhrasing != null) && this.alternatePhrasing.equals(rhs.alternatePhrasing)))) && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type))));
    }

}
