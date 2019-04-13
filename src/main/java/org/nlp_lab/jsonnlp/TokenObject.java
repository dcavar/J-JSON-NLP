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
public class TokenObject extends AbstractJSONNLP {
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
	 * This method returns the offset of the beginning character of the token.
	 *
	 * @see org.nlp_lab.jsonnlp.TokenObject#setCharacterOffsetBegin()
	 * @return int
	 */
	public Integer getCharacterOffsetBegin() {
		return characterOffsetBegin;
	}

	/**
	 * This method sets the offset of the beginning character of the token.
	 *
	 * @see org.nlp_lab.jsonnlp.TokenObject#getCharacterOffsetBegin()
	 * @param characterOffsetBegin
	 */
	public void setCharacterOffsetBegin(Integer characterOffsetBegin) {
		this.characterOffsetBegin = characterOffsetBegin;
	}

	/**
	 * This method returns the offset of the end character of the token.
	 *
	 * @return
	 */
	public Integer getCharacterOffsetEnd() {
		return characterOffsetEnd;
	}

	/**
	 * This method sets the offset of the end character of the token.
	 *
	 * @param characterOffsetEnd
	 */
	public void setCharacterOffsetEnd(Integer characterOffsetEnd) {
		this.characterOffsetEnd = characterOffsetEnd;
	}

	/**
	 * This method returns the Part-of-Speech Tag for the token.
	 *
	 * @return
	 */
	public String getPOS() {
		return POS;
	}

	/**
	 * This method sets the Part-of-Speech tag for the token.
	 *
	 * @param POS
	 */
	public void setPOS(String POS) {
		this.POS = POS;
	}

	/**
	 * This method gets the Named Entity label for the token.
	 *
	 * @return
	 */
	public String getNER() {
		return NER;
	}

	/**
	 * This method sets the Named Entity label for the token.
	 *
	 * @param NER
	 */
	public void setNER(String NER) {
		this.NER = NER;
	}

	/**
	 * This method returns the speaker ID for the token.
	 *
	 * @return
	 */
	public String getSpeaker() {
		return speaker;
	}

	/**
	 * This method sets the speaker ID for the token.
	 *
	 * @param speaker
	 */
	public void setSpeaker(String speaker) {
		this.speaker = speaker;
	}

	/**
	 * This method returns the flag for foreign words for the token. If the token
	 * is a foreign word, the returned value is true, else it is false.
	 *
	 * @return
	 */
	public Boolean getForeign() {
		return foreign;
	}

	/**
	 * This method sets the foreign word flag for the token.
	 *
	 * @see org.nlp_lab.jsonnlp.TokenObject#getForeign()
	 * @param foreign
	 */
	public void setForeign(Boolean foreign) {
		this.foreign = foreign;
	}

	/**
	 * This method returns the language ID for the token.
	 *
	 * @return
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * This method sets the language ID for the token.
	 *
	 * @param language
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * This method returns the flag whether the token is overt or covert. Overt tokens have a string
	 * manifestation in the input text. Covert tokens are implicit and derived by Natural Language
	 * Processing components that generate JSON-NLP.
	 *
	 * @return
	 */
	public Boolean getOvert() {
		return overt;
	}

	/**
	 * This method sets the overt flag for the overt or covert property of the token.
	 *
	 * @see org.nlp_lab.jsonnlp.TokenObject#getOvert()
	 * @param overt
	 */
	public void setOvert(Boolean overt) {
		this.overt = overt;
	}

	/**
	 * This method returns the list of synonyms for the token.
	 *
	 * @return
	 */
	public List<String> getSynonyms() {
		return synonyms;
	}

	/**
	 * This method sets the synonyms for the token.
	 *
	 * @see org.nlp_lab.jsonnlp.TokenObject#getSynonyms()
	 * @param synonyms
	 */
	public void setSynonyms(List<String> synonyms) {
		this.synonyms = synonyms;
	}

	/**
	 * This method returns the list of hypernyms for the token.
	 *
	 * @return
	 */
	public List<String> getHypernyms() {
		return hypernyms;
	}

	/**
	 * This method sets the list of hypernyms for the token.
	 *
	 * @see org.nlp_lab.jsonnlp.TokenObject#getHypernyms()
	 * @param hypernyms
	 */
	public void setHypernyms(List<String> hypernyms) {
		this.hypernyms = hypernyms;
	}

	/**
	 * This method returns the list of hyponyms for the token.
	 *
	 * @return
	 */
	public List<String> getHyponyms() {
		return hyponyms;
	}

	/**
	 * This method sets the list of hyponyms for the token.
	 *
	 * @param hyponyms
	 */
	public void setHyponyms(List<String> hyponyms) {
		this.hyponyms = hyponyms;
	}

	/**
	 * This method returns a list of word embedding vectors for the token.
	 *
	 * @return
	 */
	public List<EmbeddingObject> getEmbeddings() {
		return embeddings;
	}

	/**
	 * This method sets a list of word embedding vectors for the token.
	 *
	 * @param embeddings
	 */
	public void setEmbeddings(List<EmbeddingObject> embeddings) {
		this.embeddings = embeddings;
	}

	/**
	 * This method returns a list of character embedding vectors for the token.
	 *
	 * @return
	 */
	public List<List<Number>> getCharacterEmbeddings() {
		return characterEmbeddings;
	}

	/**
	 * This method sets a list of character embedding vectors for the token.
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
