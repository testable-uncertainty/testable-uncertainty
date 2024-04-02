package com.example.demo;

public class Factory {
    // Factory Initialises hiddenValues inderectly

    public Entity getInstance() {
        // some logic
        // initializes hiddenValue
        Integer entityValue = 0;
        Integer entityHiddenValue = 1;
        return new Entity(entityValue, entityHiddenValue, this);
    }
}
