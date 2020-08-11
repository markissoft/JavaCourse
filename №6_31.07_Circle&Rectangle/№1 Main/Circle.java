package com.company;

public class Circle {
    private double radius, diameter;

    Circle(double radius1, double diameter1){
        radius = radius1;
        diameter = diameter1;
    }

    void show_s(){
        double res = Math.PI * radius * radius;
        System.out.printf("Sector = %.3f",res);
        System.out.println();
    }
    void show_l(){
        double res = Math.PI * 2 * radius;
        System.out.printf("Length = %.3f",res);
        System.out.println();
    }
}
