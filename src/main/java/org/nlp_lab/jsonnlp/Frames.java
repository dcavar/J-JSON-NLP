/**
 * Frames.java
 *
 * (C) 2019 by Damir Cavar
 *
 */
package org.nlp_lab.jsonnlp;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Frames {
    @JsonProperty("name")
    private String name;
    @JsonProperty("frameId")
    private int frameId;
    @JsonProperty("definition")
    private String definition;
    @JsonProperty("lu")
    private List<Lu> lu = new ArrayList<>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("frameId")
    public int getFrameId() {
        return frameId;
    }
    @JsonProperty("frameId")
    public void setFrameId(int frameId) {
        this.frameId = frameId;
    }
    @JsonProperty("definition")
    public String getDefinition() {
        return definition;
    }
    @JsonProperty("definition")
    public void setDefinition(String definition) {
        this.definition = definition;
    }
    @JsonProperty("lu")
    public List<Lu> getLu() {
        return lu;
    }
    @JsonProperty("lu")
    public void setLu(List<Lu> lu) {
        this.lu = lu;
    }
}
