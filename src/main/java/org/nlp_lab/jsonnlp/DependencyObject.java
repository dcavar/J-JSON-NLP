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
 *
 */
public class DependencyObject extends AbstractJSONNLP {
	private String type = "";
	private List<Integer> governors = new ArrayList<>();
	private List<Integer> dependents = new ArrayList<>();

	public DependencyObject() {
		super();
	}

	public DependencyObject(String type, List<Integer> governors, List<Integer> dependents) {
		this.type = type;
		this.governors = governors;
		this.dependents = dependents;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Integer> getGovernors() {
		return governors;
	}

	public void setGovernors(List<Integer> governors) {
		this.governors = governors;
	}

	public List<Integer> getDependents() {
		return dependents;
	}

	public void setDependents(List<Integer> dependents) {
		this.dependents = dependents;
	}
}
