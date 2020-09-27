package com.company;

import java.util.Scanner;
import static java.lang.Double.parseDouble;

public class Main {

    public static void main(String[] args) {
	    System.out.print("Number: "); Scanner scanner = new Scanner(System.in);
	    String num = scanner.nextLine();
	    double i = parseDouble(num);

        if (i == (int)i)
            System.out.println("Number is integer!");
        else
            System.out.println("Not integer!");
    }
}
