package com.bridgelabz.empwage;

public class SampleE extends SampleC {
    // Method types : static and non-static(instance level method)
   // Access specifiers : public , private , protected , default
   // Encapsulation : getter-setter
    // Abstraction : Abstract class , Interface
   // Polymorphism : same name - different behavoiur --- Runtime , compile-time
    // Overriding  and Overloading
    // Overloading : method-same name  , different parameters (number of args or type of args)  -  same class - same name - different parameters
    // Overriding : covarient return types concept
    // Inheritence :
    protected int x = 25;
    protected static int y = 30;

    protected void instanceMethod(){
        System.out.println("this is instance Method");

    }

    protected static void staticMethod(){
        System.out.println("this is static Method");
    }

    public void methodA(float b, int z){

    }

    public int methodA(int a , int c){
        return 1;
    }
    // Object  ---->  String


    @Override
    public SampleC tempMethod(int a) {
        return super.tempMethod(a);
    }

    public static void main(String[] args) {
        SampleE sampleE = new SampleE();
        sampleE.instanceMethod();
        staticMethod();
        System.out.println(sampleE.x);
        System.out.println(y);
        sampleE.methodA(1,3);
        sampleE.methodA(1.0f,4);
        SampleC sampleC = new SampleC();
        sampleC.tempMethod(1);
//        System.out.println(SampleC.STATIC_VAR);
//        sampleE.tempMethod(1);
        sampleE.tempMethod(1);
        System.out.println(sampleMethod());




    }

}
