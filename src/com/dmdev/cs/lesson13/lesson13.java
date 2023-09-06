package com.dmdev.cs.lesson13;

public class lesson13 {
    public static void main(String[] args) {
        int value = 0;
//        boolean test = value > 0;
        if (value > 0) {
            System.out.println(value + " Positive value");
        } else if (value < 0){
            System.out.println(value + " is not positive");
        } else {
            System.out.println(value + " is zero");
        }
    }
}
