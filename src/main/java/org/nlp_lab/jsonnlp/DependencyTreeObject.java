/**
 * DependencyTreeObject.java
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
public class DependencyTreeObject extends AbstractJSONNLP {
	private String name = "";
	private List<DependencyObject> dependencies = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<DependencyObject> getDependencies() {
		return dependencies;
	}

	public void setDependencies(List<DependencyObject> dependencies) {
		this.dependencies = dependencies;
	}

	public DependencyTreeObject () {
		super();
	}

	public DependencyTreeObject(String name) {
		super();
		this.name = name;
	}
}
