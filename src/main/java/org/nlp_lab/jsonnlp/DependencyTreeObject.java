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
 * Dependency Tree Object Class to map out JSON-NLP Token definitions.
 *
 * @author Umang Mehta, Damir Cavar
 * @version 0.1
 * @since 2019-03-22
 */
public class DependencyTreeObject extends AbstractJSONNLP {
	private String name = "";
	private List<DependencyObject> dependencies = new ArrayList<>();

	/**
	 *
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 *
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 *
	 * @return
	 */
	public List<DependencyObject> getDependencies() {
		return dependencies;
	}

	/**
	 *
	 * @param dependencies
	 */
	public void setDependencies(List<DependencyObject> dependencies) {
		this.dependencies = dependencies;
	}

	/**
	 *
	 */
	public DependencyTreeObject () {
		super();
	}

	/**
	 *
	 * @param name
	 */
	public DependencyTreeObject(String name) {
		super();
		this.name = name;
	}
}
