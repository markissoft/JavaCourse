package com.company;

import java.util.Scanner;

public class Main {

    public static class Methods {

        /* long gcd(long a,long b) {
            return b == 0 ? a : gcd(b,a % b); } */

        static long gcd(long num1, long num2){
            if (num1 == num2) {return 0;}
            while(num1 != num2) {
                if (num1 < num2){ num2 -= num1; }
                else { num1 -= num2; }
            }
            return num1;
        }

        static long lcm(long num1,long num2){
            return num1 / gcd(num1, num2) * num2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("[]   Select one of the following options: ");
        System.out.println("[]   1 - Greatest Common Divisor; ");
        System.out.println("[]   2 - Least Common Multiple; ");
        System.out.println("[]   3 - Print them both; ");
        System.out.print  ("[]-> ");

        int select = scanner.nextInt();
        switch (select){
            case 1:
                System.out.print("[]   Numeric1: "); int num1_1 = scanner.nextInt();
                System.out.print("[]   Numeric2: "); int num2_1 = scanner.nextInt();
                System.out.print("[]   GCD: "); System.out.println(Methods.gcd(num1_1, num2_1));
                break;
            case 2:
                System.out.print("[]   Numeric1: "); int num1_2 = scanner.nextInt();
                System.out.print("[]   Numeric2: "); int num2_2 = scanner.nextInt();
                System.out.print("[]   LCM: "); System.out.println(Methods.lcm(num1_2, num2_2));
                break;
            case 3:
                System.out.print("[]   Numeric1: "); int num1_3 = scanner.nextInt();
                System.out.print("[]   Numeric2: "); int num2_3 = scanner.nextInt();
                System.out.print("[]   GCD: "); System.out.println(Methods.gcd(num1_3, num2_3));
                System.out.print("[]   LCM: "); System.out.println(Methods.lcm(num1_3, num2_3));
                break;
        }
    }
}
