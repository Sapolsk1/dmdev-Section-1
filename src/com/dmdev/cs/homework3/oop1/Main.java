package com.dmdev.cs.homework3.oop1;

/**
 * Представить в виде классов и их композиции следующую модель.
 * - Каждый дом содержит свой номер (int), и множество этажей (массив).
 * - Каждый этаж содержит номер этажа (int), и множество квартир (массив).
 * - Каждая квартира содержит свой номер (int), и множество комнат (массив).
 * - Каждая комната содержит поле проходная она или нет (boolean).
 * В каждом классе реализовать метод print, который на консоль выводит информацию об объекте (должны присутствовать все поля объекта!).
 * Например, метод print класса этаж должен выводить на консоль:
 * “Этаж 2, количество квартир 18”
 * Создание всех объектов вынести в отдельный класс с методом main.
 * Там же реализовать метод printAllInformation, который на вход принимает объект типа дом, и выводит информацию о нем, его этажах, квартирах и комнатах, вызывая методы print.
 */
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
