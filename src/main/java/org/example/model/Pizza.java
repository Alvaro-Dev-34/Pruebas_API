package org.example.model;

import java.io.Serializable;

public class Pizza implements Serializable {
    private String url;

    public Pizza() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrlPizza(String url) {
        this.url = url;
    }
}
