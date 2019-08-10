/*
 * Lu.java
 * <p>
 * (C) 2019 by Damir Cavar
 *
 * NLP-Lab code base.
 */

package org.nlplab.jsonnlp;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Lu {
    @JsonProperty("name")
    private String name;

    @JsonProperty("definition")
    private String definition;

    @JsonProperty("pos")
    private String pos;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("pos")
    public String getPos() {
        return pos;
    }

    @JsonProperty("pos")
    public void setPos(String pos) {
        this.pos = pos;
    }

    @JsonProperty("definition")
    public String getDefinition() {
        return definition;
    }

    @JsonProperty("definition")
    public void setDefinition(String definition) {
        this.definition = definition;
    }

}
