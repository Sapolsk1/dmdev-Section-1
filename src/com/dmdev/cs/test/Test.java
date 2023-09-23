package com.dmdev.cs.test;

public class Test {

    public static void main(String[] args) {
        String s = new String("abc");
        s.intern();
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s);
    }
}
