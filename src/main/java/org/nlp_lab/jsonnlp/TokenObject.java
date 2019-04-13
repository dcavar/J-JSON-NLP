/*
 * TokenObject.java
 *
 * (C) 2019 by Umang Mehta, Damir Cavar, Aarushi Bisht, Jagpreet Chawala, ...
 *
 * Brought to you by the NLP-Lab (https://nlp-lab.org/)
 *
 */


package org.nlp_lab.jsonnlp;


import java.util.ArrayList;
import java.util.List;


/**
 * Token Object Class to map out JSON-NLP Token definitions.
 *
 * @author Umang Mehta, Damir Cavar
 * @version 0.1
 * @since 2019-03-22
 */
public class TokenObject {
	private Integer id = -1;
	private String word = "";
	private String lemma = "";
	private Integer characterOffsetBegin = -1;
	private Integer characterOffsetEnd = -1;
	private String POS = "";
	private String NER = "";
	private String speaker = "";
	private Boolean foreign = false;
	private String language = "";
	private Boolean overt = false;
	private List<String> synonyms = new ArrayList<>();
	private List<String> hypernyms = new ArrayList<>();
	private List<String> hyponyms = new ArrayList<>();
	private List<EmbeddingObject> embeddings = new ArrayList<>();
	private List<List<Number>> characterEmbeddings = new ArrayList<>();
	private String sentiment = "";

	/**
	 * This method returns the ID of the token.
	 *
	 * @return int This is the ID of the token.
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method sets the token ID.
	 *
	 * @param id This is the ID of the token.
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method returns the string representation of the token as found in the input text.
	 *
	 * @return string This is the string representation of the token as found in input text.
	 */
	public String getWord() {
		return word;
	}

	/**
	 * This method sets the string representation for the token as found in the input text.
	 *
	 * @param word This is the string representation of the token.
	 */
	public void setWord(String word) {
		this.word = word;
	}

	/**
	 * This method returns the lemma for the token. The lemma is the lexical base-form of the token.
	 * This is usually the infinitival form of the verb or the nominative singular form of nouns.
	 *
	 * @return string This is the lemma of the token.
	 */
	public String getLemma() {
		return lemma;
	}

	/**
	 * This method sets the lemma for the token.
	 *
	 * @see org.nlp_lab.jsonnlp.TokenObject#getLemma()
	 * @param lemma The lemma for the token.
	 */
	public void setLemma(String lemma) {
		this.lemma = lemma;
	}

	/**
	 *
	 * @return
	 */
	public Integer getCharacterOffsetBegin() {
		return characterOffsetBegin;
	}

	/**
	 *
	 * @param characterOffsetBegin
	 */
	public void setCharacterOffsetBegin(Integer characterOffsetBegin) {
		this.characterOffsetBegin = characterOffsetBegin;
	}

	/**
	 *
	 * @return
	 */
	public Integer getCharacterOffsetEnd() {
		return characterOffsetEnd;
	}

	/**
	 *
	 * @param characterOffsetEnd
	 */
	public void setCharacterOffsetEnd(Integer characterOffsetEnd) {
		this.characterOffsetEnd = characterOffsetEnd;
	}

	/**
	 *
	 * @return
	 */
	public String getPOS() {
		return POS;
	}

	/**
	 *
	 * @param POS
	 */
	public void setPOS(String POS) {
		this.POS = POS;
	}

	/**
	 *
	 * @return
	 */
	public String getNER() {
		return NER;
	}

	/**
	 *
	 * @param NER
	 */
	public void setNER(String NER) {
		this.NER = NER;
	}

	/**
	 *
	 * @return
	 */
	public String getSpeaker() {
		return speaker;
	}

	/**
	 *
	 * @param speaker
	 */
	public void setSpeaker(String speaker) {
		this.speaker = speaker;
	}

	/**
	 *
	 * @return
	 */
	public Boolean getForeign() {
		return foreign;
	}

	/**
	 *
	 * @param foreign
	 */
	public void setForeign(Boolean foreign) {
		this.foreign = foreign;
	}

	/**
	 *
	 * @return
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 *
	 * @param language
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 *
	 * @return
	 */
	public Boolean getOvert() {
		return overt;
	}

	/**
	 *
	 * @param overt
	 */
	public void setOvert(Boolean overt) {
		this.overt = overt;
	}

	/**
	 *
	 * @return
	 */
	public List<String> getSynonyms() {
		return synonyms;
	}

	/**
	 *
	 * @param synonyms
	 */
	public void setSynonyms(List<String> synonyms) {
		this.synonyms = synonyms;
	}

	/**
	 *
	 * @return
	 */
	public List<String> getHypernyms() {
		return hypernyms;
	}

	/**
	 *
	 * @param hypernyms
	 */
	public void setHypernyms(List<String> hypernyms) {
		this.hypernyms = hypernyms;
	}

	/**
	 *
	 * @return
	 */
	public List<String> getHyponyms() {
		return hyponyms;
	}

	/**
	 *
	 * @param hyponyms
	 */
	public void setHyponyms(List<String> hyponyms) {
		this.hyponyms = hyponyms;
	}

	/**
	 *
	 * @return
	 */
	public List<EmbeddingObject> getEmbeddings() {
		return embeddings;
	}

	/**
	 *
	 * @param embeddings
	 */
	public void setEmbeddings(List<EmbeddingObject> embeddings) {
		this.embeddings = embeddings;
	}

	/**
	 *
	 * @return
	 */
	public List<List<Number>> getCharacterEmbeddings() {
		return characterEmbeddings;
	}

	/**
	 *
	 * @param characterEmbeddings
	 */
	public void setCharacterEmbeddings(List<List<Number>> characterEmbeddings) {
		this.characterEmbeddings = characterEmbeddings;
	}

	/**
	 * This method returns the sentiment score for the token.
	 *
	 * @return
	 */
	public String getSentiment() {
		return sentiment;
	}

	/**
	 * This method sets the sentiment score for the token.
	 *
	 * @param sentiment
	 */
	public void setSentiment(String sentiment) {
		this.sentiment = sentiment;
	}
}
