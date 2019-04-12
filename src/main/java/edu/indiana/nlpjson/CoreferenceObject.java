package edu.indiana.nlpjson;

import java.util.ArrayList;
import java.util.List;

public class CoreferenceObject {
	public static class ReferentObject {
		private List<Integer> tokens;
		private Integer head;

		public ReferentObject() {
			super();
			this.tokens = new ArrayList<>();
		}

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

	private Integer id;
	private ReferentObject representative;
	private List<ReferentObject> referents;
	private String gender;

	public CoreferenceObject() {
		super();
	}

	public CoreferenceObject(Integer id) {
		super();
		this.id = id;
		this.referents = new ArrayList<>();
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
