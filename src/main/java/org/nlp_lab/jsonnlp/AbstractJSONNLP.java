/*
 * AbstractJSONNLP.java
 *
 * (C) 2019 by Umang Mehta, Damir Cavar, Aarushi Bisht, Jagpreet Chawala, ...
 *
 * Brought to you by the NLP-Lab (https://nlp-lab.org/)
 */

package org.nlp_lab.jsonnlp;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * Abstract JSON-NLP Class to map out JSON-NLP Token definitions.
 *
 * @author Umang Mehta, Damir Cavar
 * @version 0.1
 * @since 2019-03-22
 */
public abstract class AbstractJSONNLP {

	/**
	 *
	 * @return
	 * @throws JsonProcessingException
	 */
	public String toJSON() throws JsonProcessingException {
		return new ObjectMapper().writeValueAsString(this);
	}

	/**
	 *
	 * @return
	 */
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
