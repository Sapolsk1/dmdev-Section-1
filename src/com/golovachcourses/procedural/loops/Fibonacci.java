package com.golovachcourses.procedural.loops;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fib(5));
    }

    private static int fib(int i) {
//        System.out.print(" " + i);
        System.out.println(i);
        if(i == 0) return 1;
        if(i == 1) return 1;
        return fib(i - 2) + fib(i - 1);
    }
}
