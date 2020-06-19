package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main (String[] args) {
        final double pi=3.14;
        Scanner radiusInput=new Scanner(System.in);
        System.out.println("Enter a radius:");
        double r = radiusInput.nextDouble();
        radiusInput.close();
        double area=Circle.getArea(r);
        System.out.println("The area of a circle of radius "+r+" is: "+area);
    }
}
