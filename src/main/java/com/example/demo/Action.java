package com.example.demo;

public class Action {

    private Object hiddenValue;
    private Object value;

    // needs factory to initialize hidden value
    // not directly

    public Action () {
        this.value = null;
        this.value = null;
    }

    public Object getHidden(ProviderB providerB) {
        return this.hiddenValue;
    }

    public Object get() {
        return this.value;
    }
    
}
