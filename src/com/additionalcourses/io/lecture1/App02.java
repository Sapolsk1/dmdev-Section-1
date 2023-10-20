package com.additionalcourses.io.lecture1;

import java.nio.charset.StandardCharsets;

public class App02 {

    public static void main(String[] args) throws Exception {
        System.out.println("ЭЮЯ".getBytes(StandardCharsets.UTF_8).length);
        System.out.println("ЭЮЯ".getBytes("latin1").length);
    }
}
