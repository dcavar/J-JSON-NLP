/*
 * JSONNLPObject.java
 *
 * (C) 2019 by Umang Mehta, Damir Cavar, Aarushi Bisht, Jagpreet Chawala, ...
 *
 * Brought to you by the NLP-Lab (https://nlp-lab.org/)
 */


package org.nlp_lab.jsonnlp;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * JSON-NLP Object Class to map out JSON-NLP Token definitions.
 *
 * @author Umang Mehta, Damir Cavar
 * @version 0.1
 * @since 2019-03-22
 */
public class JSONNLPObject extends AbstractJSONNLP {

	/**
	 * MetaObject subclass
	 *
	 * @author Umang Mehta, Damir Cavar
	 * @version 0.1
	 * @since 2019-03-22
	 */
	public static class MetadataObject extends AbstractJSONNLP {
		private String conformsTo = "";
		private String source = "";
		private Date created = new Date();
		private Date date = new Date();
		private String creator = "";
		private String publisher = "";
		private String title = "";
		private String description = "";
		private String identifier = "";
		private String language = "";

		/**
		 *
		 * @return
		 */
		public String getConformsTo() {
			return conformsTo;
		}

		/**
		 *
		 * @param conformsTo
		 */
		public void setConformsTo(String conformsTo) {
			this.conformsTo = conformsTo;
		}

		/**
		 *
		 * @return
		 */
		public String getSource() {
			return source;
		}

		/**
		 *
		 * @param source
		 */
		public void setSource(String source) {
			this.source = source;
		}

		/**
		 *
		 * @return
		 */
		public Date getCreated() {
			return created;
		}

		/**
		 *
		 * @param created
		 */
		public void setCreated(Date created) {
			this.created = created;
		}

		/**
		 *
		 * @return
		 */
		public Date getDate() {
			return date;
		}

		/**
		 *
		 * @param date
		 */
		public void setDate(Date date) {
			this.date = date;
		}

		/**
		 *
		 * @return
		 */
		public String getCreator() {
			return creator;
		}

		/**
		 *
		 * @param creator
		 */
		public void setCreator(String creator) {
			this.creator = creator;
		}

		/**
		 *
		 * @return
		 */
		public String getPublisher() {
			return publisher;
		}

		/**
		 *
		 * @param publisher
		 */
		public void setPublisher(String publisher) {
			this.publisher = publisher;
		}

		/**
		 *
		 * @return
		 */
		public String getTitle() {
			return title;
		}

		/**
		 *
		 * @param title
		 */
		public void setTitle(String title) {
			this.title = title;
		}

		/**
		 *
		 * @return
		 */
		public String getDescription() {
			return description;
		}

		/**
		 *
		 * @param description
		 */
		public void setDescription(String description) {
			this.description = description;
		}

		/**
		 *
		 * @return
		 */
		public String getIdentifier() {
			return identifier;
		}

		/**
		 *
		 * @param identifier
		 */
		public void setIdentifier(String identifier) {
			this.identifier = identifier;
		}

		/**
		 *
		 * @return
		 */
		public String getLanguage() {
			return language;
		}

		/**
		 *
		 * @param language
		 */
		public void setLanguage(String language) {
			this.language = language;
		}
	}

	private MetadataObject DC = new MetadataObject();
	private List<DocumentObject> documents = new ArrayList<>();

	/**
	 *
	 * @return
	 */
	public MetadataObject getDC() {
		return DC;
	}

	/**
	 *
	 * @param DC
	 */
	public void setDC(MetadataObject DC) {
		this.DC = DC;
	}

	/**
	 *
	 * @return
	 */
	public List<DocumentObject> getDocuments() {
		return documents;
	}

	/**
	 *
	 * @param documents
	 */
	public void setDocuments(List<DocumentObject> documents) {
		this.documents = documents;
	}

}
