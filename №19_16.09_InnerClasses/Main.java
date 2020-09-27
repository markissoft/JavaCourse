package com.company;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Number[] array = {1, 2, 55, 8, 111, 75, 90};

        Collection collection = new Collection(array);
        Iter firstIterator = collection.createFirstIterator();
        while (firstIterator.hasNext()) {
            Integer next = firstIterator.next();
            if (next % 2 != 0) {
                System.out.println("null");
            } else
                System.out.println(next);
        }
        System.out.println();

        Iter secondIterator = collection.createSecondIterator();
        while (secondIterator.hasNext()) {
            Integer next = secondIterator.next();
            System.out.println(next);
        }
        System.out.println();


    }
}
