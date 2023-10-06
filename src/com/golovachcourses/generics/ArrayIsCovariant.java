package com.golovachcourses.generics;

public class ArrayIsCovariant {

    public static void main(String[] args) {
        Object[] ref = new Integer[10];
        ref[0] = "Hello";
    }
}
