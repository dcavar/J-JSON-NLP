/*
 * CoreferenceObject.java
 *
 * (C) 2019 by Umang Mehta, Damir Cavar, Aarushi Bisht, Jagpreet Chawala, ...
 *
 * Brought to you by the NLP-Lab (https://nlp-lab.org/)
 */


package org.nlp_lab.jsonnlp;

import java.util.ArrayList;
import java.util.List;


/**
 * Coreference Object Class to map out JSON-NLP Token definitions.
 *
 * @author Umang Mehta, Damir Cavar
 * @version 0.1
 * @since 2019-03-22
 */
public class CoreferenceObject extends AbstractJSONNLP {

	/**
	 *
	 */
	public static class ReferentObject extends AbstractJSONNLP {
		private List<Integer> tokens = new ArrayList<>();
		private Integer head = -1;

		/**
		 *
		 * @return
		 */
		public List<Integer> getTokens() {
			return tokens;
		}

		/**
		 *
		 * @param tokens
		 */
		public void setTokens(List<Integer> tokens) {
			this.tokens = tokens;
		}

		/**
		 *
		 * @return
		 */
		public Integer getHead() {
			return head;
		}

		/**
		 *
		 * @param head
		 */
		public void setHead(Integer head) {
			this.head = head;
		}
	}

	private Integer id = -1;
	private ReferentObject representative = new ReferentObject();
	private List<ReferentObject> referents = new ArrayList<>();
	private String gender = "";

	/**
	 *
	 */
	public CoreferenceObject() {
		super();
	}

	/**
	 *
	 * @param id
	 */
	public CoreferenceObject(Integer id) {
		super();
		this.id = id;
	}

	/**
	 *
	 * @return
	 */
	public Integer getId() {
		return id;
	}

	/**
	 *
	 * @param id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 *
	 * @return
	 */
	public ReferentObject getRepresentative() {
		return representative;
	}

	/**
	 *
	 * @param representative
	 */
	public void setRepresentative(ReferentObject representative) {
		this.representative = representative;
	}

	/**
	 *
	 * @return
	 */
	public List<ReferentObject> getReferents() {
		return referents;
	}

	/**
	 *
	 * @param referents
	 */
	public void setReferents(List<ReferentObject> referents) {
		this.referents = referents;
	}

	/**
	 *
	 * @return
	 */
	public String getGender() {
		return gender;
	}

	/**
	 *
	 * @param gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
}
