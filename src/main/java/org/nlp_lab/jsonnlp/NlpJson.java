
package org.nlp_lab.jsonnlp;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Map;


/**
 * The NLP-JSON Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "meta",
    "conll",
    "documents"
})
public class NlpJson {

    @JsonProperty("meta")
    private Meta meta;
    /**
     * Metadata for parsing to and from CoNLL formats
     * 
     */
    @JsonProperty("conll")
    @JsonPropertyDescription("Metadata for parsing to and from CoNLL formats")
    private Conll conll;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("documents")
    private Map<String, DocumentsProperty> documents;

    @JsonProperty("meta")
    public Meta getMeta() {
        return meta;
    }

    @JsonProperty("meta")
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    /**
     * Metadata for parsing to and from CoNLL formats
     * 
     */
    @JsonProperty("conll")
    public Conll getConll() {
        return conll;
    }

    /**
     * Metadata for parsing to and from CoNLL formats
     * 
     */
    @JsonProperty("conll")
    public void setConll(Conll conll) {
        this.conll = conll;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("documents")
    public Map<String, DocumentsProperty> getDocuments() {
        return documents;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("documents")
    public void setDocuments(Map<String, DocumentsProperty> documents) {
        this.documents = documents;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NlpJson.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("meta");
        sb.append('=');
        sb.append(((this.meta == null)?"<null>":this.meta));
        sb.append(',');
        sb.append("conll");
        sb.append('=');
        sb.append(((this.conll == null)?"<null>":this.conll));
        sb.append(',');
        sb.append("documents");
        sb.append('=');
        sb.append(((this.documents == null)?"<null>":this.documents));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.conll == null)? 0 :this.conll.hashCode()));
        result = ((result* 31)+((this.documents == null)? 0 :this.documents.hashCode()));
        result = ((result* 31)+((this.meta == null)? 0 :this.meta.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NlpJson) == false) {
            return false;
        }
        NlpJson rhs = ((NlpJson) other);
        return ((((this.conll == rhs.conll)||((this.conll!= null)&&this.conll.equals(rhs.conll)))&&((this.documents == rhs.documents)||((this.documents!= null)&&this.documents.equals(rhs.documents))))&&((this.meta == rhs.meta)||((this.meta!= null)&&this.meta.equals(rhs.meta))));
    }

}
