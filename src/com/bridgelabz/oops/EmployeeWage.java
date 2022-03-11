package com.bridgelabz.oops;

public class EmployeeWage {

    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 16;
    static final int PART_TIME_HOUR = 8;
    static final int IS_PART_TIME = 1;
    static final int IS_FULL_TIME = 2;
    static final int WORKING_DAYS_PER_MONTH = 20;
    static final int WORKING_HOURS_PER_MONTH = 100;

    public static void main(String[] args) {

        int workingDays = 0;
        int totalWage = 0;
        int totalWorkingHours = 0;
        while (workingDays < WORKING_DAYS_PER_MONTH && totalWorkingHours < WORKING_HOURS_PER_MONTH) {
            int empPresent = (int) (Math.floor(Math.random() * 10) % 3);   // number b/w   0 and 1
            int empWage = 0;
            switch (empPresent) {
                case IS_PART_TIME:

                    if(totalWorkingHours + PART_TIME_HOUR <= WORKING_HOURS_PER_MONTH) {
                        empWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                        totalWorkingHours = totalWorkingHours + PART_TIME_HOUR;
                    }
                    break;
                case IS_FULL_TIME:

                    if(totalWorkingHours + FULL_DAY_HOUR <= WORKING_HOURS_PER_MONTH) {
                        empWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                        totalWorkingHours = totalWorkingHours + FULL_DAY_HOUR;
                    }
                    break;
                default:
                    empWage = 0;

            }
            totalWage = totalWage + empWage;
//            int temp = workingDays+1;
            System.out.println("Total Wage for Day "+(workingDays+1)+ " = "+ totalWage);
            workingDays++;
        }
        System.out.println("Total Working Days :"+ workingDays);
        System.out.println("Total Working Hours :"+ totalWorkingHours);
        System.out.println("Employee Wage :"+totalWage);
        }

}
