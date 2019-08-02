/**
 * Dependency.java
 * <p>
 * (C) 2019 by Damir Cavar
 */

package org.nlp_lab.jsonnlp;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
//import java.util.HashMap;
import java.util.List;
//import java.util.Map;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "style",
        "trees"
})


public class Dependency {

    /**
     *
     * (Required)
     */
    @JsonProperty("style")
    private List<String> styles;

    /**
     * A mapping of dependent token id to a list of governors
     * (Required)
     */
    @JsonProperty("trees")
    @JsonPropertyDescription("A mapping of dependent token id to a list of governors")
    //private Map<String, List<ArcsProperty>> arcs = new HashMap<>();
    private List<List<ArcsProperty>> trees = new ArrayList<>();

    /**
     *
     * (Required)
     */
    @JsonProperty("style")
    public List<String> getStyle() {
        return styles;
    }

    /**
     *
     * (Required)
     */
    @JsonProperty("style")
    public void setStyle(List<String> style) {
        this.styles = style;
    }

    /**
     *
     * (Required)
     */
    public int getStyleID(String style) {
        return this.styles.indexOf(style);
    }

    /**
     *
     * @param pos
     * @return
     */
    public String getStyleLabel(int pos) {
        return this.styles.get(pos);
    }

    /**
     *
     * @param t
     * @param style
     */
    public void addTree(List<ArcsProperty> t, String style) {
        this.trees.add(t);
        this.styles.add(style);
    }

    /**
     * A mapping of dependent token id to a list of governors
     * (Required)
     */
    @JsonProperty("arcs")
    public List<List<ArcsProperty>> getTrees() {
        return trees;
    }

    /**
     * A mapping of dependent token id to a list of governors
     * (Required)
     *
     */
    @JsonProperty("arcs")
    public void setTrees(List<List<ArcsProperty>> trees) {
        this.trees = trees;
    }

    /**
     * returns a dependency tree at some position in the list
     *
     * @param pos
     * @return
     */
    public List<ArcsProperty> getTree(int pos) {
        if (-1 < pos && pos < this.trees.size()) {
            return this.trees.get(pos);
        }
        return new ArrayList<ArcsProperty>();
    }

    /**
     * returns the dependency tree that corresponds to a style label
     *
     * @param style
     * @return
     */
    public List<ArcsProperty> getTree(String style) {
        int id = this.getStyleID(style);
        if (id > -1) {
            return this.trees.get(id);
        }
        return new ArrayList<ArcsProperty>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Dependency.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("style");
        sb.append('=');
        sb.append(((this.styles == null) ? "<null>" : this.styles));
        sb.append(',');
        sb.append("trees");
        sb.append('=');
        sb.append(((this.trees == null) ? "<null>" : this.trees));
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
        result = ((result * 31) + ((this.trees == null) ? 0 : this.trees.hashCode()));
        return ((result * 31) + ((this.styles == null) ? 0 : this.styles.hashCode()));
        //return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (!(other instanceof Dependency)) return false;

        Dependency rhs = ((Dependency) other);
        return (((this.trees == rhs.trees) || ((this.trees != null) && this.trees.equals(rhs.trees))) && ((this.styles == rhs.styles) || ((this.styles != null) && this.styles.equals(rhs.styles))));
    }

}
