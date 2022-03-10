package com.bridgelabz.empwage;

public class SampleC {

    static int STATIC_VAR = 10;

    public static int sampleMethod() {
        STATIC_VAR = 20;
        System.out.println("Sample Method:" + STATIC_VAR);
        int x = 10;
        return x;
    }

    public SampleC tempMethod(int a){
        System.out.println("SampleC testMethod()");
        return new SampleC();
    }

    public static void main(String[] args) {
        System.out.println("before:"+STATIC_VAR);
        int x = sampleMethod();
        System.out.println("main:" + x+STATIC_VAR);
        STATIC_VAR = 30;
        System.out.println("after change :"+ STATIC_VAR);
    }
}
