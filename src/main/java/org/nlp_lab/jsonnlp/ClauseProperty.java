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
        //"semantic",
        //"phrase"
        "clause_id",
        "dominated_by",
        "clause_type",
        "clause"

})

//public int clause_id;
//public int head;
//public int dominated_by;
//public String clause_type;
//public List<Integer> clause = new ArrayList<>();


public class ClauseProperty {

    @JsonProperty("id")
    @JsonPropertyDescription("Id of the Clause")
    private int clause_id;

    @JsonProperty("head")
    @JsonPropertyDescription("Head of the clause (predicate, verb, etc.)")
    private int head;

    @JsonProperty("sentenceId")
    @JsonPropertyDescription("Id of the parent clause")
    private int dominated_by;

    @JsonProperty("dominates")
    @JsonPropertyDescription("List of clauses that a clause dominates")
    private List<Integer> dominates = new ArrayList<>();

    @JsonProperty("clause_type")
    @JsonPropertyDescription("Type of the clause")
    private String clause_type;

    @JsonProperty("clause")
    @JsonPropertyDescription("List of tokens in the clause")
    private List<Integer> clause = new ArrayList<>();

    @JsonProperty("clause")
    @JsonPropertyDescription("List of tokens in the clause")
    private List<Integer> clause = new ArrayList<>();

    @JsonProperty("clause_id")
    public int getClause_id() {
        return this.clause_id;
    }

    @JsonProperty("head")
    public int getHead() {
        return head;
    }

    @JsonProperty("dominated_by")
    public int getParentClause() {
        return dominated_by;
    }

    @JsonProperty("clause_type")
    public String getClausetype() {
        return clause_type;
    }

    @JsonProperty("clause")
    public List<Integer> getClause() {
        return clause;
    }

    @JsonProperty("clause_id")
    public void setClause_id(int clause_id ) {
        this.clause_id = clause_id;
    }

    @JsonProperty("head")
    public void setHead( int head) {
        this.head = head;
    }

    @JsonProperty("dominated_by")
    public void setParentClause(int dominated_by) {
        this.dominated_by = dominated_by;
    }

    @JsonProperty("dominates")
    public void addChildClause(int dominates) {
        this.dominates.add(dominates);
    }

    @JsonProperty("clause_type")
    public void setClausetype(String clause_type) {
        this.clause_type = clause_type;
    }

    @JsonProperty("clause")
    public void setClause( List<Integer> clause) {
        this.clause = clause;
        //for(int i=0;i<clause.size();i++) {
        //    this.clause.add(clause.get(i));
        //}
    }

    /*    /**
     * Head of the mainVerb
     *

  //  @JsonProperty("head")
  //  @JsonPropertyDescription("Head of the mainVerb")
    private int head;

    /**
     * List of semantics
     *

    @JsonProperty("semantic")
    @JsonPropertyDescription("List of semantics")
    private List<Integer> semantic = new ArrayList<Integer>();

    /**
     * List of tokens in the phrase
     *

    @JsonProperty("phrase")
    @JsonPropertyDescription("List of tokens in the phrase")
    private List<Integer> phrase = new ArrayList<Integer>();

    /**
     * Head of the mainVerb
     *

    @JsonProperty("head")
    public int getHead() {
        return head;
    }

    /**
     *  Head of the mainVerb
     *

    @JsonProperty("head")
    public void setHead(int head) {
        this.head = head;
    }

    /**
     * List of semantics
     *

    @JsonProperty("semantic")
    public List<Integer> getSemantic() {
        return semantic;
    }

    /**
     * List of semantics
     *

    @JsonProperty("semantic")
    public void setSemantic(List<Integer> semantic) {
        this.semantic = semantic;
    }

    /**
     * List of tokens in the phrase
     *

    @JsonProperty("phrase")
    public List<Integer> getPhrase() {
        return phrase;
    }

    /**
     * List of tokens in the phrase
     *

    @JsonProperty("phrase")
    public void setPhrase(List<Integer> phrase) {
        this.phrase = phrase;
    }

*/
}
