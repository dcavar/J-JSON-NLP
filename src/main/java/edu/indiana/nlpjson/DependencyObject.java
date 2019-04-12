/*
DependencyObject.java

(C) 2019

 */

package edu.indiana.nlpjson;

import java.util.List;

public class DependencyObject {
	private String type;
	private List<Integer> governors;
	private List<Integer> dependents;

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
