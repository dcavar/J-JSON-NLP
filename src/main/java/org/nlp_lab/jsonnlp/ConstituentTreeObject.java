/*
 * ConstituentTreeObject.java
 *
 * (C) 2019 by Umang Mehta, Damir Cavar, Aarushi Bisht, Jagpreet Chawala, ...
 *
 * Brought to you by the NLP-Lab (https://nlp-lab.org/)
 */


package org.nlp_lab.jsonnlp;

/**
 * Constituent Tree Object Class to map out JSON-NLP Token definitions.
 *
 * @author Umang Mehta, Damir Cavar
 * @version 0.1
 * @since 2019-03-22
 */
public class ConstituentTreeObject extends AbstractJSONNLP {
	private String sentId = "";
	private String labelledBracketing = "";

	/**
	 *
	 * @return
	 */
	public String getSentId() {
		return sentId;
	}

	/**
	 *
	 * @param sentId
	 */
	public void setSentId(String sentId) {
		this.sentId = sentId;
	}

	/**
	 *
	 * @return
	 */
	public String getLabelledBracketing() {
		return labelledBracketing;
	}

	/**
	 *
	 * @param labelledBracketing
	 */
	public void setLabelledBracketing(String labelledBracketing) {
		this.labelledBracketing = labelledBracketing;
	}
}
