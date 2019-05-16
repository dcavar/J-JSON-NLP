package org.nlp_lab.jsonnlp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "head",
        "semantic",
        "phrase"
})

public class ClauseProperty {
    /**
     * Head of the mainVerb
     *
     */
    @JsonProperty("head")
    @JsonPropertyDescription("Head of the mainVerb")
    private int head;

    /**
     * List of semantics
     *
     */
    @JsonProperty("semantic")
    @JsonPropertyDescription("List of semantics")
    private List<Integer> semantic = new ArrayList<Integer>();

    /**
     * List of tokens in the phrase
     *
     */
    @JsonProperty("phrase")
    @JsonPropertyDescription("List of tokens in the phrase")
    private List<Integer> phrase = new ArrayList<Integer>();

    /**
     * Head of the mainVerb
     *
     */
    @JsonProperty("head")
    public int getHead() {
        return head;
    }

    /**
     *  Head of the mainVerb
     *
     */
    @JsonProperty("head")
    public void setHead(int head) {
        this.head = head;
    }

    /**
     * List of semantics
     *
     */
    @JsonProperty("semantic")
    public List<Integer> getSemantic() {
        return semantic;
    }

    /**
     * List of semantics
     *
     */
    @JsonProperty("semantic")
    public void setSemantic(List<Integer> semantic) {
        this.semantic = semantic;
    }

    /**
     * List of tokens in the phrase
     *
     */
    @JsonProperty("phrase")
    public List<Integer> getPhrase() {
        return phrase;
    }

    /**
     * List of tokens in the phrase
     *
     */
    @JsonProperty("phrase")
    public void setPhrase(List<Integer> phrase) {
        this.phrase = phrase;
    }


}
