package com.Greg;

public abstract class Bee extends Insect {

    private String color;
        public void setColor(String color) {
            this.color = color;
        }
        public String getColor()   {
            return getColor();
        }


    private String favFlo;
        public void setFavFlo(String favFlo) {
            this.favFlo = favFlo;
        }
        public String getFavFlo()   {
            return favFlo;
        }


    private boolean honey;
        public void setHoney(boolean honey) {
            this.honey = honey;
        }
        public boolean getHoney()   {
            return honey;
        }


    public Bee(String insectName, int wingNum, String color, String favFlo, boolean honey)  {
        super(insectName, wingNum);
    }


    @Override
    public void printSPeciesData()  {
        System.out.println("Hi, I'm a " + color + " bee named " + insectName + ".");
        System.out.println("I too have " + legNum + " strong legs.");
        System.out.println("It is " + honey + " that I produce honey, or that I produce LOTS of it!!");
        System.out.println("My favorite flower to slurp nectar from is " + favFlo + " and I just looovve it!!");
    }
}
