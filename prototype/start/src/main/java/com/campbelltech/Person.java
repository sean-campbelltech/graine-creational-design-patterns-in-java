package com.campbelltech;

// Prototype
public abstract class Person implements Cloneable {
    private String name;

    protected Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person clone() {
        // TODO: Implement clone method
        return null;
    }
}
