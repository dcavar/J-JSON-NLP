
package org.nlp_lab.jsonnlp;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "style",
    "arcs"
})
public class Dependency {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("style")
    private String style;
    /**
     * A mapping of dependent token id to a list of governors
     * (Required)
     * 
     */
    @JsonProperty("arcs")
    @JsonPropertyDescription("A mapping of dependent token id to a list of governors")
    private Map<String, List<ArcsProperty>> arcs = new HashMap<>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("style")
    public String getStyle() {
        return style;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("style")
    public void setStyle(String style) {
        this.style = style;
    }

    /**
     * A mapping of dependent token id to a list of governors
     * (Required)
     * 
     */
    @JsonProperty("arcs")
    public Map<String, List<ArcsProperty>> getArcs() {
        return arcs;
    }

    /**
     * A mapping of dependent token id to a list of governors
     * (Required)
     * 
     */
    @JsonProperty("arcs")
    public void setArcs(Map<String, List<ArcsProperty>> arcs) {
        this.arcs = arcs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Dependency.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("style");
        sb.append('=');
        sb.append(((this.style == null)?"<null>":this.style));
        sb.append(',');
        sb.append("arcs");
        sb.append('=');
        sb.append(((this.arcs == null)?"<null>":this.arcs));
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
        result = ((result* 31)+((this.arcs == null)? 0 :this.arcs.hashCode()));
        result = ((result* 31)+((this.style == null)? 0 :this.style.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Dependency) == false) {
            return false;
        }
        Dependency rhs = ((Dependency) other);
        return (((this.arcs == rhs.arcs)||((this.arcs!= null)&&this.arcs.equals(rhs.arcs)))&&((this.style == rhs.style)||((this.style!= null)&&this.style.equals(rhs.style))));
    }

}
