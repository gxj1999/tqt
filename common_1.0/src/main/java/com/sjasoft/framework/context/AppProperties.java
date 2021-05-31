package com.sjasoft.framework.context;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "app")
public class AppProperties {
    private String localSpace = "";

    public String getLocalSpace() {
        return localSpace;
    }

    public void setLocalSpace(String localSpace) {
        this.localSpace = localSpace;
    }
}
