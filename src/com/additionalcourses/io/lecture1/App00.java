package com.additionalcourses.io.lecture1;

import java.nio.charset.StandardCharsets;

public class App00 {

    public static void main(String[] args) throws Exception {
        System.out.println("A".getBytes(StandardCharsets.UTF_16BE).length);
        System.out.println("AA".getBytes(StandardCharsets.UTF_16BE).length);
    }
}
