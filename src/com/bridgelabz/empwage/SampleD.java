package com.bridgelabz.empwage;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SampleD extends SampleB {

    float floatInstanceVar = 10.0f;
    int instanceVar; // Object-level variable
    // separate copy for separate objects
    // it will get memory when we are creating the object

    static int var;
    SampleD(){
        super();
        System.out.println("Sample-D");
    }


    static void methodSample() throws UnsupportedEncodingException {
        int x =0 ;
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out, "UTF-8"));
        writer.flush();
        writer.close();
    }



// Main Thread
    public static void main(String[] args)   {

        SampleD sampleD = new SampleD(); // Object or instance
        SampleD sampleD1 = new SampleD();
        sampleD.instanceVar = 20;
        for(int i=0;i<=10;i++){
            System.out.println("x:"+i);
        }

        try {
            methodSample();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        int k=0;
        while (k<=10){
            System.out.println("y:"+k);
            k++;
        }

        int h=0;
        do{
            System.out.println("z"+h);
            h++;
        }while(h<=-1);



//        System.out.println(sampleD.instanceVar);
//        System.out.println(sampleD.floatInstanceVar);
//        System.out.println(sampleD1.instanceVar);
//        System.out.println(sampleD1.floatInstanceVar);




        Thread t =new Thread();
        t.start();
        Integer[][] array = new Integer[5][5];

        for (int i=0;i< 5;i++){
            for (int j = 0;j<i;j++){
                array[i][j] = i+j;
            }
        }
        for (int i=0;i< 5;i++){
            System.out.println();
            for (int j = 0;j<i;j++){
                System.out.println(array[i][j]+ " ");
            }
        }



    }
}


                        //  JVM Architecture

// .java - > compile  -> .class file(byte code)

//  .class file  - > class-loader(loading, linking,initialzation) - >
//   Loading -> bootstrap CL, application CL , extention CL - byte code load happens here
//   Linking -> Verify , Prepare , Resolve
//   Initialization ->

                  //   JVM - Memory

//Method Area , Heap Area , Stack Area, PC Registers , Native Method Stack

// Method Area -> class level info of .class file, static part (variables)
// Heap Area -> Object level - instance part
// Stack Area -> stack frames
// PC Registers - >  PC register for each thread - > address of next instructions

                 //  Execution Engine
// Interpreter  , JIT Compiler  - Profiler  , GC    -------> Uses -> JNI (Java Native Interface)
// Machine level code is generated .                                 Native Method Libraries


// Platform independent ----->  .class files  given to execution engine(interpreter)








