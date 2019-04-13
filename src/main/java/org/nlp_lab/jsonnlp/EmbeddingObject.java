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
 * Embedding Object Class to map out JSON-NLP Token definitions.
 *
 * @author Umang Mehta, Damir Cavar
 * @version 0.1
 * @since 2019-03-22
 */
public class EmbeddingObject extends AbstractJSONNLP {
	private List<Number> vector = new ArrayList<>();
	private String model = "";

	/**
	 *
	 * @return
	 */
	public List<Number> getVector() {
		return vector;
	}

	/**
	 *
	 * @param vector
	 */
	public void setVector(List<Number> vector) {
		this.vector = vector;
	}

	/**
	 *
	 * @return
	 */
	public String getModel() {
		return model;
	}

	/**
	 *
	 * @param model
	 */
	public void setModel(String model) {
		this.model = model;
	}
}
