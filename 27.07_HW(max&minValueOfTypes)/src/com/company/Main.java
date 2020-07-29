package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        /* №1 */
        byte   i1 = 127;
        short  i2 = 32767;
        char   i3 = '捨';
        int    i4 = 2147483647;
        long   i5 = 922337203;
        float  i6 = 3.4028235E38f;
        double i7 = 1.7976931348623157E308;

        /* №2 */
        // Boolean does not have Boolean.SIZE, Boolean.MIN_VALUE, or Boolean.MAX_VALUE
        displaySizeMinAndMax(Byte.TYPE, Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE);
        displaySizeMinAndMax(Short.TYPE, Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);
        displaySizeMinAndMax(Character.TYPE, Character.SIZE, (int) Character.MIN_VALUE, (int) Character.MAX_VALUE);
        displaySizeMinAndMax(Integer.TYPE, Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        displaySizeMinAndMax(Long.TYPE, Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);
        displaySizeMinAndMax(Float.TYPE, Float.SIZE, Float.MIN_VALUE, Float.MAX_VALUE);
        displaySizeMinAndMax(Double.TYPE, Double.SIZE, Double.MIN_VALUE, Double.MAX_VALUE);

        /* №3 */
        int[] arr = new int[10];
        Random randNum = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = randNum.nextInt(10);
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        Arrays.sort(arr);
        System.out.println("Min of the array: " + arr[0] + "\nMaximum of the array: " + arr[arr.length - 1]);

    }

    public static void displaySizeMinAndMax(Class<?> type, int size, Number min, Number max) {
        System.out.printf("type:%-6s size:%-2s min:%-20s max:%s\n", type, size, min, max);
    }

}
