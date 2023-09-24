package com.dmdev.cs.homework3.oop1;

public class Room {

    private final boolean isPassageway;

    public Room(boolean isPassageway) {
        this.isPassageway = isPassageway;
    }

    public boolean isPassageway() {
        return isPassageway;
    }

    void print() {
        System.out.println("Проходная комната ? = " + isPassageway);
    }
}
