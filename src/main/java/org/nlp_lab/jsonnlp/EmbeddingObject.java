/*
 * EmbeddingObject.java
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
public class EmbeddingObject extends AbstractJSONNLP {
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
