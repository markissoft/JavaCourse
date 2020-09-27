package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n = (int) (Math.random() * 30);// [0;30)
        int m = (int) (Math.random() * 30);// [0;30)

        // Auto[][] autos = new Auto[n][m]; // n - lines, m - columns
        ArrayList<ArrayList<Auto>> autos = new ArrayList<ArrayList<Auto>>();
        ArrayList<Auto> temp = new ArrayList<Auto>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

//                autos[i][j] = new Auto(Auto.getRandomNumber(0, 100),Auto.getRandomNumber(0, 1000),
//                        Auto.getRandomNumber(0, 1500), (Math.random() * 75), Helm.getRandomMaterial());

                temp.add(new Auto(Auto.getRandomNumber(0, 100),Auto.getRandomNumber(0, 1000),
                        Auto.getRandomNumber(0, 1500), (Math.random() * 75), Helm.getRandomMaterial()));
            }
            autos.add(temp);
        }

        while (true) { // menu
            System.out.println("1 - Print all objects to the console \n"  + "2 - Exit");
            System.out.print("Choose one of the options: ");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println(autos);
                    break;
                case 2:
                    System.exit(0);

            }
        }
    }
}
