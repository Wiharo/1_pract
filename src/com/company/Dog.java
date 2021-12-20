package com.company;

public class Dog {
    private final String name;
    private final String dogOwner;

    public Dog(String name, String dogOwner) {
        this.name = name;
        this.dogOwner = dogOwner;
    }

    public String getName() {
        return this.name;
    }

    public String getDogOwner() {
        return this.dogOwner;
    }
}
