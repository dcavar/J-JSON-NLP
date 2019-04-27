
package org.nlp_lab.jsonnlp;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "scores",
    "wordnetId",
    "neighbors",
    "synonyms",
    "antonyms",
    "hypernyms",
    "hyponyms",
    "examples",
    "definition"
})
public class Synset {

    /**
     * Confidence levels of a particular attribute
     * 
     */
    @JsonProperty("scores")
    @JsonPropertyDescription("Confidence levels of a particular attribute")
    private Scores scores;
    @JsonProperty("wordnetId")
    private String wordnetId;
    @JsonProperty("neighbors")
    private List<String> neighbors = new ArrayList<String>();
    @JsonProperty("synonyms")
    private List<String> synonyms = new ArrayList<String>();
    @JsonProperty("antonyms")
    private List<String> antonyms = new ArrayList<String>();
    @JsonProperty("hypernyms")
    private List<String> hypernyms = new ArrayList<String>();
    @JsonProperty("hyponyms")
    private List<String> hyponyms = new ArrayList<String>();
    @JsonProperty("examples")
    private List<String> examples = new ArrayList<String>();
    @JsonProperty("definition")
    private String definition;

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

    @JsonProperty("wordnetId")
    public String getWordnetId() {
        return wordnetId;
    }

    @JsonProperty("wordnetId")
    public void setWordnetId(String wordnetId) {
        this.wordnetId = wordnetId;
    }

    @JsonProperty("neighbors")
    public List<String> getNeighbors() {
        return neighbors;
    }

    @JsonProperty("neighbors")
    public void setNeighbors(List<String> neighbors) {
        this.neighbors = neighbors;
    }

    @JsonProperty("synonyms")
    public List<String> getSynonyms() {
        return synonyms;
    }

    @JsonProperty("synonyms")
    public void setSynonyms(List<String> synonyms) {
        this.synonyms = synonyms;
    }

    @JsonProperty("antonyms")
    public List<String> getAntonyms() {
        return antonyms;
    }

    @JsonProperty("antonyms")
    public void setAntonyms(List<String> antonyms) {
        this.antonyms = antonyms;
    }

    @JsonProperty("hypernyms")
    public List<String> getHypernyms() {
        return hypernyms;
    }

    @JsonProperty("hypernyms")
    public void setHypernyms(List<String> hypernyms) {
        this.hypernyms = hypernyms;
    }

    @JsonProperty("hyponyms")
    public List<String> getHyponyms() {
        return hyponyms;
    }

    @JsonProperty("hyponyms")
    public void setHyponyms(List<String> hyponyms) {
        this.hyponyms = hyponyms;
    }

    @JsonProperty("examples")
    public List<String> getExamples() {
        return examples;
    }

    @JsonProperty("examples")
    public void setExamples(List<String> examples) {
        this.examples = examples;
    }

    @JsonProperty("definition")
    public String getDefinition() {
        return definition;
    }

    @JsonProperty("definition")
    public void setDefinition(String definition) {
        this.definition = definition;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Synset.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scores");
        sb.append('=');
        sb.append(((this.scores == null)?"<null>":this.scores));
        sb.append(',');
        sb.append("wordnetId");
        sb.append('=');
        sb.append(((this.wordnetId == null)?"<null>":this.wordnetId));
        sb.append(',');
        sb.append("neighbors");
        sb.append('=');
        sb.append(((this.neighbors == null)?"<null>":this.neighbors));
        sb.append(',');
        sb.append("synonyms");
        sb.append('=');
        sb.append(((this.synonyms == null)?"<null>":this.synonyms));
        sb.append(',');
        sb.append("antonyms");
        sb.append('=');
        sb.append(((this.antonyms == null)?"<null>":this.antonyms));
        sb.append(',');
        sb.append("hypernyms");
        sb.append('=');
        sb.append(((this.hypernyms == null)?"<null>":this.hypernyms));
        sb.append(',');
        sb.append("hyponyms");
        sb.append('=');
        sb.append(((this.hyponyms == null)?"<null>":this.hyponyms));
        sb.append(',');
        sb.append("examples");
        sb.append('=');
        sb.append(((this.examples == null)?"<null>":this.examples));
        sb.append(',');
        sb.append("definition");
        sb.append('=');
        sb.append(((this.definition == null)?"<null>":this.definition));
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
        result = ((result* 31)+((this.wordnetId == null)? 0 :this.wordnetId.hashCode()));
        result = ((result* 31)+((this.examples == null)? 0 :this.examples.hashCode()));
        result = ((result* 31)+((this.scores == null)? 0 :this.scores.hashCode()));
        result = ((result* 31)+((this.hypernyms == null)? 0 :this.hypernyms.hashCode()));
        result = ((result* 31)+((this.neighbors == null)? 0 :this.neighbors.hashCode()));
        result = ((result* 31)+((this.synonyms == null)? 0 :this.synonyms.hashCode()));
        result = ((result* 31)+((this.antonyms == null)? 0 :this.antonyms.hashCode()));
        result = ((result* 31)+((this.hyponyms == null)? 0 :this.hyponyms.hashCode()));
        result = ((result* 31)+((this.definition == null)? 0 :this.definition.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Synset) == false) {
            return false;
        }
        Synset rhs = ((Synset) other);
        return ((((((((((this.wordnetId == rhs.wordnetId)||((this.wordnetId!= null)&&this.wordnetId.equals(rhs.wordnetId)))&&((this.examples == rhs.examples)||((this.examples!= null)&&this.examples.equals(rhs.examples))))&&((this.scores == rhs.scores)||((this.scores!= null)&&this.scores.equals(rhs.scores))))&&((this.hypernyms == rhs.hypernyms)||((this.hypernyms!= null)&&this.hypernyms.equals(rhs.hypernyms))))&&((this.neighbors == rhs.neighbors)||((this.neighbors!= null)&&this.neighbors.equals(rhs.neighbors))))&&((this.synonyms == rhs.synonyms)||((this.synonyms!= null)&&this.synonyms.equals(rhs.synonyms))))&&((this.antonyms == rhs.antonyms)||((this.antonyms!= null)&&this.antonyms.equals(rhs.antonyms))))&&((this.hyponyms == rhs.hyponyms)||((this.hyponyms!= null)&&this.hyponyms.equals(rhs.hyponyms))))&&((this.definition == rhs.definition)||((this.definition!= null)&&this.definition.equals(rhs.definition))));
    }

}
