package com.company;

import java.util.Scanner;

public class AircraftControl {
    void moveForward() {
        System.out.println(" - The aircraft flew straight " + (int)(Math.random() * 30));
    }

    void moveBack() {
        System.out.println(" - The aircraft flew back " + (int)(Math.random() * 30));
    }

    void moveRight() {
        System.out.println(" - The aircraft flew right " + (int)(Math.random() * 30));
    }

    void moveLeft() {
        System.out.println(" - The aircraft flew left " + (int)(Math.random() * 30));
    }

    void moveUp() {
        System.out.println(" - The aircraft flew up " + (int)(Math.random() * 30));
    }

    void moveDown() {
        System.out.println(" - The aircraft flew down " + (int)(Math.random() * 30));
    }
}
