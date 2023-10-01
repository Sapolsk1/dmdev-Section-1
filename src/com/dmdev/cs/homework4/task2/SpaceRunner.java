package com.dmdev.cs.homework4.task2;

import com.dmdev.cs.homework4.task2.celestialbodies.Asteroid;
import com.dmdev.cs.homework4.task2.celestialbodies.CelestialBody;
import com.dmdev.cs.homework4.task2.celestialbodies.Planet;
import com.dmdev.cs.homework4.task2.celestialbodies.Star;
import com.dmdev.cs.homework4.task2.utils.SpaceUtils;

public class SpaceRunner {

    public static void main(String[] args) {
        CelestialBody asteroid = new Asteroid(30000, 1000);
        CelestialBody planet = new Planet(500000, 6000);
        CelestialBody star = new Star(800000, 12000);
        double attract = SpaceUtils.attract(asteroid, planet, 25000);
        boolean isStar1 = SpaceUtils.isStar(star);
        boolean isStar2 = SpaceUtils.isStar(planet);
        System.out.println("Сила притяжения: " + attract);
        System.out.println("Звезда является звездой: " + isStar1);
        System.out.println("Планета является звездой: " + isStar2);
    }
}
