package com.dmdev.cs.homework4.task2.utils;

import com.dmdev.cs.homework4.task2.celestialbodies.CelestialBody;
import com.dmdev.cs.homework4.task2.celestialbodies.Star;

public class SpaceUtils {

    public static double attract(CelestialBody celestialBody1, CelestialBody celestialBody2, int distance) {
        return celestialBody1.getMass() * celestialBody2.getMass() / Math.pow(distance, 2) * 6.67 / Math.pow(10, 11);
    }

    public static boolean isStar(CelestialBody celestialBody) {
        return celestialBody instanceof Star;
    }
}
