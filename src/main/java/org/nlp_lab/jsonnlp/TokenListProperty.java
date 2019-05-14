
package org.nlp_lab.jsonnlp;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * A single token
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "text",
    "features",
    "misc",
    "scores",
    "lemma",
    "stem",
    "characterOffsetBegin",
    "characterOffsetEnd",
    "upos",
    "xpos",
    "morphemes",
    "shape",
    "entity",
    "entity_iob",
    "lang",
    "speaker",
    "synsets",
    "embeddings",
    "characterEmbeddings",
    "labels"
})
public class TokenListProperty {

    /**
     * Token ids start from 1, and are cumulative for the entire document.
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Token ids start from 1, and are cumulative for the entire document.")
    private Integer id;
    /**
     * The character string consisting of the token text
     * (Required)
     * 
     */
    @JsonProperty("text")
    @JsonPropertyDescription("The character string consisting of the token text")
    private String text;
    /**
     * Linguistic features, corresponding to the ConLL format
     * 
     */
    @JsonProperty("features")
    @JsonPropertyDescription("Linguistic features, corresponding to the ConLL format")
    private Map<String, String> features = new HashMap<>();
    /**
     * Miscellaneous features, corresponding to the ConLL format
     * 
     */
    @JsonProperty("misc")
    @JsonPropertyDescription("Miscellaneous features, corresponding to the ConLL format")
    private Misc misc;
    /**
     * Confidence levels of a particular attribute
     * 
     */
    @JsonProperty("scores")
    @JsonPropertyDescription("Confidence levels of a particular attribute")
    private Scores scores;
    @JsonProperty("lemma")
    private String lemma;
    @JsonProperty("stem")
    private String stem;
    /**
     * The inclusive character index in the sentence where this token begins
     * 
     */
    @JsonProperty("characterOffsetBegin")
    @JsonPropertyDescription("The inclusive character index in the sentence where this token begins")
    private Integer characterOffsetBegin;
    /**
     * The exclusive character index in the sentence where this token ends
     * 
     */
    @JsonProperty("characterOffsetEnd")
    @JsonPropertyDescription("The exclusive character index in the sentence where this token ends")
    private Integer characterOffsetEnd;
    /**
     * Universal part of speech tag
     * 
     */
    @JsonProperty("upos")
    @JsonPropertyDescription("Universal part of speech tag")
    private String upos;
    /**
     * Language-specific part of speech tag
     * 
     */
    @JsonProperty("xpos")
    @JsonPropertyDescription("Language-specific part of speech tag")
    private String xpos;
    @JsonProperty("morphemes")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    private Set<String> morphemes = new LinkedHashSet<String>();
    /**
     * Token shape
     * 
     */
    @JsonProperty("shape")
    @JsonPropertyDescription("Token shape")
    private String shape;
    /**
     * The Named Entity label
     * 
     */
    @JsonProperty("entity")
    @JsonPropertyDescription("The Named Entity label")
    private String entity;
    /**
     * The Named Entity IOB Schema
     * 
     */
    @JsonProperty("entity_iob")
    @JsonPropertyDescription("The Named Entity IOB Schema")
    private String entityIob;
    /**
     * ISO 639-2 language code
     * 
     */
    @JsonProperty("lang")
    @JsonPropertyDescription("ISO 639-2 language code")
    private String lang;
    @JsonProperty("speaker")
    private String speaker;
    @JsonProperty("synsets")
    private Map<String, Synset> synsets = new HashMap<>();
    /**
     * Allow for embeddings from multiple sources
     * 
     */
    @JsonProperty("embeddings")
    @JsonPropertyDescription("Allow for embeddings from multiple sources")
    private List<Embedding> embeddings = new ArrayList<Embedding>();
    /**
     * Store character embeddings as 2D matrix
     * 
     */
    @JsonProperty("characterEmbeddings")
    @JsonPropertyDescription("Store character embeddings as 2D matrix")
    private List<CharacterEmbedding> characterEmbeddings = new ArrayList<CharacterEmbedding>();
    /**
     * Classification labels applied to a given section
     * 
     */
    @JsonProperty("labels")
    @JsonPropertyDescription("Classification labels applied to a given section")
    private List<Label> labels = new ArrayList<Label>();

    /**
     * Token ids start from 1, and are cumulative for the entire document.
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * Token ids start from 1, and are cumulative for the entire document.
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * The character string consisting of the token text
     * (Required)
     * 
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * The character string consisting of the token text
     * (Required)
     * 
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
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
     * Miscellaneous features, corresponding to the ConLL format
     * 
     */
    @JsonProperty("misc")
    public Misc getMisc() {
        return misc;
    }

    /**
     * Miscellaneous features, corresponding to the ConLL format
     * 
     */
    @JsonProperty("misc")
    public void setMisc(Misc misc) {
        this.misc = misc;
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

    @JsonProperty("lemma")
    public String getLemma() {
        return lemma;
    }

    @JsonProperty("lemma")
    public void setLemma(String lemma) {
        this.lemma = lemma;
    }

    @JsonProperty("stem")
    public String getStem() {
        return stem;
    }

    @JsonProperty("stem")
    public void setStem(String stem) {
        this.stem = stem;
    }

    /**
     * The inclusive character index in the sentence where this token begins
     * 
     */
    @JsonProperty("characterOffsetBegin")
    public Integer getCharacterOffsetBegin() {
        return characterOffsetBegin;
    }

    /**
     * The inclusive character index in the sentence where this token begins
     * 
     */
    @JsonProperty("characterOffsetBegin")
    public void setCharacterOffsetBegin(Integer characterOffsetBegin) {
        this.characterOffsetBegin = characterOffsetBegin;
    }

    /**
     * The exclusive character index in the sentence where this token ends
     * 
     */
    @JsonProperty("characterOffsetEnd")
    public Integer getCharacterOffsetEnd() {
        return characterOffsetEnd;
    }

    /**
     * The exclusive character index in the sentence where this token ends
     * 
     */
    @JsonProperty("characterOffsetEnd")
    public void setCharacterOffsetEnd(Integer characterOffsetEnd) {
        this.characterOffsetEnd = characterOffsetEnd;
    }

    /**
     * Universal part of speech tag
     * 
     */
    @JsonProperty("upos")
    public String getUpos() {
        return upos;
    }

    /**
     * Universal part of speech tag
     * 
     */
    @JsonProperty("upos")
    public void setUpos(String upos) {
        this.upos = upos;
    }

    /**
     * Language-specific part of speech tag
     * 
     */
    @JsonProperty("xpos")
    public String getXpos() {
        return xpos;
    }

    /**
     * Language-specific part of speech tag
     * 
     */
    @JsonProperty("xpos")
    public void setXpos(String xpos) {
        this.xpos = xpos;
    }

    @JsonProperty("morphemes")
    public Set<String> getMorphemes() {
        return morphemes;
    }

    @JsonProperty("morphemes")
    public void setMorphemes(Set<String> morphemes) {
        this.morphemes = morphemes;
    }

    /**
     * Token shape
     * 
     */
    @JsonProperty("shape")
    public String getShape() {
        return shape;
    }

    /**
     * Token shape
     * 
     */
    @JsonProperty("shape")
    public void setShape(String shape) {
        this.shape = shape;
    }

    /**
     * The Named Entity label
     * 
     */
    @JsonProperty("entity")
    public String getEntity() {
        return entity;
    }

    /**
     * The Named Entity label
     * 
     */
    @JsonProperty("entity")
    public void setEntity(String entity) {
        this.entity = entity;
    }

    /**
     * The Named Entity IOB Schema
     * 
     */
    @JsonProperty("entity_iob")
    public String getEntityIob() {
        return entityIob;
    }

    /**
     * The Named Entity IOB Schema
     * 
     */
    @JsonProperty("entity_iob")
    public void setEntityIob(String entityIob) {
        this.entityIob = entityIob;
    }

    /**
     * ISO 639-2 language code
     * 
     */
    @JsonProperty("lang")
    public String getLang() {
        return lang;
    }

    /**
     * ISO 639-2 language code
     * 
     */
    @JsonProperty("lang")
    public void setLang(String lang) {
        this.lang = lang;
    }

    @JsonProperty("speaker")
    public String getSpeaker() {
        return speaker;
    }

    @JsonProperty("speaker")
    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    @JsonProperty("synsets")
    public Map<String,Synset> getSynsets() {
        return synsets;
    }

    @JsonProperty("synsets")
    public void setSynsets(Map<String, Synset> synsets) {
        this.synsets = synsets;
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
     * Store character embeddings as 2D matrix
     * 
     */
    @JsonProperty("characterEmbeddings")
    public List<CharacterEmbedding> getCharacterEmbeddings() {
        return characterEmbeddings;
    }

    /**
     * Store character embeddings as 2D matrix
     * 
     */
    @JsonProperty("characterEmbeddings")
    public void setCharacterEmbeddings(List<CharacterEmbedding> characterEmbeddings) {
        this.characterEmbeddings = characterEmbeddings;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TokenListProperty.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
        sb.append(',');
        sb.append("features");
        sb.append('=');
        sb.append(((this.features == null)?"<null>":this.features));
        sb.append(',');
        sb.append("misc");
        sb.append('=');
        sb.append(((this.misc == null)?"<null>":this.misc));
        sb.append(',');
        sb.append("scores");
        sb.append('=');
        sb.append(((this.scores == null)?"<null>":this.scores));
        sb.append(',');
        sb.append("lemma");
        sb.append('=');
        sb.append(((this.lemma == null)?"<null>":this.lemma));
        sb.append(',');
        sb.append("stem");
        sb.append('=');
        sb.append(((this.stem == null)?"<null>":this.stem));
        sb.append(',');
        sb.append("characterOffsetBegin");
        sb.append('=');
        sb.append(((this.characterOffsetBegin == null)?"<null>":this.characterOffsetBegin));
        sb.append(',');
        sb.append("characterOffsetEnd");
        sb.append('=');
        sb.append(((this.characterOffsetEnd == null)?"<null>":this.characterOffsetEnd));
        sb.append(',');
        sb.append("upos");
        sb.append('=');
        sb.append(((this.upos == null)?"<null>":this.upos));
        sb.append(',');
        sb.append("xpos");
        sb.append('=');
        sb.append(((this.xpos == null)?"<null>":this.xpos));
        sb.append(',');
        sb.append("morphemes");
        sb.append('=');
        sb.append(((this.morphemes == null)?"<null>":this.morphemes));
        sb.append(',');
        sb.append("shape");
        sb.append('=');
        sb.append(((this.shape == null)?"<null>":this.shape));
        sb.append(',');
        sb.append("entity");
        sb.append('=');
        sb.append(((this.entity == null)?"<null>":this.entity));
        sb.append(',');
        sb.append("entityIob");
        sb.append('=');
        sb.append(((this.entityIob == null)?"<null>":this.entityIob));
        sb.append(',');
        sb.append("lang");
        sb.append('=');
        sb.append(((this.lang == null)?"<null>":this.lang));
        sb.append(',');
        sb.append("speaker");
        sb.append('=');
        sb.append(((this.speaker == null)?"<null>":this.speaker));
        sb.append(',');
        sb.append("synsets");
        sb.append('=');
        sb.append(((this.synsets == null)?"<null>":this.synsets));
        sb.append(',');
        sb.append("embeddings");
        sb.append('=');
        sb.append(((this.embeddings == null)?"<null>":this.embeddings));
        sb.append(',');
        sb.append("characterEmbeddings");
        sb.append('=');
        sb.append(((this.characterEmbeddings == null)?"<null>":this.characterEmbeddings));
        sb.append(',');
        sb.append("labels");
        sb.append('=');
        sb.append(((this.labels == null)?"<null>":this.labels));
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
        result = ((result* 31)+((this.characterOffsetEnd == null)? 0 :this.characterOffsetEnd.hashCode()));
        result = ((result* 31)+((this.entityIob == null)? 0 :this.entityIob.hashCode()));
        result = ((result* 31)+((this.xpos == null)? 0 :this.xpos.hashCode()));
        result = ((result* 31)+((this.shape == null)? 0 :this.shape.hashCode()));
        result = ((result* 31)+((this.scores == null)? 0 :this.scores.hashCode()));
        result = ((result* 31)+((this.lemma == null)? 0 :this.lemma.hashCode()));
        result = ((result* 31)+((this.upos == null)? 0 :this.upos.hashCode()));
        result = ((result* 31)+((this.morphemes == null)? 0 :this.morphemes.hashCode()));
        result = ((result* 31)+((this.labels == null)? 0 :this.labels.hashCode()));
        result = ((result* 31)+((this.features == null)? 0 :this.features.hashCode()));
        result = ((result* 31)+((this.characterOffsetBegin == null)? 0 :this.characterOffsetBegin.hashCode()));
        result = ((result* 31)+((this.synsets == null)? 0 :this.synsets.hashCode()));
        result = ((result* 31)+((this.speaker == null)? 0 :this.speaker.hashCode()));
        result = ((result* 31)+((this.characterEmbeddings == null)? 0 :this.characterEmbeddings.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        result = ((result* 31)+((this.lang == null)? 0 :this.lang.hashCode()));
        result = ((result* 31)+((this.entity == null)? 0 :this.entity.hashCode()));
        result = ((result* 31)+((this.misc == null)? 0 :this.misc.hashCode()));
        result = ((result* 31)+((this.stem == null)? 0 :this.stem.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TokenListProperty) == false) {
            return false;
        }
        TokenListProperty rhs = ((TokenListProperty) other);
        return ((((((((((((((((((((((this.embeddings == rhs.embeddings)||((this.embeddings!= null)&&this.embeddings.equals(rhs.embeddings)))&&((this.characterOffsetEnd == rhs.characterOffsetEnd)||((this.characterOffsetEnd!= null)&&this.characterOffsetEnd.equals(rhs.characterOffsetEnd))))&&((this.entityIob == rhs.entityIob)||((this.entityIob!= null)&&this.entityIob.equals(rhs.entityIob))))&&((this.xpos == rhs.xpos)||((this.xpos!= null)&&this.xpos.equals(rhs.xpos))))&&((this.shape == rhs.shape)||((this.shape!= null)&&this.shape.equals(rhs.shape))))&&((this.scores == rhs.scores)||((this.scores!= null)&&this.scores.equals(rhs.scores))))&&((this.lemma == rhs.lemma)||((this.lemma!= null)&&this.lemma.equals(rhs.lemma))))&&((this.upos == rhs.upos)||((this.upos!= null)&&this.upos.equals(rhs.upos))))&&((this.morphemes == rhs.morphemes)||((this.morphemes!= null)&&this.morphemes.equals(rhs.morphemes))))&&((this.labels == rhs.labels)||((this.labels!= null)&&this.labels.equals(rhs.labels))))&&((this.features == rhs.features)||((this.features!= null)&&this.features.equals(rhs.features))))&&((this.characterOffsetBegin == rhs.characterOffsetBegin)||((this.characterOffsetBegin!= null)&&this.characterOffsetBegin.equals(rhs.characterOffsetBegin))))&&((this.synsets == rhs.synsets)||((this.synsets!= null)&&this.synsets.equals(rhs.synsets))))&&((this.speaker == rhs.speaker)||((this.speaker!= null)&&this.speaker.equals(rhs.speaker))))&&((this.characterEmbeddings == rhs.characterEmbeddings)||((this.characterEmbeddings!= null)&&this.characterEmbeddings.equals(rhs.characterEmbeddings))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))))&&((this.lang == rhs.lang)||((this.lang!= null)&&this.lang.equals(rhs.lang))))&&((this.entity == rhs.entity)||((this.entity!= null)&&this.entity.equals(rhs.entity))))&&((this.misc == rhs.misc)||((this.misc!= null)&&this.misc.equals(rhs.misc))))&&((this.stem == rhs.stem)||((this.stem!= null)&&this.stem.equals(rhs.stem))));
    }

}
