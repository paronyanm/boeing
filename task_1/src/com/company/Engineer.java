package com.company;
public class Engineer {

    private BlackBox blackBox;
    public Engineer() {

    }
    public void setBox(BlackBox blackBox) {
        this.blackBox = blackBox;

    }
    public void takeBox(Plane plane) {

        plane.getBoxForEngineer(this);


    }
    public void decodeBox() {

        System.out.println(blackBox.getDataByEngineer(this));

    }
}
