package com.Greg;


public abstract class Insect extends InsectManager {

    protected String insectName;
    protected int wingNum;
    protected int legNum = 6;

    public Insect(String insectName, int wingNum) {
        this.insectName = insectName;
        this.wingNum = wingNum;
    }

    public void setInsectName(String insectName)    {
        this.insectName = insectName;
    }

    public void setWingNum(int wingNum) {
        this.wingNum = wingNum;
    }

    public String getInsectName()   {
        return insectName;
    }

    public int getWingNum()  {
        return wingNum;
    }
    public abstract void printSpeciesData();
}
