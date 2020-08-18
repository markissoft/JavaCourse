package com.company;

public class Rectangle {

    Rectangle(int height1, int length1){
        height = height1;
        length = length1;
    }
    Rectangle() {
        height = 10;
        length = 10;
    }

    private int height;
    private int length;

    private int P(){
        return 2 * (height + length);
    }

    private int S(){
        return height * length;
    }

    void show(){
        System.out.println("P = " + P());
        System.out.println("S = " + S());
    }


}
