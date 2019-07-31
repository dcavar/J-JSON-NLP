/**
 * ClauseProperty.java
 * (C) 2019 by Damir Cavar, Anurag Kumar
 */

package org.nlp_lab.jsonnlp;

import java.util.ArrayList;
import java.util.List;
//import java.util.HashMap;
//import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "root",
    "parentClauseId",
    "dominates",
    "type",
    "tense",
    "transitivity",
    "negated",
    "clause"
})


public class ClauseProperty {

    @JsonProperty("id")
    @JsonPropertyDescription("Id of the Clause")
    private int clause_id;

    @JsonProperty("root")
    @JsonPropertyDescription("Head of the clause (predicate, verb, etc.)")
    private int head;

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

    @JsonProperty("id")
    public void setClause_id(int clause_id ) {
        this.clause_id = clause_id;
    }

    @JsonProperty("root")
    public void setHead( int head) {
        this.head = head;
    }

    @JsonProperty("parentClauseId")
    public void setParentClause(int dominated_by) {
        this.dominated_by = dominated_by;
    }

    @JsonProperty("dominates")
    public void setChildClause(int dominates) {
        this.dominates.add(dominates);
    }

    @JsonProperty("dominates")
    public void setChildClause(List<Integer> dominates) {
        this.dominates = dominates;
    }

    @JsonProperty("type")
    public void setType(String clause_type) {
        this.type = clause_type;
    }

    @JsonProperty("tense")
    public void setTense(String tense) {
        this.tense = tense;
    }
    
    @JsonProperty("transitivity")
    public void setTransitivity(String transitivity) {
        this.transitivity = transitivity;
    }

    @JsonProperty("negated")
    public void setNegation(boolean negated) {
        this.negated = negated;
    }

    @JsonProperty("clause")
    public void setClause( List<Integer> clause) {
        this.clause = clause;
    }

}
