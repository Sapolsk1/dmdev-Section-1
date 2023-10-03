package com.dmdev.cs.homework4.task2.celestialbodies;

import com.dmdev.cs.homework4.task2.interfacies.Rotatable;

public class Planet extends CelestialBody implements Rotatable {

    public Planet(double mass, double radius) {
        super(mass, radius);
    }

    @Override
    public void rotate() {
        System.out.println("Вращаюсь вокруг звезды");
    }

    @Override
    public String toString() {
        return String.format("Planet :%s", super.toString());
    }
}
