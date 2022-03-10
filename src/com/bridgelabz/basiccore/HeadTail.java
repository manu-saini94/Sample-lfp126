package com.bridgelabz.basiccore;

import com.bridgelabz.empwage.SampleE;

public class HeadTail extends SampleE{

    public static void main(String[] args) {
        HeadTail headTail = new HeadTail();
        headTail.instanceMethod(); // object level method
        staticMethod(); // no object creation required for calling static method
        // directly called by class name
        System.out.println(headTail.x);
        System.out.println(y);

    }
}
