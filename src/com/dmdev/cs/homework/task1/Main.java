package com.dmdev.cs.homework.task1;

import java.util.Scanner;

public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        getTimeZone();
    }

    private static void getTimeZone() {
        System.out.println("Input minute: ");
        int minutes = SCANNER.nextInt();
        TimeZone.getTimeZones(minutes);
        SCANNER.close();
    }
}
