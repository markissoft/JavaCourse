package com.company;

public class Helm {

    double diameter;
    String material;

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    static String getRandomMaterial() {
        return (Math.random() < 0.5 ? "lether" : "alcantara"); // plain Math.random generates double є [0,1)
    }
}
