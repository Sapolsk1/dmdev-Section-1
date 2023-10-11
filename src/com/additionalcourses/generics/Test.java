package com.additionalcourses.generics;

public class Test {

    public static void main(String[] args) {
//        f(new A());
//        f(new B());

        B b = new B();
        b.getName();
    }

    public static void f(A arg) {
        arg.getName();
    }

    static class A {
        String getName() {
            return "A";
        }
    }

    static class B extends A {

//        @Override
//        String getName() {
//            return "B";
//        }
    }
}