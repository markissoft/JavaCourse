package com.company;

public class WorkerHour implements Salary {

    @Override
    public int hourSalary(int salary, int hours) {
        return hours * salary;
    }

    @Override
    public int monthSalary(int salary, int months) {
        return months * salary;
    }
}
