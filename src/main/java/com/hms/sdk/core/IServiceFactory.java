package com.hms.sdk.core;

public interface IServiceFactory {
    IService getService(IService serviceName);
}
