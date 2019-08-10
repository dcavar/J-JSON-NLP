/**
 * Representative.java
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
        "head",
        "entity",
        "tokens"
})
public class Representative {

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("head")
    private Integer head;
    /**
     * What type of entity is this
     *
     */
    @JsonProperty("entity")
    @JsonPropertyDescription("What type of entity is this")
    private String entity;
    /**
     * Token id lists cannot be empty
     * (Required)
     *
     */
    @JsonProperty("tokens")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("Token id lists cannot be empty")
    private Set<Integer> tokens = new LinkedHashSet<>();

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("head")
    public Integer getHead() {
        return head;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("head")
    public void setHead(Integer head) {
        this.head = head;
    }

    /**
     * What type of entity is this
     *
     */
    @JsonProperty("entity")
    public String getEntity() {
        return entity;
    }

    /**
     * What type of entity is this
     *
     */
    @JsonProperty("entity")
    public void setEntity(String entity) {
        this.entity = entity;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Representative.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("head");
        sb.append('=');
        sb.append(((this.head == null) ? "<null>" : this.head));
        sb.append(',');
        sb.append("entity");
        sb.append('=');
        sb.append(((this.entity == null) ? "<null>" : this.entity));
        sb.append(',');
        sb.append("tokens");
        sb.append('=');
        sb.append(((this.tokens == null) ? "<null>" : this.tokens));
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
        result = ((result * 31) + ((this.tokens == null) ? 0 : this.tokens.hashCode()));
        result = ((result * 31) + ((this.entity == null) ? 0 : this.entity.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Representative)) {
            return false;
        }
        Representative rhs = ((Representative) other);
        return ((((this.head == rhs.head) || ((this.head != null) && this.head.equals(rhs.head))) && ((this.tokens == rhs.tokens) || ((this.tokens != null) && this.tokens.equals(rhs.tokens)))) && ((this.entity == rhs.entity) || ((this.entity != null) && this.entity.equals(rhs.entity))));
    }

}
