package com.company;

import java.util.Comparator;

public class Some implements Comparable<Some>{
    String someString;
    int someInt;

    Some(String str, int someInt) {
        this.someString = str;
        this.someInt = someInt;
    }

    @Override
    public String toString() {
        return ("[" + this.someString + " " + this.someInt + "]");
    }

    @Override
    public int compareTo(Some other) {
        return Integer.compare(this.someInt, other.someInt);
    }
}
