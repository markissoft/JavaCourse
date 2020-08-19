package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n = (int) (Math.random() * 30);// [0;30)
        int m = (int) (Math.random() * 30);// [0;30)

        Auto[][] autos = new Auto[n][m]; // n - lines, m - columns

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                autos[i][j] = new Auto(Auto.getRandomNumber(0, 100),Auto.getRandomNumber(0, 1000),
                        Auto.getRandomNumber(0, 1500), (Math.random() * 75), Helm.getRandomMaterial());
            }
        }

        while (true) { // menu
            System.out.println("1 - Print all objects to the console \n" +
                    "2 - Set another material \n" + "3 - Exit");
            System.out.print("Choose one of the options: ");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println(Arrays.deepToString(autos));
                    break;
                case 2:
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            autos[i][j].year = 2020;
                        }
                    }
                    System.out.println(Arrays.deepToString(autos));
                    break;
                case 3:
                    System.exit(0);

            }
        }
    }
}
