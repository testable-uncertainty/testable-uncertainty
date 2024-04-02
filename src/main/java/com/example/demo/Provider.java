package com.example.demo;

public class Provider {

    public Provider() {
        
    }

    public Integer askHidden(Entity entity) {
        return entity.getHidden(this);
    }
    
}
