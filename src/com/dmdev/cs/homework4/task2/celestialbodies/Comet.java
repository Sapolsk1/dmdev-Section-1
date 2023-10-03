package com.dmdev.cs.homework4.task2.celestialbodies;

import com.dmdev.cs.homework4.task2.interfacies.Flyable;

public class Comet extends CelestialBody implements Flyable {

    public Comet(double mass, double radius) {
        super(mass, radius);
    }

    @Override
    public void fly() {
        System.out.println("Комета летит");
    }

    @Override
    public String toString() {
        return String.format("Comet :%s", super.toString());
    }
}
