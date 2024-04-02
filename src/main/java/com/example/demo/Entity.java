package com.example.demo;

public class Entity {

    private Integer hiddenValue;
    private Integer value;

    public Entity(Integer value, Integer hiddenValue, Factory factory) {
        this.value = value;
        this.hiddenValue = hiddenValue;
    }

    public Integer get() {
        return this.value;
    }

    public Integer getHidden(Provider provider) {
        // locked without provider
        // throws exception
        return this.hiddenValue;
    }


    public Action act() {
        // some code based on value and hiddenValue;
        // hits action object
        return new Action();
    }

}
