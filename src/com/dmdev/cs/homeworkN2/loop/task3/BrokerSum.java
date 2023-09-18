package com.dmdev.cs.homeworkN2.loop.task3;

public class BrokerSum {

    public static double calculateBrokerSum(double salary, int time) {
        double result = 0;
        for (int currentTime = 2; currentTime < time; currentTime++) {
            if (currentTime % 7 == 0) {
                salary += 400;
            }
            result += salary * 0.9 - 300;
        }
        return result;
    }
}
