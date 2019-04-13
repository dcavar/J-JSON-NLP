/*
 * DocumentObject.java
 *
 * (C) 2019 by Umang Mehta, Damir Cavar, Aarushi Bisht, Jagpreet Chawala, ...
 *
 * Brought to you by the NLP-Lab (https://nlp-lab.org/)
 */


package org.nlp_lab.jsonnlp;


import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Document Object Class to map out JSON-NLP Token definitions.
 *
 * @author Umang Mehta, Damir Cavar
 * @version 0.1
 * @since 2019-03-22
 */
public class DocumentObject extends AbstractJSONNLP {
	private String text = "";
	private List<TokenObject> tokenList = new ArrayList<>();
	private List<ParagraphObject> paragraphs = new ArrayList<>();
	private List<SentenceObject> sentences = new ArrayList<>();
	// TODO: More JSON elements from the schema
	@JsonIgnore
	private Map<String, DependencyTreeObject> dependencyTreeMap = new HashMap<>();
	private List<DependencyTreeObject> dependencyTrees = new ArrayList<>();
	private List<CoreferenceObject> coreferences = new ArrayList<>();
	private List<ConstituentTreeObject> constituents = new ArrayList<>();

	/**
	 *
	 */
	public DocumentObject() {
		super();
	}

	/**
	 *
	 * @param text
	 */
	public DocumentObject(String text) {
		super();
		this.text = text;
	}

	/**
	 *
	 * @return
	 */
	public List<TokenObject> getTokenList() {
		return tokenList;
	}

	/**
	 *
	 * @param tokenList
	 */
	public void setTokenList(List<TokenObject> tokenList) {
		this.tokenList = tokenList;
	}

	/**
	 *
	 * @return
	 */
	public String getText() {
		return text;
	}

	/**
	 *
	 * @param text
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 *
	 * @return
	 */
	public List<ParagraphObject> getParagraphs() {
		return paragraphs;
	}

	/**
	 *
	 * @param paragraphs
	 */
	public void setParagraphs(List<ParagraphObject> paragraphs) {
		this.paragraphs = paragraphs;
	}

	/**
	 *
	 * @return
	 */
	public List<SentenceObject> getSentences() {
		return sentences;
	}

	/**
	 *
	 * @param sentences
	 */
	public void setSentences(List<SentenceObject> sentences) {
		this.sentences = sentences;
	}

	/**
	 *
	 * @return
	 */
	public Map<String, DependencyTreeObject> getDependencyTreeMap() {
		return dependencyTreeMap;
	}

	/**
	 *
	 * @param dependencyTreeMap
	 */
	public void setDependencyTreeMap(Map<String, DependencyTreeObject> dependencyTreeMap) {
		this.dependencyTreeMap = dependencyTreeMap;
	}

	/**
	 *
	 * @return
	 */
	public List<DependencyTreeObject> getDependencyTrees() {
		return dependencyTrees;
	}

	/**
	 *
	 * @param dependencyTrees
	 */
	public void setDependencyTrees(List<DependencyTreeObject> dependencyTrees) {
		this.dependencyTrees = dependencyTrees;
	}

	/**
	 *
	 * @return
	 */
	public List<CoreferenceObject> getCoreferences() {
		return coreferences;
	}

	/**
	 *
	 * @param coreferences
	 */
	public void setCoreferences(List<CoreferenceObject> coreferences) {
		this.coreferences = coreferences;
	}

	/**
	 *
	 * @return
	 */
	public List<ConstituentTreeObject> getConstituents() {
		return constituents;
	}

	/**
	 *
	 * @param constituents
	 */
	public void setConstituents(List<ConstituentTreeObject> constituents) {
		this.constituents = constituents;
	}

	/**
	 *
	 */
	public void buildDependencyTreeListFromMap() {
		this.dependencyTrees = new ArrayList<>(this.dependencyTreeMap.values());
	}

	/**
	 *
	 */
	public void buildDependencyTreeMapFromList() {
		this.dependencyTreeMap = new HashMap<>();
		for (DependencyTreeObject tree : this.dependencyTrees) {
			this.dependencyTreeMap.put(tree.getName(), tree);
		}
	}
}
