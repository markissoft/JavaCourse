package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, MyException {
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        if (num1 < 0 && num2 < 0)
            throw new IllegalArgumentException();
        if (num1 == 0 && num2 != 0)
            throw new ArithmeticException();
        if (num1 != 0 && num2 == 0)
            throw new ArithmeticException();
        if (num1 == 0 && num2 == 0)
            throw new IllegalAccessException();
        if (num1 > 0 && num2 > 0)
            throw new MyException("Custom exception!");

        System.out.println(Methods.add(num1,num2));
        System.out.println(Methods.subtract(num1,num2));
        System.out.println(Methods.divide(num1,num2));
        System.out.println(Methods.multiply(num1,num2));

    }
}
