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
 *
 */
public class CoreferenceObject {
	public static class ReferentObject {
		private List<Integer> tokens = new ArrayList<>();
		private Integer head = -1;

		public List<Integer> getTokens() {
			return tokens;
		}

		public void setTokens(List<Integer> tokens) {
			this.tokens = tokens;
		}

		public Integer getHead() {
			return head;
		}

		public void setHead(Integer head) {
			this.head = head;
		}
	}

	private Integer id = -1;
	private ReferentObject representative = new ReferentObject();
	private List<ReferentObject> referents = new ArrayList<>();
	private String gender = "";

	public CoreferenceObject() {
		super();
	}

	public CoreferenceObject(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ReferentObject getRepresentative() {
		return representative;
	}

	public void setRepresentative(ReferentObject representative) {
		this.representative = representative;
	}

	public List<ReferentObject> getReferents() {
		return referents;
	}

	public void setReferents(List<ReferentObject> referents) {
		this.referents = referents;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
