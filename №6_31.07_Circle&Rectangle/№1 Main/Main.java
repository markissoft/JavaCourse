package com.company;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.show();

        System.out.println();

        Rectangle rectangle2 = new Rectangle(5, 5);
        rectangle2.show();

        System.out.println();

        Circle circle = new Circle(2.7,5.75);
        circle.show_s();
        circle.show_l();

    }
}
