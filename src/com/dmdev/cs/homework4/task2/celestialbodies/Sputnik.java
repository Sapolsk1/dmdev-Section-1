package com.dmdev.cs.homework4.task2.celestialbodies;

import com.dmdev.cs.homework4.task2.interfacies.Rotatable;

public class Sputnik extends CelestialBody implements Rotatable {

    public Sputnik(double mass, double radius) {
        super(mass, radius);
    }

    @Override
    public void rotate() {
        System.out.println("Вращаюсь вокруг планеты");
    }

    @Override
    public String toString() {
        return String.format("Sputnik :%s", super.toString());
    }
}
