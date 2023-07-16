package org.fasttrackit.homework.exercise1;

public class Cosmetics extends Product {
    private String colour = "red";
    private double weight;

    public Cosmetics() {
        super("cosmetic");
    }

    public Cosmetics(String name) {
        super(name);
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}