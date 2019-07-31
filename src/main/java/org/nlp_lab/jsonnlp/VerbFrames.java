/**
 * VerbFrames.java
 * <p>
 * (C) 2019 by Damir Cavar
 */

package org.nlp_lab.jsonnlp;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class VerbFrames {

    @JsonProperty("classId")
    private String classId;
    @JsonProperty("frames")
    private List<Frames> frames = new ArrayList<>();

    @JsonProperty("classId")
    public String getClassId() {
        return classId;
    }

    @JsonProperty("classId")
    public void setClassId(String classId) {
        this.classId = classId;
    }

    @JsonProperty("frames")
    public List<Frames> getFrames() {
        return frames;
    }

    @JsonProperty("frames")
    public void setFrames(List<Frames> frames) {
        this.frames = frames;
    }
}
