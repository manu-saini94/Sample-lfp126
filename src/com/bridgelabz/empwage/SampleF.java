package com.bridgelabz.empwage;

public class SampleF {

    //
    public static void main(String[] args) {
      SampleE sampleE = new SampleE();
      sampleE.instanceMethod(); // object level method
      SampleE.staticMethod(); // no object creation required for calling static method
        // directly called by class name
        System.out.println(sampleE.x);
        System.out.println(SampleE.y);
    }
}
