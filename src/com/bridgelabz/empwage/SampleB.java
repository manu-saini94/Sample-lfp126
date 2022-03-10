package com.bridgelabz.empwage;

public class SampleB {
    // local , instance and static
    // data types  and types of variables

    public SampleB() {
        System.out.println("Sample -B");
    }

    SampleB(int a, int b) {

    }
    //.class files
    //class-loader
    // static-pool
    static final int STATIC_VAR = 10; // class level variable ,
    // only loaded once at class loading,
    // only one copy of this variable shared among all the members




    public static float m1(int var){
       int x = 10; // local var
        System.out.println("var:"+var);
        System.out.println("m1 :"+x);
        System.out.println("val:"+STATIC_VAR);
        return x+STATIC_VAR+var;
    }

    public static void main(String[] args) {

        SampleB obj1 = new SampleB(1,2);
//        System.out.println(args[0]);
        int x = 9;// local variable
        float returnVal = m1(x);
        System.out.println(returnVal);
        System.out.println("for loop");
        for(int i=0;i<5;i++){
            int y = 10;
            System.out.println("for static var:"+STATIC_VAR);
            System.out.println(i+y);
        }
//        STATIC_VAR = 20;
        System.out.println("main static var:"+STATIC_VAR);
        m1(10);
    }

}
