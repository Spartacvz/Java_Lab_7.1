package com.Greg;

public abstract class Butterfly extends Insect   {

    private String wingCol;
        public void setWingCol(String wingCol) {
            this.wingCol = wingCol;
        }
        public String getWingCol()   {
            return wingCol;
        }


    private String favFlo;
        public void setFavFlo(String favFlo)    {
            this.favFlo = favFlo;
        }
        public String getFavFlo()   {
            return favFlo;
        }


    public Butterfly(String insectName, int wingNum, String wingCol, String favFlo)  {
        super(insectName, wingNum);
    }


    @Override
    public void printSpeciesData()  {
        System.out.println("I am a butterfly and my name is " + insectName + "!" );
        System.out.println("My wing color is " + wingCol + " and they look amaaaazing!!");
        System.out.println("I have " + wingNum + " wings and they flap like this!");
        System.out.println("I also have " + legNum + " legs and they're really strong, see!");
        System.out.println("My favorite flower is a " + favFlo + " and I just looovve it!!");
    }
}
