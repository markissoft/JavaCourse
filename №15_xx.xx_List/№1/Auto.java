package com.company;

public class Auto {
    int horseForces;
    int year;

    Engine engine = new Engine();
    Helm helm = new Helm();

    Auto(int _horseForces, int _year, int _numberOf, double _diameter, String _material) {
        this.horseForces = _horseForces;
        this.year = _year;
        engine.setNumberOf(_numberOf);
        helm.setDiameter(_diameter);
        helm.setMaterial(_material);
    }

    public String toString() {
        return " 1:" + horseForces + " 2:" + year + " 3:" + engine.numberOf + " 4:"
                + helm.diameter + " 5:" + helm.material;
    }

    static int getRandomNumber(int x1, int x2) {
        return (int)(Math.random() * (x2 - x1) + x1);
    }
}
