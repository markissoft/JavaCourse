package com.company;

import java.util.Random;

public class Main {

    static class TaskOne{
        static int a1, d;
        static int itemByNumber(int n){
            int aN = a1 + d*(n - 1);
            return aN;
        }


    }

    static class TaskThree {
        static int num1;

        static boolean check(int num1) {
            if (num1 % 2 == 0)
                return true;
            else {
                return false;
            }

        }
    }

    static class TaskFour{
            static double num1, num2;
            static double write(){
                if (Math.abs(num1 - 10) > Math.abs(num2 - 10))
                    return num2;
                else{
                    return num1;
                }
            }
    }

    static class TaskFive{

    }



    public static void main(String[] args) {
       TaskOne one = new TaskOne();
       one.a1 = 1;
       one.d = 2;
       for (int i = 1; i <= 55; i++)
           System.out.print(one.itemByNumber(i) + " ");

       System.out.println();

       TaskOne two = new TaskOne();
       two.a1 = 90;
       two.d = -5;

       int j = 1;
       while(two.itemByNumber(j) >= 0) {
           System.out.print(two.itemByNumber(j) + " ");
           j++;
       }

        System.out.println();

       System.out.println(TaskThree.check(11));

        System.out.println();

        TaskFour four = new TaskFour();
        four.num1 = 12.45;
        four.num2 = 34.12;
        System.out.print(four.write());

        System.out.println();

        int[] arr = new int[10];
        Random randNum = new Random(10);
        for (int i = 0; i < 10; i++) {
            arr[i] = randNum.nextInt();
            System.out.print(arr[i] + " ");
        }








    }
}
