package com.company;

public class Main {

    public static void main(String[] args) {
        Robot A = new Robot();
        A.work();
        CoffeeRobot B = new CoffeeRobot();
        B.work();
        RobotDancer C = new RobotDancer();
        C.work();
        RobotCooker D = new RobotCooker();
        D.work();

        System.out.println();

        Robot[] arr = {A, B, C, D};

        for (int i = 0; i < arr.length; i++)
            arr[i].work();

    }
}
