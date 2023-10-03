package com.dmdev.cs.homework4.task2.celestialbodies;

public class BlackHole extends CelestialBody {

    public BlackHole(double mass, double radius) {
        super(mass, radius);
    }

    @Override
    public String toString() {
        return String.format("BlackHole :%s", super.toString());
    }
}
