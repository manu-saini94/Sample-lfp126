package com.bridgelabz.empwage;

public class Sample1 {

    public static void main(String[] args) {

        EmployeeWage employeeWage = new EmployeeWage();
        System.out.println(employeeWage);


        // Naming Conventions
        // package => lowercase ,
        // classes,interface - Pascal case , eg:-   EmployeeWage , Employee
        // variables,object reference, string reference,methods => camelcase  eg:- getEmployeeWage();  , employeeWage
        // Always use meaningfull names
        // constants  , enums  =>  static and final => UPPERCASE with underscores  eg:-   MAX_WORKING_DAYS ,  DAYS

        // primitive and non-primitive
        // primitve
        int x;
        float f;
        double d;
        long l;
        boolean b;
        char c;
        short s;
        byte b2;

        // Non-primitive
        // Arrays ,String , Classes(user defined or predefined) ,Interface ,wrapper classes

        long[] array1 = new long[20];
        long[] array2 = {1, 2, 3, 45};
        Integer[] array3 = new Integer[30];
        array3[3] = 1;

//        EmployeeWage emp1 = new EmployeeWage();
//
//        EmployeeWage emp2 = new EmployeeWage();
//        EmployeeWage[] employeeWagesArray = new EmployeeWage[30];
//        employeeWagesArray[0] = emp1;
//        employeeWagesArray[3] = emp2;
//
//        System.out.println(emp1.hashCode());
//        System.out.println(emp2.hashCode());
//        System.out.println(emp1 + "........" + employeeWagesArray[3]);

        array1[0] = 5;
        array1[19] = 10;
        array1[3] = 100;

        // length vs length()
        for (int i = 0; i < array1.length; i++) {
            System.out.println("array1 : " + array1[i]);
        }

//        int[][] array6 = {{1, 2, 3, 6, 7}, {3, 5, 6, 7}};
//        System.out.println("array-6:" + array6[1][4]);



        int[][] array5 = new int[2][5];
        System.out.println(array5);
        for (int i = 0; i < array5.length; i++) {

            for (int j = 0; j < array5[i].length; j++) {
                if(j!=4)
                array5[i][j] = i * j;
                System.out.println(i+":::"+j + "=> "+array5[i][j]);
            }
        }


        //  array5[0]  => array of length 5
        //   array5[1]
        //   array5[0][1] =>  0


        Sample1 sample1 = new Sample1();
        // Class and object =>
        // vars and data types
        // wrapper classes
        // multiple objects in a class
        // naming conventions
        // heap and stack memory
        // declaration of methods
        // calling methods- arguments
        // Inheritence - Parent to child
        // this
        // constructors - parameterized and default
        // GC
        // final keyword
        // new keyword
        // accesss modifiers

    }
}
