package com.company;

public class MyException extends Exception {
    String err;

    MyException(String err) {
        this.err = err;
    }

    public String toString() {
        return err;
    }
}
