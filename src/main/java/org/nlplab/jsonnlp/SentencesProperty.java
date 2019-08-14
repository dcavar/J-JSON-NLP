/*
 * SentencesProperty.java
 * <p>
 * (C) 2019 by Damir Cavar
 */


package org.nlplab.jsonnlp;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "text",
        "translations",
        "mainVerb",
        "subject",
        "object",
        "tokenFrom",
        "tokenTo",
        "tokens",
        "clauses",
        "labels",
        "complex",
        "type",
        "embeddings",
        "features",
        "scores",
        "conllId",
        "root",
        "compound",
        "transitivity",
        "negated"
})
public class SentencesProperty {

    /**
     * Unique sentence ID
     *
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Unique sentence ID")
    private int id;
    /**
     * The text of this sentence
     *
     */
    @JsonProperty("text")
    @JsonPropertyDescription("The text of this sentence")
    private String text;
    @JsonProperty("translations")
    private List<Translation> translations = new ArrayList<>();
    /**
     * Token Ids corresponding to the main verb
     *
     */
    @JsonProperty("mainVerb")
    @JsonPropertyDescription("Token Ids corresponding to the main verb")
    //private List<Integer> mainVerb = new ArrayList<Integer>();
    private ClauseProperty mainVerb = new ClauseProperty();
    /**
     * Token Ids corresponding to the subject
     *
     */
    @JsonProperty("subject")
    @JsonPropertyDescription("Token Ids corresponding to the subject")
    private ClauseProperty subject = new ClauseProperty();
    /**
     * Token Ids corresponding to the object
     *
     */
    @JsonProperty("object")
    @JsonPropertyDescription("Token Ids corresponding to the object")
    private ClauseProperty object = new ClauseProperty();
    /**
     * Start token, inclusive
     * (Required)
     *
     */
    @JsonProperty("tokenFrom")
    @JsonPropertyDescription("Start token, inclusive")
    private Integer tokenFrom;
    /**
     * End token, exclusive
     * (Required)
     *
     */
    @JsonProperty("tokenTo")
    @JsonPropertyDescription("End token, exclusive")
    private Integer tokenTo;
    /**
     * Token id lists cannot be empty
     *
     */
    @JsonProperty("tokens")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("Token id lists cannot be empty")
    private Set<Integer> tokens = new LinkedHashSet<>();

    @JsonProperty("clauses")
    @JsonPropertyDescription("List of clauses in the sentence")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<ClauseProperty> clauses = new ArrayList<>();

    /**
     * Classification labels applied to a given section
     *
     */
    @JsonProperty("labels")
    @JsonPropertyDescription("Classification labels applied to a given section")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<Label> labels = new ArrayList<>();
    @JsonProperty("complex")
    private Boolean complex = false;
    @JsonProperty("type")
    private String type;
    @JsonProperty("conllId")
    private String conllId;
    /**
     * Allow for embeddings from multiple sources
     *
     */
    @JsonProperty("embeddings")
    @JsonPropertyDescription("Allow for embeddings from multiple sources")
    private List<Embedding> embeddings = new ArrayList<>();
    /**
     * Linguistic features, corresponding to the ConLL format
     *
     */
    @JsonProperty("features")
    @JsonPropertyDescription("Linguistic features, corresponding to the ConLL format")
    private Map<String, String> features = new HashMap<>();
    /**
     * Confidence levels of a particular attribute
     *
     */
    @JsonProperty("scores")
    @JsonPropertyDescription("Confidence levels of a particular attribute")
    private Scores scores;

    /**
     * Root of the sentence
     *
     */
    @JsonProperty("root")
    @JsonPropertyDescription("Root of the sentence")
    private int root;

    /**
     * Root of the sentence
     *
     */
    @JsonProperty("root")
    public int getRoot() {
        return root;
    }


    /**
     *  Root of the sentence
     *
     */
    @JsonProperty("root")
    public void setRoot(int root) {
        this.root = root;
    }

    /**
     * Boolean type of sentence
     *
     */
    @JsonProperty("compound")
    @JsonPropertyDescription("Boolean type of sentence")
    private boolean compound;

    /**
     * Boolean type of sentence
     *
     */
    @JsonProperty("compound")
    public boolean getCompound() {
        return compound;
    }

    /**
     *  Boolean type of sentence
     *
     */
    @JsonProperty("compound")
    public void setCompound(boolean compound) {
        this.compound = compound;
    }

    @JsonProperty("transitivity")
    @JsonPropertyDescription("Clause type1")
    private String transitivity;

    @JsonProperty("transitivity")
    public String getTransitivity() {
        return transitivity;
    }

    @JsonProperty("transitivity")
    public void setTransitivity(String transitivity) {
        this.transitivity = transitivity;
    }

    @JsonProperty("negated")
    @JsonPropertyDescription("Clause type2")
    private boolean negated;

    @JsonProperty("negated")
    public boolean getNegated() {
        return negated;
    }

    @JsonProperty("negated")
    public void setNegated(boolean negated) {
        this.negated = negated;
    }

    /**
     * Unique sentence ID
     *
     */
    @JsonProperty("id")
    public int getId() {
        return id;
    }

    /**
     * Unique sentence ID
     *
     */
    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    /**
     * The text of this sentence
     *
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * The text of this sentence
     *
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("translations")
    public List<Translation> getTranslations() {
        return translations;
    }

    @JsonProperty("translations")
    public void setTranslations(List<Translation> translations) {
        this.translations = translations;
    }

    /**
     * Token Ids corresponding to the main verb
     *
     */

    @JsonProperty("mainVerb")
    public ClauseProperty getMainVerb() {
        return mainVerb;
    }

    /**
     * Token Ids corresponding to the main verb
     *
     */
    @JsonProperty("mainVerb")
    public void setMainVerb(ClauseProperty mainVerb) {
        this.mainVerb = mainVerb;
    }


    /**
     * Token Ids corresponding to the subject
     *
     */
    @JsonProperty("subject")
    public ClauseProperty getSubject() {
        return subject;
    }

    /**
     * Token Ids corresponding to the subject
     *
     */
    @JsonProperty("subject")
    public void setSubject(ClauseProperty subject) {
        this.subject = subject;
    }

    /**
     * Token Ids corresponding to the object
     *
     */
    @JsonProperty("object")
    public ClauseProperty getObject() {
        return object;
    }

    /**
     * Token Ids corresponding to the object
     *
     */
    @JsonProperty("object")
    public void setObject(ClauseProperty object) {
        this.object = object;
    }

    /**
     * Start token, inclusive
     * (Required)
     *
     */
    @JsonProperty("tokenFrom")
    public Integer getTokenFrom() {
        return tokenFrom;
    }

    /**
     * Start token, inclusive
     * (Required)
     *
     */
    @JsonProperty("tokenFrom")
    public void setTokenFrom(Integer tokenFrom) {
        this.tokenFrom = tokenFrom;
    }

    /**
     * End token, exclusive
     * (Required)
     *
     */
    @JsonProperty("tokenTo")
    public Integer getTokenTo() {
        return tokenTo;
    }

    /**
     * End token, exclusive
     * (Required)
     *
     */
    @JsonProperty("tokenTo")
    public void setTokenTo(Integer tokenTo) {
        this.tokenTo = tokenTo;
    }

    /**
     * Token id lists cannot be empty
     *
     */
    @JsonProperty("tokens")
    public Set<Integer> getTokens() {
        return tokens;
    }

    /**
     * Token id lists cannot be empty
     *
     */
    @JsonProperty("tokens")
    public void setTokens(Set<Integer> tokens) {
        this.tokens = tokens;
    }

    @JsonProperty("clauses")
    public List<ClauseProperty> getClauses() {
        return clauses;
    }

    @JsonProperty("clauses")
    public void setClauses(List<ClauseProperty> clauses) {
        this.clauses = clauses;

    }

    public void InitClause() {
        if (this.clauses == null) {
            List<ClauseProperty> c = new ArrayList<>();
            this.clauses = c;
        }
    }

    /**
     * Classification labels applied to a given section
     *
     */
    @JsonProperty("labels")
    public List<Label> getLabels() {
        return labels;
    }

    /**
     * Classification labels applied to a given section
     *
     */
    @JsonProperty("labels")
    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    @JsonProperty("complex")
    public Boolean getComplex() {
        return complex;
    }

    @JsonProperty("complex")
    public void setComplex(Boolean complex) {
        this.complex = complex;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Allow for embeddings from multiple sources
     *
     */
    @JsonProperty("embeddings")
    public List<Embedding> getEmbeddings() {
        return embeddings;
    }

    /**
     * Allow for embeddings from multiple sources
     *
     */
    @JsonProperty("embeddings")
    public void setEmbeddings(List<Embedding> embeddings) {
        this.embeddings = embeddings;
    }

    /**
     * Linguistic features, corresponding to the ConLL format
     *
     */
    @JsonProperty("features")
    public Map<String, String> getFeatures() {
        return features;
    }

    /**
     * Linguistic features, corresponding to the ConLL format
     *
     */
    @JsonProperty("features")
    public void setFeatures(Map<String, String> features) {
        this.features = features;
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
     * conllId
     *
     */
    @JsonProperty("conllId")
    public void setConllId(String conllId) {
        this.conllId = conllId;
    }

    /**
     * conllId
     *
     */
    @JsonProperty("conllId")
    public String getConllId() {
        return conllId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SentencesProperty.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(this.id);
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null) ? "<null>" : this.text));
        sb.append(',');
        sb.append("translations");
        sb.append('=');
        sb.append(((this.translations == null) ? "<null>" : this.translations));
        sb.append(',');
        sb.append("mainVerb");
        sb.append('=');
        sb.append(((this.mainVerb == null) ? "<null>" : this.mainVerb));
        sb.append(',');
        sb.append("subject");
        sb.append('=');
        sb.append(((this.subject == null) ? "<null>" : this.subject));
        sb.append(',');
        sb.append("object");
        sb.append('=');
        sb.append(((this.object == null) ? "<null>" : this.object));
        sb.append(',');
        sb.append("tokenFrom");
        sb.append('=');
        sb.append(((this.tokenFrom == null) ? "<null>" : this.tokenFrom));
        sb.append(',');
        sb.append("tokenTo");
        sb.append('=');
        sb.append(((this.tokenTo == null) ? "<null>" : this.tokenTo));
        sb.append(',');
        sb.append("tokens");
        sb.append('=');
        sb.append(((this.tokens == null) ? "<null>" : this.tokens));
        sb.append(',');
        sb.append("clauses");
        sb.append('=');
        sb.append(((this.clauses == null) ? "<null>" : this.clauses));
        sb.append(',');
        sb.append("labels");
        sb.append('=');
        sb.append(((this.labels == null) ? "<null>" : this.labels));
        sb.append(',');
        sb.append("complex");
        sb.append('=');
        sb.append(((this.complex == null) ? "<null>" : this.complex));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null) ? "<null>" : this.type));
        sb.append(',');
        sb.append("embeddings");
        sb.append('=');
        sb.append(((this.embeddings == null) ? "<null>" : this.embeddings));
        sb.append(',');
        sb.append("features");
        sb.append('=');
        sb.append(((this.features == null) ? "<null>" : this.features));
        sb.append(',');
        sb.append("scores");
        sb.append('=');
        sb.append(((this.scores == null) ? "<null>" : this.scores));
        sb.append(',');
        sb.append("conllId");
        sb.append('=');
        sb.append(((this.conllId == null) ? "<null>" : this.conllId));
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
        result = ((result * 31) + ((this.embeddings == null) ? 0 : this.embeddings.hashCode()));
        result = ((result * 31) + ((this.tokenTo == null) ? 0 : this.tokenTo.hashCode()));
        result = ((result * 31) + ((this.scores == null) ? 0 : this.scores.hashCode()));
        result = ((result * 31) + ((this.subject == null) ? 0 : this.subject.hashCode()));
        result = ((result * 31) + ((this.clauses == null) ? 0 : this.clauses.hashCode()));
        result = ((result * 31) + ((this.tokenFrom == null) ? 0 : this.tokenFrom.hashCode()));
        result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
        result = ((result * 31) + ((this.labels == null) ? 0 : this.labels.hashCode()));
        result = ((result * 31) + ((this.features == null) ? 0 : this.features.hashCode()));
        result = ((result * 31) + ((this.translations == null) ? 0 : this.translations.hashCode()));
        result = ((result * 31) + ((this.complex == null) ? 0 : this.complex.hashCode()));
        result = ((result * 31) + ((this.mainVerb == null) ? 0 : this.mainVerb.hashCode()));
        result = ((result * 31) + ((this.tokens == null) ? 0 : this.tokens.hashCode()));
        result = ((result * 31) + (this.id));
        result = ((result * 31) + ((this.text == null) ? 0 : this.text.hashCode()));
        result = ((result * 31) + ((this.object == null) ? 0 : this.object.hashCode()));
        result = ((result * 31) + ((this.conllId == null) ? 0 : this.conllId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SentencesProperty)) {
            return false;
        }
        SentencesProperty rhs = ((SentencesProperty) other);
        return (((((((((((((((((this.embeddings == rhs.embeddings) || ((this.embeddings != null) && this.embeddings.equals(rhs.embeddings))) && ((this.tokenTo == rhs.tokenTo) || ((this.tokenTo != null) && this.tokenTo.equals(rhs.tokenTo)))) && ((this.scores == rhs.scores) || ((this.scores != null) && this.scores.equals(rhs.scores)))) && ((this.subject == rhs.subject) || ((this.subject != null) && this.subject.equals(rhs.subject)))) && ((this.clauses == rhs.clauses) || ((this.clauses != null) && this.clauses.equals(rhs.clauses)))) && ((this.tokenFrom == rhs.tokenFrom) || ((this.tokenFrom != null) && this.tokenFrom.equals(rhs.tokenFrom)))) && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type)))) && ((this.labels == rhs.labels) || ((this.labels != null) && this.labels.equals(rhs.labels)))) && ((this.features == rhs.features) || ((this.features != null) && this.features.equals(rhs.features)))) && ((this.translations == rhs.translations) || ((this.translations != null) && this.translations.equals(rhs.translations)))) && ((this.complex == rhs.complex) || ((this.complex != null) && this.complex.equals(rhs.complex)))) && ((this.mainVerb == rhs.mainVerb) || ((this.mainVerb != null) && this.mainVerb.equals(rhs.mainVerb)))) && ((this.tokens == rhs.tokens) || ((this.tokens != null) && this.tokens.equals(rhs.tokens)))) && ((this.id == rhs.id))) && ((this.text == rhs.text) || ((this.text != null) && this.text.equals(rhs.text)))) && ((this.object == rhs.object) || ((this.object != null) && this.object.equals(rhs.object))));
    }

}
