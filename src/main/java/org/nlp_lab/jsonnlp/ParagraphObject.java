/*
 * ParagraphObject.java
 *
 * (C) 2019 by Umang Mehta, Damir Cavar, Aarushi Bisht, Jagpreet Chawala, ...
 *
 * Brought to you by the NLP-Lab (https://nlp-lab.org/)
 */


package org.nlp_lab.jsonnlp;


import java.util.ArrayList;
import java.util.List;


/**
 *
 */
public class ParagraphObject extends AbstractJSONNLP {
	private Integer id = -1;
	private String text = "";
	private Integer tokenFrom = -1;
	private Integer tokenTo = -1;
	private String sentiment = "";
	private List<EmbeddingObject> embeddings = new ArrayList<>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Integer getTokenFrom() {
		return tokenFrom;
	}

	public void setTokenFrom(Integer tokenFrom) {
		this.tokenFrom = tokenFrom;
	}

	public Integer getTokenTo() {
		return tokenTo;
	}

	public void setTokenTo(Integer tokenTo) {
		this.tokenTo = tokenTo;
	}

	public String getSentiment() {
		return sentiment;
	}

	public void setSentiment(String sentiment) {
		this.sentiment = sentiment;
	}

	public List<EmbeddingObject> getEmbeddings() {
		return embeddings;
	}

	public void setEmbeddings(List<EmbeddingObject> embeddings) {
		this.embeddings = embeddings;
	}
}
