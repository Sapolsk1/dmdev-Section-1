package com.dmdev.cs.homework3.oop1;

public class Main {

    public static void main(String[] args) {
        Room room = new Room(true);
        Flat flat = new Flat(5, new Room[]{room});
        Floor floor = new Floor(6, new Flat[]{flat});
        House house = new House(3, new Floor[]{floor});
        room.print();
        flat.print();
        floor.print();
        house.print();
        System.out.println("-----------------------------------");
        printAllInformation(house);
    }

    public static void printAllInformation(House house) {
        house.print();
        for (Floor floor : house.getFloors()) {
            floor.print();
            for (Flat flat : floor.getFlats()) {
                flat.print();
                for (Room room : flat.getRooms()) {
                    room.print();
                }
            }
        }

    }


}
