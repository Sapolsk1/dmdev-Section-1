package com.dmdev.cs.homework3.oop1;

public class House {

    private final int number;
    private final Floor[] floors;

    public House(int number, Floor[] floors) {
        this.number = number;
        this.floors = floors;
    }

    public int getNumber() {
        return number;
    }

    public Floor[] getFloors() {
        return floors;
    }

    void print() {
        System.out.println("Дом № " + number + ", " + "количество этажей " + floors.length);
    }
}
