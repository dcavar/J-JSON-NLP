/*
DependencyObject.java

(C) 2019 Umang Mehta, Aarushi Bisht, Damir Cavar

 */


package edu.indiana.jsonnlp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NLPJSONObject {
	public static class MetadataObject {
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

		public String getConformsTo() {
			return conformsTo;
		}

		public void setConformsTo(String conformsTo) {
			this.conformsTo = conformsTo;
		}

		public String getSource() {
			return source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public Date getCreated() {
			return created;
		}

		public void setCreated(Date created) {
			this.created = created;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public String getCreator() {
			return creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public String getPublisher() {
			return publisher;
		}

		public void setPublisher(String publisher) {
			this.publisher = publisher;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getIdentifier() {
			return identifier;
		}

		public void setIdentifier(String identifier) {
			this.identifier = identifier;
		}

		public String getLanguage() {
			return language;
		}

		public void setLanguage(String language) {
			this.language = language;
		}
	}
	private MetadataObject DC = new MetadataObject();
	private List<DocumentObject> documents = new ArrayList<>();

	public MetadataObject getDC() {
		return DC;
	}

	public void setDC(MetadataObject DC) {
		this.DC = DC;
	}

	public List<DocumentObject> getDocuments() {
		return documents;
	}

	public void setDocuments(List<DocumentObject> documents) {
		this.documents = documents;
	}

	public String toJSON() throws JsonProcessingException {
		return new ObjectMapper().writeValueAsString(this);
	}

	@Override
	public String toString() {
		try {
			return toJSON();
		}
		catch (JsonProcessingException e) {
			return "{}";
		}
	}
}
