package com.company;

public class WrongInputConsoleParametersException extends Exception {
    String str;

    public WrongInputConsoleParametersException(String x) {
        this.str = x;
    }

    public String toString() {
        return "'" + str + "'" + " Sorry! Policy discussions are prohibited in this program!";
    }
}
