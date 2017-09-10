package com.teststudy.springbootstudy.service;

public class Greet {
    private int id;
    private String name;

    public Greet(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Greet() {
        this.id = 0;
        this.name = "default";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
