package org.nlplab.jsonnlp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DocumentObject {
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

	public DocumentObject() {
		super();
	}

	public DocumentObject(String text) {
		super();
		this.text = text;
	}

	public List<TokenObject> getTokenList() {
		return tokenList;
	}

	public void setTokenList(List<TokenObject> tokenList) {
		this.tokenList = tokenList;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List<ParagraphObject> getParagraphs() {
		return paragraphs;
	}

	public void setParagraphs(List<ParagraphObject> paragraphs) {
		this.paragraphs = paragraphs;
	}

	public List<SentenceObject> getSentences() {
		return sentences;
	}

	public void setSentences(List<SentenceObject> sentences) {
		this.sentences = sentences;
	}

	public Map<String, DependencyTreeObject> getDependencyTreeMap() {
		return dependencyTreeMap;
	}

	public void setDependencyTreeMap(Map<String, DependencyTreeObject> dependencyTreeMap) {
		this.dependencyTreeMap = dependencyTreeMap;
	}

	public List<DependencyTreeObject> getDependencyTrees() {
		return dependencyTrees;
	}

	public void setDependencyTrees(List<DependencyTreeObject> dependencyTrees) {
		this.dependencyTrees = dependencyTrees;
	}

	public List<CoreferenceObject> getCoreferences() {
		return coreferences;
	}

	public void setCoreferences(List<CoreferenceObject> coreferences) {
		this.coreferences = coreferences;
	}

	public List<ConstituentTreeObject> getConstituents() {
		return constituents;
	}

	public void setConstituents(List<ConstituentTreeObject> constituents) {
		this.constituents = constituents;
	}

	public void buildDependencyTreeListFromMap() {
		this.dependencyTrees = new ArrayList<>(this.dependencyTreeMap.values());
	}

	public void buildDependencyTreeMapFromList() {
		this.dependencyTreeMap = new HashMap<>();
		for (DependencyTreeObject tree : this.dependencyTrees) {
			this.dependencyTreeMap.put(tree.getName(), tree);
		}
	}
}
