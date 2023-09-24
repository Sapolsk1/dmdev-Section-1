package com.dmdev.cs.homework3.oop1;

public class Flat {

    private final int number;
    private final Room[] rooms;

    public Flat(int number, Room[] rooms) {
        this.number = number;
        this.rooms = rooms;
    }

    public int getNumber() {
        return number;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void print() {
        System.out.println("Квартира № " + number + ", " + "количество комнат " + rooms.length);
    }
}
