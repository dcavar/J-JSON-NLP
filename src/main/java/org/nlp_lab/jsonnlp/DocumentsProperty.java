
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
    "id",
    "meta",
    "text",
    "embeddings",
    "features",
    "scores",
    "labels",
    "paragraphs",
    "sentences",
    "clauses",
    "tokenList",
    "dependencies",
    "coreferences",
    "constituents",
    "expressions"
})




public class DocumentsProperty {

    /**
     * Document ID
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Document ID")
    private String id;
    @JsonProperty("meta")
    private Meta meta;
    /**
     * The unprocessed text of the document
     * 
     */
    @JsonProperty("text")
    @JsonPropertyDescription("The unprocessed text of the document")
    private String text;
    /**
     * Allow for embeddings from multiple sources
     * 
     */
    @JsonProperty("embeddings")
    @JsonPropertyDescription("Allow for embeddings from multiple sources")
    private List<Embedding> embeddings = new ArrayList<Embedding>();
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
     * Classification labels applied to a given section
     * 
     */
    @JsonProperty("labels")
    @JsonPropertyDescription("Classification labels applied to a given section")
    private List<Label> labels = new ArrayList<Label>();
    @JsonProperty("paragraphs")
    private Map<String, ParagraphsProperty> paragraphs = new HashMap<>();
    @JsonProperty("sentences")
    private Map<String, SentencesProperty> sentences = new HashMap<>();
    @JsonProperty("clauses")
    private Clauses clauses;
    /**
     * A mapping of tokens objects in the document
     * (Required)
     * 
     */
    @JsonProperty("tokenList")
    @JsonPropertyDescription("A mapping of tokens objects in the document")
    private Map<String, TokenListProperty> tokenList = new HashMap<>();
    /**
     * Dependency graphs of any style
     * 
     */
    @JsonProperty("dependencies")
    @JsonPropertyDescription("Dependency graphs of any style")
    private List<Dependency> dependencies = new ArrayList<Dependency>();
    @JsonProperty("coreferences")
    private List<Coreference> coreferences = new ArrayList<Coreference>();
    @JsonProperty("constituents")
    private List<Constituent> constituents = new ArrayList<Constituent>();
    /**
     * Multi-word expressions, idioms, etc.
     * 
     */
    @JsonProperty("expressions")
    @JsonPropertyDescription("Multi-word expressions, idioms, etc.")
    private List<Expression> expressions = new ArrayList<Expression>();

    /**
     * Document ID
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Document ID
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("meta")
    public Meta getMeta() {
        return meta;
    }

    @JsonProperty("meta")
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    /**
     * The unprocessed text of the document
     * 
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * The unprocessed text of the document
     * 
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
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

    @JsonProperty("paragraphs")
    public Map<String, ParagraphsProperty> getParagraphs() {
        return paragraphs;
    }

    @JsonProperty("paragraphs")
    public void setParagraphs(Map<String, ParagraphsProperty> paragraphs) {
        this.paragraphs = paragraphs;
    }

    @JsonProperty("sentences")
    public Map<String, SentencesProperty> getSentences() {
        return sentences;
    }

    @JsonProperty("sentences")
    public void setSentences(Map<String, SentencesProperty> sentences) {
        this.sentences = sentences;
    }

    @JsonProperty("clauses")
    public Clauses getClauses() {
        return clauses;
    }

    @JsonProperty("clauses")
    public void setClauses(Clauses clauses) {
        this.clauses = clauses;
    }

    /**
     * A mapping of tokens objects in the document
     * (Required)
     * 
     */
    @JsonProperty("tokenList")
    public Map<String, TokenListProperty> getTokenList() {
        return tokenList;
    }

    /**
     * A mapping of tokens objects in the document
     * (Required)
     * 
     */
    @JsonProperty("tokenList")
    public void setTokenList(Map<String, TokenListProperty> tokenList) {
        this.tokenList = tokenList;
    }

    /**
     * Dependency graphs of any style
     * 
     */
    @JsonProperty("dependencies")
    public List<Dependency> getDependencies() {
        return dependencies;
    }

    /**
     * Dependency graphs of any style
     * 
     */
    @JsonProperty("dependencies")
    public void setDependencies(List<Dependency> dependencies) {
        this.dependencies = dependencies;
    }

    @JsonProperty("coreferences")
    public List<Coreference> getCoreferences() {
        return coreferences;
    }

    @JsonProperty("coreferences")
    public void setCoreferences(List<Coreference> coreferences) {
        this.coreferences = coreferences;
    }

    @JsonProperty("constituents")
    public List<Constituent> getConstituents() {
        return constituents;
    }

    @JsonProperty("constituents")
    public void setConstituents(List<Constituent> constituents) {
        this.constituents = constituents;
    }

    /**
     * Multi-word expressions, idioms, etc.
     * 
     */
    @JsonProperty("expressions")
    public List<Expression> getExpressions() {
        return expressions;
    }

    /**
     * Multi-word expressions, idioms, etc.
     * 
     */
    @JsonProperty("expressions")
    public void setExpressions(List<Expression> expressions) {
        this.expressions = expressions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DocumentsProperty.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("meta");
        sb.append('=');
        sb.append(((this.meta == null)?"<null>":this.meta));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
        sb.append(',');
        sb.append("embeddings");
        sb.append('=');
        sb.append(((this.embeddings == null)?"<null>":this.embeddings));
        sb.append(',');
        sb.append("features");
        sb.append('=');
        sb.append(((this.features == null)?"<null>":this.features));
        sb.append(',');
        sb.append("scores");
        sb.append('=');
        sb.append(((this.scores == null)?"<null>":this.scores));
        sb.append(',');
        sb.append("labels");
        sb.append('=');
        sb.append(((this.labels == null)?"<null>":this.labels));
        sb.append(',');
        sb.append("paragraphs");
        sb.append('=');
        sb.append(((this.paragraphs == null)?"<null>":this.paragraphs));
        sb.append(',');
        sb.append("sentences");
        sb.append('=');
        sb.append(((this.sentences == null)?"<null>":this.sentences));
        sb.append(',');
        sb.append("clauses");
        sb.append('=');
        sb.append(((this.clauses == null)?"<null>":this.clauses));
        sb.append(',');
        sb.append("tokenList");
        sb.append('=');
        sb.append(((this.tokenList == null)?"<null>":this.tokenList));
        sb.append(',');
        sb.append("dependencies");
        sb.append('=');
        sb.append(((this.dependencies == null)?"<null>":this.dependencies));
        sb.append(',');
        sb.append("coreferences");
        sb.append('=');
        sb.append(((this.coreferences == null)?"<null>":this.coreferences));
        sb.append(',');
        sb.append("constituents");
        sb.append('=');
        sb.append(((this.constituents == null)?"<null>":this.constituents));
        sb.append(',');
        sb.append("expressions");
        sb.append('=');
        sb.append(((this.expressions == null)?"<null>":this.expressions));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.embeddings == null)? 0 :this.embeddings.hashCode()));
        result = ((result* 31)+((this.scores == null)? 0 :this.scores.hashCode()));
        result = ((result* 31)+((this.sentences == null)? 0 :this.sentences.hashCode()));
        result = ((result* 31)+((this.clauses == null)? 0 :this.clauses.hashCode()));
        result = ((result* 31)+((this.paragraphs == null)? 0 :this.paragraphs.hashCode()));
        result = ((result* 31)+((this.expressions == null)? 0 :this.expressions.hashCode()));
        result = ((result* 31)+((this.labels == null)? 0 :this.labels.hashCode()));
        result = ((result* 31)+((this.dependencies == null)? 0 :this.dependencies.hashCode()));
        result = ((result* 31)+((this.features == null)? 0 :this.features.hashCode()));
        result = ((result* 31)+((this.meta == null)? 0 :this.meta.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        result = ((result* 31)+((this.tokenList == null)? 0 :this.tokenList.hashCode()));
        result = ((result* 31)+((this.coreferences == null)? 0 :this.coreferences.hashCode()));
        result = ((result* 31)+((this.constituents == null)? 0 :this.constituents.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DocumentsProperty) == false) {
            return false;
        }
        DocumentsProperty rhs = ((DocumentsProperty) other);
        return ((((((((((((((((this.embeddings == rhs.embeddings)||((this.embeddings!= null)&&this.embeddings.equals(rhs.embeddings)))&&((this.scores == rhs.scores)||((this.scores!= null)&&this.scores.equals(rhs.scores))))&&((this.sentences == rhs.sentences)||((this.sentences!= null)&&this.sentences.equals(rhs.sentences))))&&((this.clauses == rhs.clauses)||((this.clauses!= null)&&this.clauses.equals(rhs.clauses))))&&((this.paragraphs == rhs.paragraphs)||((this.paragraphs!= null)&&this.paragraphs.equals(rhs.paragraphs))))&&((this.expressions == rhs.expressions)||((this.expressions!= null)&&this.expressions.equals(rhs.expressions))))&&((this.labels == rhs.labels)||((this.labels!= null)&&this.labels.equals(rhs.labels))))&&((this.dependencies == rhs.dependencies)||((this.dependencies!= null)&&this.dependencies.equals(rhs.dependencies))))&&((this.features == rhs.features)||((this.features!= null)&&this.features.equals(rhs.features))))&&((this.meta == rhs.meta)||((this.meta!= null)&&this.meta.equals(rhs.meta))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))))&&((this.tokenList == rhs.tokenList)||((this.tokenList!= null)&&this.tokenList.equals(rhs.tokenList))))&&((this.coreferences == rhs.coreferences)||((this.coreferences!= null)&&this.coreferences.equals(rhs.coreferences))))&&((this.constituents == rhs.constituents)||((this.constituents!= null)&&this.constituents.equals(rhs.constituents))));
    }

}
