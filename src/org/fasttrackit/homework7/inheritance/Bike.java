package org.fasttrackit.homework7.inheritance;

public class Bike {
    protected static int maxPressure = 10;
    protected int tyrePressure;
    private int speed;

    public BikeWheel bikeWheel = new BikeWheel();

    public Bike(int tyrePressure) {
        this.tyrePressure = tyrePressure;
    }

    public void increaseSpeed(int amount, byte multiplier) {
        this.speed += amount;
    }

    public void increaseSpeed(byte multiplier, int a){
        this.speed = this.speed * multiplier;
    }

    public void increaseSpeed(){
        this.speed++;
    }

    public void stop() {
        this.speed = 0;
    }

    public void flatTyre() {
        System.out.println("Oops, my bike got a flat tyre!");
        this.tyrePressure = 0;
    }

    public void inflateTyre(int amount) {
        tyrePressure += amount;
        if (tyrePressure > maxPressure) {
            flatTyre();
        }
    }

    public int getTyrePressure() {
        return tyrePressure;
    }

    public int getSpeed() {
        return speed * bikeWheel.size;
    }

    protected class BikeWheel{
        private int size;

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }
    }

}