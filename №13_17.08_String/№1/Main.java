package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String testWord = scanner.nextLine();
        char[] arr = testWord.toCharArray();
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] == arr[j]) {
                continue;
            } else {
                System.out.println("Not a Palindrome!");
                System.exit(0);
            }
        }
        System.out.println("Palindrome!");
    }
}
