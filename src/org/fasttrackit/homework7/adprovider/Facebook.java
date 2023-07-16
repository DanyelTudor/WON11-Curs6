package org.fasttrackit.homework7.adprovider;

public class Facebook implements AdProvider {

    public void advertise(String text) {
        System.out.println("Posting " + text + " on facebook");
    }
}
