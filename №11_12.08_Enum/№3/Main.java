package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i1, i2;

        try {
            i1 = scanner.nextInt();
            i2 = scanner.nextInt();
            System.out.println(i1 + i2);
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }



    }
}
