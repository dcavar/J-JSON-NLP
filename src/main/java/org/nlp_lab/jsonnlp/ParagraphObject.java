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
 * Paragraph Object Class to map out JSON-NLP Token definitions.
 *
 * @author Umang Mehta, Damir Cavar
 * @version 0.1
 * @since 2019-03-22
 */
public class ParagraphObject extends AbstractJSONNLP {
	private Integer id = -1;
	private String text = "";
	private Integer tokenFrom = -1;
	private Integer tokenTo = -1;
	private String sentiment = "";
	private List<EmbeddingObject> embeddings = new ArrayList<>();

	/**
	 *
	 * @return
	 */
	public Integer getId() {
		return id;
	}

	/**
	 *
	 * @param id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 *
	 * @return
	 */
	public String getText() {
		return text;
	}

	/**
	 *
	 * @param text
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 *
	 * @return
	 */
	public Integer getTokenFrom() {
		return tokenFrom;
	}

	/**
	 *
	 * @param tokenFrom
	 */
	public void setTokenFrom(Integer tokenFrom) {
		this.tokenFrom = tokenFrom;
	}

	/**
	 *
	 * @return
	 */
	public Integer getTokenTo() {
		return tokenTo;
	}

	/**
	 *
	 * @param tokenTo
	 */
	public void setTokenTo(Integer tokenTo) {
		this.tokenTo = tokenTo;
	}

	/**
	 *
	 * @return
	 */
	public String getSentiment() {
		return sentiment;
	}

	/**
	 *
	 * @param sentiment
	 */
	public void setSentiment(String sentiment) {
		this.sentiment = sentiment;
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
}
