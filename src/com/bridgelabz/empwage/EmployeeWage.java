package com.bridgelabz.empwage;

public class EmployeeWage {

    // class loader
    // class load  -  static pool

    static int sampleVar = 10;
    int instanceVar = 30;
    static final int WAGE_PER_HOUR = 20;
    static final int IS_PART_TIME = 1;
    static final int IS_FULL_TIME = 2;
    static final int MAX_WORKING_DAYS = 20;
    static final int MAX_WORKING_HRS = 100;

    EmployeeWage() {

    }

    EmployeeWage(int var) {
//        sampleVar = instanceVar;
       instanceVar = var;
    }

    @Override
    public int hashCode() {
        // this and super
        System.out.println(sampleVar);
        System.out.println("Employee Wage hashcode()");
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "EmployeeWage class toString() is called "+ hashCode();
    }


//    @Override
//    public String toString() {
//        return "EmployeeWage" + this.hashCode();
//    }

    public int sampleMethod(){
        System.out.println(sampleVar);
        System.out.println("Val:"+instanceVar);
        return 1;
    }

    public static void staticSample(){
        System.out.println(sampleVar);
        int x =20;
        EmployeeWage employeeWage = new EmployeeWage();
        System.out.println(employeeWage.instanceVar);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeWage that = (EmployeeWage) o;
        return instanceVar == that.instanceVar;
    }

    public static void main(String[] args) {
      Float x=10f;
       Float y=10f;
        EmployeeWage employeeWage = new EmployeeWage();
        SnakeAndLadder snakeAndLadder = new SnakeAndLadder();
        System.out.println("first obj:" + employeeWage.instanceVar);
        EmployeeWage employeeWage1 = new EmployeeWage(3);
        System.out.println("Second obj:" + employeeWage1.instanceVar);
        System.out.println(employeeWage.equals(employeeWage1));
        System.out.println(employeeWage);





       employeeWage.equals(employeeWage1);

//        System.out.println("main method value before: "+WAGE_PER_HOUR);
        int var1 = employeeWage.sampleMethod();
//        System.out.println("main method value after: "+WAGE_PER_HOUR);
        employeeWage1.sampleMethod();



        System.out.println("Welcome to Employeewage");
        int empHrs = 0;
        int empWage = 0;
        int totalEmpWage = 0;
        int totalWorkingDays = 0;
        int totalWorkingHrs = 0;


        while (totalWorkingDays < MAX_WORKING_DAYS && totalWorkingHrs <= MAX_WORKING_HRS) {
            int randomVal = (int) Math.floor(Math.random() * 10) % 3; // 0,1,2
            switch (randomVal) {
                case IS_PART_TIME:
                    empHrs = 8;
                    break;
                case IS_FULL_TIME:
                    empHrs = 16;
                    break;
                default:
                    empHrs = 0;
            }
            empWage = empHrs * WAGE_PER_HOUR;
            if (totalWorkingHrs + empHrs > 100)
            break;
            totalWorkingHrs = totalWorkingHrs + empHrs;
            totalEmpWage += empWage;
            System.out.println("Emp Wage :" + empWage);
            totalWorkingDays++;
        }

        System.out.println("Total days = "+totalWorkingDays);
        System.out.println("Total Hrs = "+ totalWorkingHrs);
        System.out.println("Total Wage = " + totalEmpWage);
    }


}
