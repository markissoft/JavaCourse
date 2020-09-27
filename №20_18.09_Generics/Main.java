package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /*At run time, the generic type parameters are erased,
    so List<Integer> becomes List, and we can add any reference type to it*/

    public static void addToList(List list) {list.add("0067");list.add("bb");list.add(5);}
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        addToList(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
    }
}

