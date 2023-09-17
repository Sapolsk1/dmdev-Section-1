package com.dmdev.cs.homeworkN2.loop.task3;

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

public class Second {

    public static void main(String[] args) {
        double salary = 600;
        int time = 42;
        double result = calculate(salary, time);
        System.out.println(result);
    }

    private static double calculate(double salary, int time) {
        double result = 0;
        double brokerAccount = 0;
        for (int currentTime = 2; currentTime < time; currentTime++) {
            if (currentTime % 7 == 0) {
                salary += 400;
            }
            brokerAccount += salary * 0.1;
            result += salary * 0.9 - 300;
        }
        System.out.println(brokerAccount);
        return result;
    }
}
