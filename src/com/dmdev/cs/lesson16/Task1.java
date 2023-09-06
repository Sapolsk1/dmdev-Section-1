package com.dmdev.cs.lesson16;

/**
 * Дан порядковый номер месяца. Вывести на консоль пору года, к которой относится месяц.
 */
public class Task1 {

    public static void main(String[] args) {
        int month = 4;
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Winter");
        } else if (3 <= month && month <= 5) {
            System.out.println("Spring");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Summer");
        } else if (month == 9 || month == 10 || month == 11){
            System.out.println("Autumn");
        } else {
        System.out.println("Month is invalid: " + month);
    }
    }
}
