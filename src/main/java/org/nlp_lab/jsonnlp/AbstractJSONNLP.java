package org.nlp_lab.jsonnlp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class AbstractJSONNLP {
	public String toJSON() throws JsonProcessingException {
		return new ObjectMapper().writeValueAsString(this);
	}

	@Override
	public String toString() {
		try {
			return this.toJSON();
		}
		catch (JsonProcessingException e) {
			return "{}";
		}
	}
}
