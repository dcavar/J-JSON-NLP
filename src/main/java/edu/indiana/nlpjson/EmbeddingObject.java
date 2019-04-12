package edu.indiana.nlpjson;

import java.util.List;

public class EmbeddingObject {
	private List<Number> vector;
	private String model;

	public List<Number> getVector() {
		return vector;
	}

	public void setVector(List<Number> vector) {
		this.vector = vector;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}
