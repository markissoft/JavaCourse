package com.company;

public class Su_27 extends Aircraft implements Special {

    private int maxSpeed; //2500 km/h
    private String color; //Air Camouflage

    Su_27(int maxSpeed, String color, double length, double width, double weight) {
        super(length, width, weight);
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    AircraftControl aircraftControl = new AircraftControl();

    @Override
    public void turboAcceleration() {
        System.out.println(" - Turbo acceleration speed " + (int)(2500 + Math.random() * 500) + " km/h!");
    }

    @Override
    public void stealthMode() {
        System.out.println(" - Aircraft in stealth mode for " + (int)(Math.random() * 60) + " seconds!");
    }

    @Override
    public void nuclearStrike() {
        System.out.println(" - Number of missiles: " + (int)(Math.random() * 10) + " pieces!");
    }
}
