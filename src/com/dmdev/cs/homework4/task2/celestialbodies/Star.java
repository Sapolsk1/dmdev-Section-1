package com.dmdev.cs.homework4.task2.celestialbodies;

import com.dmdev.cs.homework4.task2.interfacies.Shineable;

public class Star extends CelestialBody implements Shineable {

    public Star(double mass, double radius) {
        super(mass, radius);
    }

    @Override
    public void shine() {
        System.out.println("Звезда светит");
    }

    @Override
    public String toString() {
        return String.format("Star :%s", super.toString());
    }
}
