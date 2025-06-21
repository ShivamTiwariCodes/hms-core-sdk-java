package com.hms.sdk.core.dto;

import java.util.HashMap;
import java.util.Map;

public class PatientDTO {
    private String id;
    private String name;
    private String email;
    private String phone;
    private Map<String, Object> additionalFields = new HashMap<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAdditionalFields(Map<String, Object> additionalFields) {
        this.additionalFields = additionalFields;
    }

    public void addAdditionalField(String key, Object value) {
        this.additionalFields.putIfAbsent(key, value);
    }

    public Map<String, Object> getAdditionalFields() {
        return this.additionalFields;
    }

    public Object getAdditionalField(String key) {
        return this.additionalFields.get(key);
    }

}
