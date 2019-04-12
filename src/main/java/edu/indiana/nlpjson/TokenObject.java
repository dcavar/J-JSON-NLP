package edu.indiana.nlpjson;

import java.util.List;

public class TokenObject {
	private Integer id;
	private String word;
	private String lemma;
	private Integer characterOffsetBegin;
	private Integer characterOffsetEnd;
	private String POS;
	private String NER;
	private String speaker;
	private Boolean foreign = false;
	private String language;
	private Boolean overt = false;
	private List<String> synonyms;
	private List<String> hypernyms;
	private List<String> hyponyms;
	private List<EmbeddingObject> embeddings;
	private List<List<Number>> characterEmbeddings;
	private String sentiment;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getLemma() {
		return lemma;
	}

	public void setLemma(String lemma) {
		this.lemma = lemma;
	}

	public Integer getCharacterOffsetBegin() {
		return characterOffsetBegin;
	}

	public void setCharacterOffsetBegin(Integer characterOffsetBegin) {
		this.characterOffsetBegin = characterOffsetBegin;
	}

	public Integer getCharacterOffsetEnd() {
		return characterOffsetEnd;
	}

	public void setCharacterOffsetEnd(Integer characterOffsetEnd) {
		this.characterOffsetEnd = characterOffsetEnd;
	}

	public String getPOS() {
		return POS;
	}

	public void setPOS(String POS) {
		this.POS = POS;
	}

	public String getNER() {
		return NER;
	}

	public void setNER(String NER) {
		this.NER = NER;
	}

	public String getSpeaker() {
		return speaker;
	}

	public void setSpeaker(String speaker) {
		this.speaker = speaker;
	}

	public Boolean getForeign() {
		return foreign;
	}

	public void setForeign(Boolean foreign) {
		this.foreign = foreign;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Boolean getOvert() {
		return overt;
	}

	public void setOvert(Boolean overt) {
		this.overt = overt;
	}

	public List<String> getSynonyms() {
		return synonyms;
	}

	public void setSynonyms(List<String> synonyms) {
		this.synonyms = synonyms;
	}

	public List<String> getHypernyms() {
		return hypernyms;
	}

	public void setHypernyms(List<String> hypernyms) {
		this.hypernyms = hypernyms;
	}

	public List<String> getHyponyms() {
		return hyponyms;
	}

	public void setHyponyms(List<String> hyponyms) {
		this.hyponyms = hyponyms;
	}

	public List<EmbeddingObject> getEmbeddings() {
		return embeddings;
	}

	public void setEmbeddings(List<EmbeddingObject> embeddings) {
		this.embeddings = embeddings;
	}

	public List<List<Number>> getCharacterEmbeddings() {
		return characterEmbeddings;
	}

	public void setCharacterEmbeddings(List<List<Number>> characterEmbeddings) {
		this.characterEmbeddings = characterEmbeddings;
	}

	public String getSentiment() {
		return sentiment;
	}

	public void setSentiment(String sentiment) {
		this.sentiment = sentiment;
	}
}
