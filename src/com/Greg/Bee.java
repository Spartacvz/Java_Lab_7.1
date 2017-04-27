package com.Greg;

public abstract class Bee extends Insect {

    String color;
    String favFlo;
    boolean honey;

    public Bee(String insectName, int wingNum, String color, String favFlo, boolean honey)  {
        super(insectName, wingNum);
    }
    public void setCol(String color) {
        this.color = color;
    }
    public void setHoney(boolean honey) {
        this.honey = honey;
    }
    public void setFavFlo(String favFlo) {
        this.favFlo = favFlo;
    }
    public String getCol()   {
        return color;
    }
    public boolean getHoney() {
        return honey;
    }
    public String getFavFlo() {
        return favFlo;
    }

    public void printSPeciesData()  {
        System.out.println("Hi, I'm a " + color + " bee named " + insectName + ".");
        System.out.println("I too have " + legNum + " strong legs.");
        System.out.println("It is " + honey + " that I produce honey, and I produce LOTS of it!!");
        System.out.println("My favorite flower to use when producing honey is " + favFlo + " and I just looovve it!!");
    }
}
