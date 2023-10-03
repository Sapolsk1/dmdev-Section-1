package com.dmdev.cs.homework4.task1;

public class CashMachine {
    private int nominal10;
    private int nominal20;
    private int nominal50;

    public CashMachine(int nominal10, int nominal20, int nominal50) {
        this.nominal10 = nominal10;
        this.nominal20 = nominal20;
        this.nominal50 = nominal50;
    }

    public void addNominal10(int value) {
        nominal10 += value;
    }

    public void addNominal20(int value) {
        nominal20 += value;
    }

    public void addNominal50(int value) {
        nominal50 += value;
    }


    public boolean isGiveNominal(int sum) {
        int count50 = sum / 50;
        if (count50 > nominal50) {
            count50 = nominal50;
        }
        sum = sum - count50 * 50;

        int count20 = sum / 20;
        if (count20 > nominal20) {
            count20 = nominal20;
        }
        sum = sum - count20 * 20;

        int count10 = sum / 10;
        if (count10 > nominal10) {
            count10 = nominal10;
        }
        sum = sum - count10 * 10;

        if (sum == 0) {
            System.out.printf("Купюр номиналом 50 - %d%n", count50);
            System.out.printf("Купюр номиналом 20 - %d%n", count20);
            System.out.printf("Купюр номиналом 10 - %d%n", count10);
            nominal10 -=count10;
            nominal20 -=count20;
            nominal50 -=count50;
            return true;
        }
        return false;
    }
}
