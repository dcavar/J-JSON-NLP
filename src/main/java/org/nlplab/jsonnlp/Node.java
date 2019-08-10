/**
 * Node.java
 * <p>
 * (C) 2019 by Damir Cavar
 */


package org.nlplab.jsonnlp;

import java.util.LinkedHashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "tokenId",
        "label",
        "children",
        "dominates",
        "precedes",
        "scopes",
        "cCommands",
        "mCommands",
        "binds",
        "governs",
        "scores"
})
public class Node {

    /**
     * Enumerated id of this node
     * (Required)
     *
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Enumerated id of this node")
    private Integer id;
    /**
     * -1 if not a token
     * (Required)
     *
     */
    @JsonProperty("tokenId")
    @JsonPropertyDescription("-1 if not a token")
    private Integer tokenId;
    /**
     * The syntactic label of this node. Blank if a token
     * (Required)
     *
     */
    @JsonProperty("label")
    @JsonPropertyDescription("The syntactic label of this node. Blank if a token")
    private String label;
    /**
     * Node id lists can be empty
     * (Required)
     *
     */
    @JsonProperty("children")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("Node id lists can be empty")
    private Set<Integer> children = new LinkedHashSet<>();
    /**
     * Node id lists can be empty
     *
     */
    @JsonProperty("dominates")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("Node id lists can be empty")
    private Set<Integer> dominates = new LinkedHashSet<>();
    /**
     * Node id lists can be empty
     *
     */
    @JsonProperty("precedes")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("Node id lists can be empty")
    private Set<Integer> precedes = new LinkedHashSet<>();
    /**
     * Node id lists can be empty
     *
     */
    @JsonProperty("scopes")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("Node id lists can be empty")
    private Set<Integer> scopes = new LinkedHashSet<>();
    /**
     * Node id lists can be empty
     *
     */
    @JsonProperty("cCommands")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("Node id lists can be empty")
    private Set<Integer> cCommands = new LinkedHashSet<>();
    /**
     * Node id lists can be empty
     *
     */
    @JsonProperty("mCommands")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("Node id lists can be empty")
    private Set<Integer> mCommands = new LinkedHashSet<>();
    /**
     * Node id lists can be empty
     *
     */
    @JsonProperty("binds")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("Node id lists can be empty")
    private Set<Integer> binds = new LinkedHashSet<>();
    /**
     * Node id lists can be empty
     *
     */
    @JsonProperty("governs")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("Node id lists can be empty")
    private Set<Integer> governs = new LinkedHashSet<>();
    /**
     * Confidence levels of a particular attribute
     *
     */
    @JsonProperty("scores")
    @JsonPropertyDescription("Confidence levels of a particular attribute")
    private Scores scores;

    /**
     * Enumerated id of this node
     * (Required)
     *
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * Enumerated id of this node
     * (Required)
     *
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * -1 if not a token
     * (Required)
     *
     */
    @JsonProperty("tokenId")
    public Integer getTokenId() {
        return tokenId;
    }

    /**
     * -1 if not a token
     * (Required)
     *
     */
    @JsonProperty("tokenId")
    public void setTokenId(Integer tokenId) {
        this.tokenId = tokenId;
    }

    /**
     * The syntactic label of this node. Blank if a token
     * (Required)
     *
     */
    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    /**
     * The syntactic label of this node. Blank if a token
     * (Required)
     *
     */
    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Node id lists can be empty
     * (Required)
     *
     */
    @JsonProperty("children")
    public Set<Integer> getChildren() {
        return children;
    }

    /**
     * Node id lists can be empty
     * (Required)
     *
     */
    @JsonProperty("children")
    public void setChildren(Set<Integer> children) {
        this.children = children;
    }

    /**
     * Node id lists can be empty
     *
     */
    @JsonProperty("dominates")
    public Set<Integer> getDominates() {
        return dominates;
    }

    /**
     * Node id lists can be empty
     *
     */
    @JsonProperty("dominates")
    public void setDominates(Set<Integer> dominates) {
        this.dominates = dominates;
    }

    /**
     * Node id lists can be empty
     *
     */
    @JsonProperty("precedes")
    public Set<Integer> getPrecedes() {
        return precedes;
    }

    /**
     * Node id lists can be empty
     *
     */
    @JsonProperty("precedes")
    public void setPrecedes(Set<Integer> precedes) {
        this.precedes = precedes;
    }

    /**
     * Node id lists can be empty
     *
     */
    @JsonProperty("scopes")
    public Set<Integer> getScopes() {
        return scopes;
    }

    /**
     * Node id lists can be empty
     *
     */
    @JsonProperty("scopes")
    public void setScopes(Set<Integer> scopes) {
        this.scopes = scopes;
    }

    /**
     * Node id lists can be empty
     *
     */
    @JsonProperty("cCommands")
    public Set<Integer> getcCommands() {
        return cCommands;
    }

    /**
     * Node id lists can be empty
     *
     */
    @JsonProperty("cCommands")
    public void setcCommands(Set<Integer> cCommands) {
        this.cCommands = cCommands;
    }

    /**
     * Node id lists can be empty
     *
     */
    @JsonProperty("mCommands")
    public Set<Integer> getmCommands() {
        return mCommands;
    }

    /**
     * Node id lists can be empty
     *
     */
    @JsonProperty("mCommands")
    public void setmCommands(Set<Integer> mCommands) {
        this.mCommands = mCommands;
    }

    /**
     * Node id lists can be empty
     *
     */
    @JsonProperty("binds")
    public Set<Integer> getBinds() {
        return binds;
    }

    /**
     * Node id lists can be empty
     *
     */
    @JsonProperty("binds")
    public void setBinds(Set<Integer> binds) {
        this.binds = binds;
    }

    /**
     * Node id lists can be empty
     *
     */
    @JsonProperty("governs")
    public Set<Integer> getGoverns() {
        return governs;
    }

    /**
     * Node id lists can be empty
     *
     */
    @JsonProperty("governs")
    public void setGoverns(Set<Integer> governs) {
        this.governs = governs;
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
        sb.append(Node.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null) ? "<null>" : this.id));
        sb.append(',');
        sb.append("tokenId");
        sb.append('=');
        sb.append(((this.tokenId == null) ? "<null>" : this.tokenId));
        sb.append(',');
        sb.append("label");
        sb.append('=');
        sb.append(((this.label == null) ? "<null>" : this.label));
        sb.append(',');
        sb.append("children");
        sb.append('=');
        sb.append(((this.children == null) ? "<null>" : this.children));
        sb.append(',');
        sb.append("dominates");
        sb.append('=');
        sb.append(((this.dominates == null) ? "<null>" : this.dominates));
        sb.append(',');
        sb.append("precedes");
        sb.append('=');
        sb.append(((this.precedes == null) ? "<null>" : this.precedes));
        sb.append(',');
        sb.append("scopes");
        sb.append('=');
        sb.append(((this.scopes == null) ? "<null>" : this.scopes));
        sb.append(',');
        sb.append("cCommands");
        sb.append('=');
        sb.append(((this.cCommands == null) ? "<null>" : this.cCommands));
        sb.append(',');
        sb.append("mCommands");
        sb.append('=');
        sb.append(((this.mCommands == null) ? "<null>" : this.mCommands));
        sb.append(',');
        sb.append("binds");
        sb.append('=');
        sb.append(((this.binds == null) ? "<null>" : this.binds));
        sb.append(',');
        sb.append("governs");
        sb.append('=');
        sb.append(((this.governs == null) ? "<null>" : this.governs));
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
        result = ((result * 31) + ((this.binds == null) ? 0 : this.binds.hashCode()));
        result = ((result * 31) + ((this.tokenId == null) ? 0 : this.tokenId.hashCode()));
        result = ((result * 31) + ((this.dominates == null) ? 0 : this.dominates.hashCode()));
        result = ((result * 31) + ((this.scores == null) ? 0 : this.scores.hashCode()));
        result = ((result * 31) + ((this.mCommands == null) ? 0 : this.mCommands.hashCode()));
        result = ((result * 31) + ((this.precedes == null) ? 0 : this.precedes.hashCode()));
        result = ((result * 31) + ((this.label == null) ? 0 : this.label.hashCode()));
        result = ((result * 31) + ((this.cCommands == null) ? 0 : this.cCommands.hashCode()));
        result = ((result * 31) + ((this.children == null) ? 0 : this.children.hashCode()));
        result = ((result * 31) + ((this.governs == null) ? 0 : this.governs.hashCode()));
        result = ((result * 31) + ((this.id == null) ? 0 : this.id.hashCode()));
        result = ((result * 31) + ((this.scopes == null) ? 0 : this.scopes.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Node)) {
            return false;
        }
        Node rhs = ((Node) other);
        return (((((((((((((this.binds == rhs.binds) || ((this.binds != null) && this.binds.equals(rhs.binds))) && ((this.tokenId == rhs.tokenId) || ((this.tokenId != null) && this.tokenId.equals(rhs.tokenId)))) && ((this.dominates == rhs.dominates) || ((this.dominates != null) && this.dominates.equals(rhs.dominates)))) && ((this.scores == rhs.scores) || ((this.scores != null) && this.scores.equals(rhs.scores)))) && ((this.mCommands == rhs.mCommands) || ((this.mCommands != null) && this.mCommands.equals(rhs.mCommands)))) && ((this.precedes == rhs.precedes) || ((this.precedes != null) && this.precedes.equals(rhs.precedes)))) && ((this.label == rhs.label) || ((this.label != null) && this.label.equals(rhs.label)))) && ((this.cCommands == rhs.cCommands) || ((this.cCommands != null) && this.cCommands.equals(rhs.cCommands)))) && ((this.children == rhs.children) || ((this.children != null) && this.children.equals(rhs.children)))) && ((this.governs == rhs.governs) || ((this.governs != null) && this.governs.equals(rhs.governs)))) && ((this.id == rhs.id) || ((this.id != null) && this.id.equals(rhs.id)))) && ((this.scopes == rhs.scopes) || ((this.scopes != null) && this.scopes.equals(rhs.scopes))));
    }

}
