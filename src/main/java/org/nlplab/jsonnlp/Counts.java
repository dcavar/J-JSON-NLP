/**
 * Counts.java
 * <p>
 * (C) 2019 by Damir Cavar
 */
package org.nlplab.jsonnlp;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "tokens",
        "sentences",
        "clauses",
        "paragraphs",
        "documents",
        "entities"
})
public class Counts {

    @JsonProperty("tokens")
    private Integer tokens;
    @JsonProperty("sentences")
    private Integer sentences;
    @JsonProperty("clauses")
    private Integer clauses;
    @JsonProperty("paragraphs")
    private Integer paragraphs;
    @JsonProperty("documents")
    private Integer documents;
    @JsonProperty("entities")
    private Integer entities;

    @JsonProperty("tokens")
    public Integer getTokens() {
        return tokens;
    }

    @JsonProperty("tokens")
    public void setTokens(Integer tokens) {
        this.tokens = tokens;
    }

    @JsonProperty("sentences")
    public Integer getSentences() {
        return sentences;
    }

    @JsonProperty("sentences")
    public void setSentences(Integer sentences) {
        this.sentences = sentences;
    }

    @JsonProperty("clauses")
    public Integer getClauses() {
        return clauses;
    }

    @JsonProperty("clauses")
    public void setClauses(Integer clauses) {
        this.clauses = clauses;
    }

    @JsonProperty("paragraphs")
    public Integer getParagraphs() {
        return paragraphs;
    }

    @JsonProperty("paragraphs")
    public void setParagraphs(Integer paragraphs) {
        this.paragraphs = paragraphs;
    }

    @JsonProperty("documents")
    public Integer getDocuments() {
        return documents;
    }

    @JsonProperty("documents")
    public void setDocuments(Integer documents) {
        this.documents = documents;
    }

    @JsonProperty("entities")
    public Integer getEntities() {
        return entities;
    }

    @JsonProperty("entities")
    public void setEntities(Integer entities) {
        this.entities = entities;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Counts.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tokens");
        sb.append('=');
        sb.append(((this.tokens == null) ? "<null>" : this.tokens));
        sb.append(',');
        sb.append("sentences");
        sb.append('=');
        sb.append(((this.sentences == null) ? "<null>" : this.sentences));
        sb.append(',');
        sb.append("clauses");
        sb.append('=');
        sb.append(((this.clauses == null) ? "<null>" : this.clauses));
        sb.append(',');
        sb.append("paragraphs");
        sb.append('=');
        sb.append(((this.paragraphs == null) ? "<null>" : this.paragraphs));
        sb.append(',');
        sb.append("documents");
        sb.append('=');
        sb.append(((this.documents == null) ? "<null>" : this.documents));
        sb.append(',');
        sb.append("entities");
        sb.append('=');
        sb.append(((this.entities == null) ? "<null>" : this.entities));
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
        result = ((result * 31) + ((this.documents == null) ? 0 : this.documents.hashCode()));
        result = ((result * 31) + ((this.entities == null) ? 0 : this.entities.hashCode()));
        result = ((result * 31) + ((this.sentences == null) ? 0 : this.sentences.hashCode()));
        result = ((result * 31) + ((this.clauses == null) ? 0 : this.clauses.hashCode()));
        result = ((result * 31) + ((this.tokens == null) ? 0 : this.tokens.hashCode()));
        result = ((result * 31) + ((this.paragraphs == null) ? 0 : this.paragraphs.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Counts)) {
            return false;
        }
        Counts rhs = ((Counts) other);
        return (((((((this.documents == rhs.documents) || ((this.documents != null) && this.documents.equals(rhs.documents))) && ((this.entities == rhs.entities) || ((this.entities != null) && this.entities.equals(rhs.entities)))) && ((this.sentences == rhs.sentences) || ((this.sentences != null) && this.sentences.equals(rhs.sentences)))) && ((this.clauses == rhs.clauses) || ((this.clauses != null) && this.clauses.equals(rhs.clauses)))) && ((this.tokens == rhs.tokens) || ((this.tokens != null) && this.tokens.equals(rhs.tokens)))) && ((this.paragraphs == rhs.paragraphs) || ((this.paragraphs != null) && this.paragraphs.equals(rhs.paragraphs))));
    }

}
