package com.dmdev.cs.homework4.task1;

/**
 * Создать класс, описывающий банкомат.
 * <p>
 * Банкомат задается тремя свойствами:
 * - количеством купюр номиналом 10, 20 и 50.
 * <p>
 * Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
 * <p>
 * Сделать методы для добавления денег в банкомат.
 * <p>
 * Сделать метод, снимающий деньги: он принимает сумму денег, а возвращает булево значение - успешность выполнения операции.
 * <p>
 * При снятии денег метод должен распечатывать каким количеством купюр какого номинала выдаётся сумма.
 * Сначала банкомат будет пытаться рассчитаться 50, далее добавит недостающие 20, и только затем 10
 * (не нужно рассматривать более сложные варианты выдачи наличных, чтобы не усложнять алгоритм).
 */
public class Main {

    public static void main(String[] args) {
        CashMachine cashMachine = new CashMachine(0, 0, 0);
        cashMachine.addNominal10(2);
        cashMachine.addNominal20(1);
        cashMachine.addNominal50(1);
        boolean isGiveNominal = cashMachine.isGiveNominal(90);
        boolean isGiveNominal1 = cashMachine.isGiveNominal(90);
        System.out.println(isGiveNominal);
    }
}
