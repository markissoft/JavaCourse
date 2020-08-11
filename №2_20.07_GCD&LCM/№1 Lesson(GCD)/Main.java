package com.company;

public class Main {

    public static void main(String[] args) {
        int x = 252, y = 105;
        if (x == y){return;}
        while(x != y){
            if (x < y){ y -= x; }
            else { x -= y; }
        }
        System.out.println(x);
    }
}
