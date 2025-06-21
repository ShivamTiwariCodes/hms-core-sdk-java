package com.hms.sdk.core;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class RoutineResponse implements Serializable {
    private final String source;
    private final Map<String, Object> data;

    @JsonCreator
    public RoutineResponse(@JsonProperty("source") String source, @JsonProperty("data") Map<String, Object> data) {
        this.source = source;
        this.data = data;
    }

    public String getSource() {
        return source;
    }

    public Map<String, Object> getData() {
        return data;
    }
}
