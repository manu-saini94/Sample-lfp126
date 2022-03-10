package com.bridgelabz.empwage;

import java.util.Random;
import java.util.Scanner;

public class SnakeAndLadder {
    static Random random = new Random();
    static A obj = new A();

    static int getRandomDieValue() {
        int randomValue = random.nextInt(6) + 1;
        return randomValue;
    }

    static int getRandomOption() {
        int randomValue = random.nextInt(3);
        return randomValue;
    }

    @Override
    public String toString() {
        return "snake";
    }

    public static void main(String[] args) {
        SnakeAndLadder obj2 = new SnakeAndLadder();
        System.out.println(obj2);
        int player1DieRoll = getRandomDieValue();
        int option = getRandomOption();
        Scanner scanner = new Scanner(System.in);
        System.out.println(obj.a);
        System.out.println(A.b);
    }
}

class A {
    static int b;
    int a;
}
