package com.company;

public abstract class Aircraft {
    private double length, width, weight;

    Aircraft(double length, double width, double weight) {
        this.length = length;
        this.width = width;
        this.weight = weight;
    }

    void startEngine() {
        System.out.println(" - Ready for launch in " + (int)(20 + Math.random() * 68) + "seconds!");
    }

    void takeOff() {
        System.out.println(" - Enough fuel for " + (int)(Math.random() * 1000) + "kilometers!");
    }

    void landing() {
        System.out.println(" - The plain is landing!");
    }
}
