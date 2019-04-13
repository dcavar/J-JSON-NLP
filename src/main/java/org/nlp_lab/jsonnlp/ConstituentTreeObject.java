/*
 * ConstituentTreeObject.java
 *
 * (C) 2019 by Umang Mehta, Damir Cavar, Aarushi Bisht, Jagpreet Chawala, ...
 *
 * Brought to you by the NLP-Lab (https://nlp-lab.org/)
 */


package org.nlp_lab.jsonnlp;

/**
 *
 */
public class ConstituentTreeObject {
	private String sentId = "";
	private String labelledBracketing = "";

	public String getSentId() {
		return sentId;
	}

	public void setSentId(String sentId) {
		this.sentId = sentId;
	}

	public String getLabelledBracketing() {
		return labelledBracketing;
	}

	public void setLabelledBracketing(String labelledBracketing) {
		this.labelledBracketing = labelledBracketing;
	}
}
