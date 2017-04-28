package com.Greg;


public abstract class Insect extends InsectManager {

    protected String insectName;
    public void setInsectName(String insectName) {
        this.insectName = insectName;
    }
    public String getInsectName()   {
        return insectName;
    }


    protected int wingNum;
    public void setWingNum(int wingNum) {
        this.wingNum = wingNum;
    }
    public int getWingNum()   {
        return wingNum;
    }


    protected int legNum = 6;

    public Insect(String insectName, int wingNum) {
        this.insectName = insectName;
        this.wingNum = wingNum;
    }
    public abstract void printSPeciesData();

    public abstract void printSpeciesData();
}
