package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Integer[] arr = new Integer[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = (int)(Math.random() * 50);
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        Arrays.sort(arr);

        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
            arr[i] *= -1;
        }

        System.out.println();

        Arrays.sort(arr);

        for (int i = 0; i < 10; i++) {
            arr[i] *= -1;
            System.out.print(arr[i] + " ");

        }





    }
}
