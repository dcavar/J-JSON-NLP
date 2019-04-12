package edu.indiana.jsonnlp;

import java.util.ArrayList;
import java.util.List;

public class DependencyTreeObject {
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
