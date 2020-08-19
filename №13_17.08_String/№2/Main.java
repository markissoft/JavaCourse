package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String testText = scanner.nextLine();
        char[] arr = testText.toCharArray();

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[i] == vowels[j])
                    arr[i] = '-';
            }
        }

        System.out.println(arr);
    }
}
