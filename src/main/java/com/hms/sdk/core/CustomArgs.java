package com.hms.sdk.core;

import java.util.Map;

public class CustomArgs {
    private final String source;
    private final Map<String, Object> data;
    private IAppointmentService appointmentService;
    private IUserService userService;

    public CustomArgs(String source, Map<String, Object> data, IUserService userService, IAppointmentService appointmentService) {
        this.source = source;
        this.data = data;
        this.appointmentService = appointmentService;
        this.userService = userService;
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

    public IAppointmentService getAppointmentService() {
        return appointmentService;
    }

    public void setAppointmentService(IAppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    public IUserService getUserService() {
        return userService;
    }

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }
}

