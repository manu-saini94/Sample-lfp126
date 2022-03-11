package com.bridgelabz.oops;

public class EmployeeWage {

    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;

    public static void main(String[] args) {

        int empPresent = (int)(Math.floor(Math.random()*10) % 2);   // number b/w   0 and 1
        int empWage = 0;
        if (empPresent == 0) {
            System.out.println("Employee is absent ");
        } else {
            empWage = WAGE_PER_HOUR*FULL_DAY_HOUR;
            System.out.println("Employee is present");
        }
        System.out.println("Employee Wage :"+empWage);
        }

}
