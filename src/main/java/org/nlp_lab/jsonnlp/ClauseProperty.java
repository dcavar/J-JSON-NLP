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

    @JsonProperty("root")
    @JsonPropertyDescription("Head of the clause (predicate, verb, etc.)")
    private int head;

    @JsonProperty("sentenceId")
    @JsonPropertyDescription("Id of the sentence that contains this clause")
    private int sentence_id;

    @JsonProperty("parentClauseId")
    @JsonPropertyDescription("Id of the parent clause, which is the selecting clause of a subordinate clause, for example.")
    private int dominated_by;

    @JsonProperty("dominates")
    @JsonPropertyDescription("List of clauses that this clause dominates.")
    private List<Integer> dominates = new ArrayList<>();

    @JsonProperty("type")
    @JsonPropertyDescription("Type of the clause, one of matrix, complement, relative, adverbial, adjectival, subject")
    private String type;

    @JsonProperty("tense")
    @JsonPropertyDescription("Tense of the clause, one of past, present, future, past-perfect, future-perfect")
    private String tense;

    @JsonProperty("transitivity")
    @JsonPropertyDescription("Transitivity of the clause, one of transitive, intransitive, ditransitive")
    private String transitivity;

    @JsonProperty("negated")
    @JsonPropertyDescription("Does the clause have a clause level negation")
    private boolean negated;

    @JsonProperty("clause")
    @JsonPropertyDescription("List of tokens in the clause")
    private List<Integer> clause = new ArrayList<>();


    @JsonProperty("id")
    public int getClause_id() {
        return this.clause_id;
    }

    @JsonProperty("root")
    public int getHead() {
        return this.head;
    }

    @JsonProperty("sentenceId")
    public int getSentenceId() {
        return this.sentence_id;
    }

    @JsonProperty("parentClauseId")
    public int getParentClause() {
        return this.dominated_by;
    }

    @JsonProperty("dominates")
    public List<Integer> getChildClauses() {
        return this.dominates;
    }

    @JsonProperty("type")
    public String getType() {
        return this.type;
    }

    @JsonProperty("tense")
    public String getTense() {
        return this.tense;
    }

    @JsonProperty("transitivity")
    public String getTransitivity() {
        return this.transitivity;
    }

    @JsonProperty("negated")
    public boolean isNegated() {
        return this.negated;
    }

    @JsonProperty("clause")
    public List<Integer> getClause() {
        return this.clause;
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

    @JsonProperty("type")
    public void setClausetype(String clause_type) {
        this.type = clause_type;
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
