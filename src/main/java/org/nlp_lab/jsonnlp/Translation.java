/**
 * Translation.java
 * <p>
 * (C) 2019 by Damir Cavar
 */

package org.nlp_lab.jsonnlp;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "lang",
        "text"
})
public class Translation {

    /**
     * Two-character language code
     * (Required)
     *
     */
    @JsonProperty("lang")
    @JsonPropertyDescription("Two-character language code")
    private String lang;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("text")
    private String text;

    /**
     * Two-character language code
     * (Required)
     *
     */
    @JsonProperty("lang")
    public String getLang() {
        return lang;
    }

    /**
     * Two-character language code
     * (Required)
     *
     */
    @JsonProperty("lang")
    public void setLang(String lang) {
        this.lang = lang;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Translation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("lang");
        sb.append('=');
        sb.append(((this.lang == null) ? "<null>" : this.lang));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null) ? "<null>" : this.text));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.lang == null) ? 0 : this.lang.hashCode()));
        result = ((result * 31) + ((this.text == null) ? 0 : this.text.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Translation)) {
            return false;
        }
        Translation rhs = ((Translation) other);
        return (((this.lang == rhs.lang) || ((this.lang != null) && this.lang.equals(rhs.lang))) && ((this.text == rhs.text) || ((this.text != null) && this.text.equals(rhs.text))));
    }

}
