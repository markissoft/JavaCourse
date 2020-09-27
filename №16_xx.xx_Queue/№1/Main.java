package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<Some> some = new HashSet<Some>();
        String[] leters = {"b", "a", "c", "e", "d", "f", "g"};

        for (int i = 0; i < leters.length; i++) {
            some.add(new Some(leters[i], i - 5));
        }

        System.out.println(some);
        List<Some> sortedList = new ArrayList<>(some);
        Collections.sort(sortedList);
        System.out.println(sortedList);

        };


    }

