package com.bridgelabz.oops;

public class EmployeeWage {

    public static void main(String[] args) {

        int empPresent = (int)(Math.floor(Math.random()*10) % 2);   // number b/w   0 and 1
        if(empPresent == 0)
            System.out.println("Employee is absent ");
        else
            System.out.println("Employee is present");
    }

}
