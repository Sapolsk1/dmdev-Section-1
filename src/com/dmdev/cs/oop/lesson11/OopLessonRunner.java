package com.dmdev.cs.oop.lesson11;

public class OopLessonRunner {

    public static void main(String[] args) {
        Ram ram = new Ram(32);
        Ssd ssd = new Ssd(250);
        Computer computer = new Computer(ssd, ram);
        computer.load();
    }
}
