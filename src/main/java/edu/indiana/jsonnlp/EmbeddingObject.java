package edu.indiana.jsonnlp;

import java.util.ArrayList;
import java.util.List;

public class EmbeddingObject {
	private List<Number> vector = new ArrayList<>();
	private String model = "";

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
