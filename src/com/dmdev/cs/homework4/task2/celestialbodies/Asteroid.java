package com.dmdev.cs.homework4.task2.celestialbodies;

import com.dmdev.cs.homework4.task2.interfacies.Flyable;

public class Asteroid extends CelestialBody implements Flyable {

    public Asteroid(double mass, double radius) {
        super(mass, radius);
    }

    @Override
    public void fly() {
        System.out.println("Астероид летит");
    }

    @Override
    public String toString() {
        return String.format("Asteroid :%s", super.toString());
    }
}
