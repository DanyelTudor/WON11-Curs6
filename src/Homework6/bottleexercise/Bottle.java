package Homework6.bottleexercise;

import Homework6.personexercise.Person;

public class Bottle {
    private int availableLiquid;
    private int totalCapacity;

    private boolean open;

    public void otherMethod() {
        Person person = new Person("Alex");
        person.publicField = true;
//        person.privateField = false; -- compile error
    }

    public boolean HasMoreLiquid() {
        return availableLiquid > 0;
    }

    public int getAvailableLiquid() {
        return availableLiquid;
    }

    public int getEmptyCapacity() {
        return totalCapacity - availableLiquid;
    }

    public String open() {
        if (open) {
            return "Bottle is already opened";
        }
        open = true;
        return "Bottle is open";
    }

    public String close() {
        if (!open) {
            return "Bottle is already closed";
        }
        open = false;
        return "Bottle is closed";
    }

    public String drink(int liquidToDrink) {
        if (liquidToDrink < 0) {
            return "Quantity to drink must be positive";
        }
        if (!open) {
            return "Bottle is not opened";
        }
        if (liquidToDrink > availableLiquid) {
            return "Not enough liquid";
        }
        availableLiquid -= liquidToDrink;
        return liquidToDrink + " has been drank";
    }

    private String refill(int liquidToAdd) {
        if (liquidToAdd < 0) {
            return "Quantity to refill must be positive";
        }
//        if (availableLiquid + liquidToAdd > totalCapacity){
//           return "Too much liquid";
//        }

        availableLiquid = Math.min(totalCapacity, availableLiquid + liquidToAdd);
        return liquidToAdd + " was added";
    }

    public String refill() {
        int addedLiquid = getEmptyCapacity();
        refill(addedLiquid);
        return "Bottle was filled with " + addedLiquid;
    }
}