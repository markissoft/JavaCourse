package com.company;

public class Main {

    public static void main(String[] args) {
        WorkerHour workerHour = new WorkerHour();
        WorkerMonths workerMonths = new WorkerMonths();

        System.out.println(workerHour.hourSalary(5000, 40));
        System.out.println(workerMonths.monthSalary(5000, 3));

    }
}
