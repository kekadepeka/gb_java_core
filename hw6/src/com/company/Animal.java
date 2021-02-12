package com.company;

public abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;

    }

    public abstract void run(int lontitude);

    public abstract void swim(int lontitude);
}