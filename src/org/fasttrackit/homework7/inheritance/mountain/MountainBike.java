package org.fasttrackit.homework7.inheritance.mountain;

import org.fasttrackit.homework7.inheritance.Bike;

public class MountainBike extends Bike {

    private int suspensionStrength;
    private int speed;

    public MountainBike() {
        super(6);
    }

    public int getSuspensionStrength() {
        return suspensionStrength;
    }

    public void setSuspensionStrength(int suspensionStrength) {
        this.suspensionStrength = suspensionStrength;
    }

    @Override
    public void flatTyre() {
        System.out.println("This wheel was worth the money");
        tyrePressure = maxPressure;
    }

    @Override
    public String toString() {
        return "MountainBike{" +
                "suspensionStrength=" + suspensionStrength +
                ", speed=" + speed +
                ", tyrePressure=" + tyrePressure +
                ", bikeWheel=" + bikeWheel +
                '}';
    }
}