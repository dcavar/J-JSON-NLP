/*
 * Dependency.java
 * <p>
 * (C) 2019 by Damir Cavar
 *
 * NLP-Lab code version.
 */

package org.nlplab.jsonnlp;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.javatuples.Pair;

import java.util.ArrayList;
//import java.util.HashMap;
import java.util.HashMap;
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
    private String style;

    /**
     * A mapping of dependent token id to a list of governors
     * (Required)
     */
    @JsonProperty("trees")
    @JsonPropertyDescription("A mapping of dependent token id to a list of governors")
    //private Map<String, List<ArcsProperty>> arcs = new HashMap<>();
    private List<ArcsProperty> tree = new ArrayList<>();

    /**
     *
     * (Required)
     */
    @JsonProperty("style")
    public String getStyle() {
        return style;
    }

    /**
     *
     * (Required)
     */
    @JsonProperty("style")
    public void setStyle(String style) {
        this.style = style;
    }


    /**
     *
     * @param t a list of ArcsProperty objects
     * @param style the style
     */
    public void addnewTree(List<ArcsProperty> t, String style) {
        this.tree = t;
        this.style = style;
    }

    /**
     * A mapping of dependent token id to a list of governors
     * (Required)
     */
    @JsonProperty("arcs")
    public List<ArcsProperty> getTree() {
        return tree;
    }

    /**
     * A mapping of dependent token id to a list of governors
     * (Required)
     */
    @JsonProperty("arcs")
    public void setTree(List<ArcsProperty> tree) {
        this.tree = tree;
    }

    /**
     *
     */
    @JsonProperty("dependencymap")
    @JsonPropertyDescription("Dependency in HashMap")
    private HashMap<String, List<Pair<Integer, Integer>>> deps = new HashMap<>();

    /**
     *
     * @return a Map of dependency labels and a Pair of governor and dependent token ids.
     */
    @JsonProperty("dependencymap")
    public HashMap<String, List<Pair<Integer, Integer>>> getDepsMap() {
        return this.deps;
    }

    /**
     *
     * @param depsfrom a Map of dependency labels and a Pair of governor and dependent token ids.
     */
    @JsonProperty("dependencymap")
    public void setDepsMap(HashMap<String, List<Pair<Integer, Integer>>> depsfrom) {
        this.deps = depsfrom;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Dependency.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("style");
        sb.append('=');
        sb.append(((this.style == null) ? "<null>" : this.style));
        sb.append(',');
        sb.append("trees");
        sb.append('=');
        sb.append(((this.tree == null) ? "<null>" : this.tree));
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
        result = ((result * 31) + ((this.tree == null) ? 0 : this.tree.hashCode()));
        return ((result * 31) + ((this.style == null) ? 0 : this.style.hashCode()));
        //return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (!(other instanceof Dependency)) return false;

        Dependency rhs = ((Dependency) other);
        return (((this.tree == rhs.tree) || ((this.tree != null) && this.tree.equals(rhs.tree))) && ((this.style == rhs.style) || ((this.style != null) && this.style.equals(rhs.style))));
    }

}
