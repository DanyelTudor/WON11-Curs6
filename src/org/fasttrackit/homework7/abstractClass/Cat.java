package org.fasttrackit.homework7.abstractClass;

public abstract class Cat extends Animal {
    @Override
    public String talk() {
        return "miau";
    }

    @Override
    public String walk() {
        return "cat-walking";
    }
}