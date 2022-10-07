package org.example;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        /*Input code*/
        Scanner myObj = new Scanner(System.in);
        System.out.println("How many walls in your room?");
        int numberOfWalls = myObj.nextInt();

        /*

        for (int i = 1; i <= numberOfWalls; i++) {
            System.out.println("What is the height of wall " + i + "?");
            double height = myObj.nextDouble();
            dimensions.add(height);
            System.out.println("What is the width of wall " + i + "?");
            double width = myObj.nextDouble();
        } */

        System.out.println("What is your surface area per wall? Please answer in m² for all answers.");
        double surfaceAreaPerWall = myObj.nextDouble();
        System.out.println("What is the surface area of your ceiling?");
        double surfaceAreaCeiling = myObj.nextDouble();
        /*Calculation*/
        double surfaceAreaTotal = (numberOfWalls * surfaceAreaPerWall) + surfaceAreaCeiling;
        double volumeOfPaint = (Math.round(surfaceAreaTotal * 10.0)/100.0); //Paint per m² is roughly 100ml
        double costOfPaintMin = (Math.round(surfaceAreaTotal * 200.0)/100.0); //Low range for paint cost per m² is £2
        double costOfPaintMax = (Math.round(surfaceAreaTotal * 350.0)/100.0); //High range for paint cost per m² is £3.50
        /*Output*/
        System.out.println("The volume of paint needed for " + numberOfWalls + " walls with a surface area of " + surfaceAreaPerWall +
                " m² per wall and a ceiling of surface area " + surfaceAreaCeiling + " m² is equal to " + volumeOfPaint + " litres (L).\nThis cost will range from £" + costOfPaintMin + " - £" + costOfPaintMax +  ".");
    }
}