package com.dmdev.cs.homeworkN2.loop.task3;

public class Balance {

    public static double calculateBalance(double salary, int time) {
        double result = 0;
        double brokerAccount = 0;
        for (int currentTime = 2; currentTime < time; currentTime++) {
            if (currentTime % 7 == 0) {
                salary += 400;
            }
            brokerAccount += salary * 0.1;
        }
        return brokerAccount;
    }
}
