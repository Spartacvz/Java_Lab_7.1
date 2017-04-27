package com.Greg;
import java.util.*;
public class InsectManager {

    public static void main(String[] args) {
        /// Todo Figure out why I had to enter all this information up here if I still had to use setters below??
        Butterfly bF1 = new Butterfly("B-Fly-1", 4, "Black & Yellow", "Milk Parsley");      // Creates a new object (Butterfly) based on the insectManager template
        Butterfly bF2 = new Butterfly("HighFly", 4, "Orange & Black", "Milkweed");      // Creates a new object (Butterfly) based on the insectManager template
        Bee BB1 = new Bee("Big Buzz", 6, "Black & Yellow", "Sweet Clover", true) {
            @Override
            public void printSpeciesData() {

            }
        };      // Creates a new object (Bee) based on the insectManager template

        bF1.setWingCol("Black & Yellow");
        bF1.setFavFlo("Milk Parsley");
        bF2.setWingCol("Orange & Black");
        bF2.setFavFlo("Milkweed");
        BB1.setCol("Black & Yellow");
        BB1.setHoney(true);
        BB1.setFavFlo("Sweet Clover");

        bF2.printSpeciesData();
        System.out.println();
        BB1.printSPeciesData();
        System.out.println();
        bF1.printSpeciesData();

    }

    protected void AddToList() {
        LinkedList<Insect> insectTracker = new LinkedList<Insect>();
        insectTracker.add();



    }
}