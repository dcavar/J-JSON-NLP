package edu.indiana.nlpjson;

import java.util.List;

public class SentenceObject {
	private String id;
	private String text;
	private Integer tokenFrom;
	private Integer tokenTo;
	private String sentiment;
	private Boolean complex = false;
	private String type;
	private List<EmbeddingObject> embeddings;

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public Boolean getComplex() {
		return complex;
	}

	public void setComplex(Boolean complex) {
		this.complex = complex;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<EmbeddingObject> getEmbeddings() {
		return embeddings;
	}

	public void setEmbeddings(List<EmbeddingObject> embeddings) {
		this.embeddings = embeddings;
	}
}
