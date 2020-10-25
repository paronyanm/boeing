package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BlackBox blackBox = new BlackBox();
        Plane plane = new Plane(blackBox);
        plane.flyAndCrush();

        Engineer engineer = new Engineer();

        engineer.takeBox(plane);

        Plane boeing = new Boeing(blackBox);
        boeing.flyAndCrush();

        engineer.takeBox(boeing);
        engineer.decodeBox();



    }
}
