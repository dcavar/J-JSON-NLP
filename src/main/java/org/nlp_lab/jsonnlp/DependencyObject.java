/*
 * DependencyObject.java
 *
 * (C) 2019 by Umang Mehta, Damir Cavar, Aarushi Bisht, Jagpreet Chawala, ...
 *
 * Brought to you by the NLP-Lab (https://nlp-lab.org/)
 */


package org.nlp_lab.jsonnlp;


import java.util.ArrayList;
import java.util.List;


/**
 * Dependency Object Class to map out JSON-NLP Token definitions.
 *
 * @author Umang Mehta, Damir Cavar
 * @version 0.1
 * @since 2019-03-22
 */
public class DependencyObject extends AbstractJSONNLP {
	private String type = "";
	private List<Integer> governors = new ArrayList<>();
	private List<Integer> dependents = new ArrayList<>();

	/**
	 *
	 */
	public DependencyObject() {
		super();
	}

	/**
	 *
	 * @param type
	 * @param governors
	 * @param dependents
	 */
	public DependencyObject(String type, List<Integer> governors, List<Integer> dependents) {
		this.type = type;
		this.governors = governors;
		this.dependents = dependents;
	}

	/**
	 *
	 * @return
	 */
	public String getType() {
		return type;
	}

	/**
	 *
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 *
	 * @return
	 */
	public List<Integer> getGovernors() {
		return governors;
	}

	/**
	 *
	 * @param governors
	 */
	public void setGovernors(List<Integer> governors) {
		this.governors = governors;
	}

	/**
	 *
	 * @return
	 */
	public List<Integer> getDependents() {
		return dependents;
	}

	/**
	 *
	 * @param dependents
	 */
	public void setDependents(List<Integer> dependents) {
		this.dependents = dependents;
	}
}
