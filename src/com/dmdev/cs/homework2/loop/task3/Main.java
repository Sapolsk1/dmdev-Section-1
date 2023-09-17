package com.dmdev.cs.homework2.loop.task3;

/**
 * Программист Ваня сразу после окончания курсов dmdev устроился в IT компанию на позицию Junior Java Developer с зарплатой 600$ в месяц.
 * Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.
 * 300$ в месяц Ваня тратит на еду и развлечения.
 * 10% от зарплаты Ваня ежемесячно переводит на счет брокера, чтобы инвестировать в акции с доходностью 2% в месяц.
 *
 * Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.
 *
 * Для интереса: попробовать увеличить процент, которые Ваня инвестирует из своей зарплаты
 */

public class Main {

    private static final double PERCENT = 0.12;

    public static void main(String[] args) {
        double salary = 600;
        int time = 7;
        double salaryPlus = 400;
        double expense = 1800;
        double percentToBroker = 0.1;
        double result = calculate(salary, time, salaryPlus, expense, percentToBroker);
        System.out.println(result);
//        System.out.println(600 * 6 + 1000 * 6 + 1400 * 6 + 1800 * 6 + 2200 * 6 + 2600 * 6);

    }

    private static double calculate(double salary, int time, double salaryUp, double expense, double percentToBroker) {
        double result = 1800;
        double brokerAccount = 0;
        for (int currentTime = 2; currentTime < time; currentTime++) {

            salary = salary + salaryUp;
            double y = result + (salary * 6);
//            System.out.println(y);
            double i = y - expense;
//            System.out.println(i);
            result = i * (percentToBroker * 6);
            brokerAccount += result * PERCENT;
        }
        System.out.println(result);
        return brokerAccount;
    }
}
