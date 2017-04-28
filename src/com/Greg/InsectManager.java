package com.Greg;
import java.util.*;
public class InsectManager {

    public static void main(String[] args) {
        /// Todo Figure out why I had to enter all this information up here if I still had to use setters below??
        Butterfly bF1 = new Butterfly("B-Fly-1", 4, "Black & Yellow", "Milk Parsley") {
            @Override
            public void printSPeciesData() {

            }
        };      // Creates a new object (Butterfly) based on the insectManager template
        Butterfly bF2 = new Butterfly("HighFly", 4, "Orange & Black", "Milkweed") {
            @Override
            public void printSPeciesData() {

            }
        };      // Creates a new object (Butterfly) based on the insectManager template
        Bee BB1 = new Bee("Big Buzz", 6, "Black & Yellow", "Sweet Clover", true) {
            @Override
            public void printSpeciesData() {

            }
        };
        Bee BB2 = new Bee("Rumblin Bumbler", 4, "Green & Blue", "Lanceleaf", false)
        {
            @Override
            public void printSpeciesData() {

            }
        };      // Creates a new object (Bee) based on the insectManager template

        bF1.setWingCol("Black & Yellow");
        bF1.setFavFlo("Milk Parsley");
        bF2.setWingCol("Orange & Black");
        bF2.setFavFlo("Milkweed");
        BB1.setColor("Black & Yellow");
        BB1.setHoney(true);
        BB1.setFavFlo("Sweet Clover");
        BB2.setColor("Green & Blue");
        BB2.setHoney(false);
        BB2.setFavFlo("Lanceleaf");


        LinkedList<Insect> insectTracker = new LinkedList<Insect>();
        insectTracker.add(bF1);
        insectTracker.add(BB1);
        insectTracker.add(bF2);
        insectTracker.add(BB2);

        for (Insect i : insectTracker) {
            i.printSPeciesData();
            System.out.println();
        }


    }
}