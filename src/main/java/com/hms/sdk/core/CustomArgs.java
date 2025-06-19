package com.hms.sdk.core;

import java.util.Map;

public class CustomArgs {
    private final String source;
    private final Map<String, Object> data;

    public CustomArgs(String source, Map<String, Object> data) {
        this.source = source;
        this.data = data;
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

