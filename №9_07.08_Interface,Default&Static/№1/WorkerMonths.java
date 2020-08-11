package com.company;

public class WorkerMonths implements Salary {

    @Override
    public int hourSalary(int salary, int hours) {
        return hours * salary;
    }

    @Override
    public int monthSalary(int salary, int months) {
        return months * salary;
    }
}
