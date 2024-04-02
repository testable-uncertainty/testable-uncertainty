package com.example.demo;

public class ProviderB {

    public ProviderB() {
        
    }

    public Object askHidden(Action action) {
        return action.getHidden(this);
    }
}
