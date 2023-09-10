package com.dmdev.cs.homework.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input minute: ");
        int minutes = scanner.nextInt();
        TimeZone timeZone = new TimeZone();
        timeZone.getTimeZone(minutes);
    }
}
