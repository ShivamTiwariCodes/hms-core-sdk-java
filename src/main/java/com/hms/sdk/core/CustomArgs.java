package com.hms.sdk.core;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

public class CustomArgs {
    private final String source;
    private final Map<String, Object> data;

    @JsonCreator
    public CustomArgs(@JsonProperty("source")String source, @JsonProperty("data") Map<String, Object> data) {
        this.source = source;
        this.data = data;
    }

    public String getSource() {
        return source;
    }

    public Object get(String key) {
        return data.get(key);
    }

    public void put(String key, Object value) {
        data.put(key, value);
    }

    public Map<String, Object> getData() {
        return data;
    }
}

