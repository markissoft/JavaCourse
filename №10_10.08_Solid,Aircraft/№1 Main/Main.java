package com.company;

public class Main {
    public static void main(String[] args) {
        Su_27 su_27 = new Su_27(2500, "Air Camouflage", 21.9, 14.7, 16380);

        /*1*/su_27.startEngine();
        /*2*/su_27.takeOff();
        /*3*/su_27.aircraftControl.moveUp();
             su_27.aircraftControl.moveLeft();
             su_27.aircraftControl.moveDown();
             su_27.aircraftControl.moveRight();
        /*4*/su_27.stealthMode();
        /*5*/su_27.nuclearStrike();
        /*6*/su_27.turboAcceleration();
        /*7*/su_27.landing();
    }
}
