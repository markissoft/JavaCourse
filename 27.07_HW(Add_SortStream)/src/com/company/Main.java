package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<Integer>();
        Collections.addAll(numbers, 9,8,7,6,5,4,3,2,1,0);

        

        numbers.stream().sorted().forEach(s->System.out.print(s));
    }
}