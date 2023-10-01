package com.dmdev.cs.homework4.task2.celestialbodies;

public abstract class CelestialBody {
    private double mass;

    private double radius;
    private double volume;
    public CelestialBody(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
        this.volume = 4 / 3 * 3.14 * Math.pow(radius, 3);
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int equalsTwoBody(CelestialBody celestialBody) {
        return Double.compare(this.mass, celestialBody.getMass());
    }

    public double getDiameter() {
        return this.radius * 2;
    }

    @Override
    public String toString() {
        return "CelestialBody{" +
                "mass=" + mass +
                ", radius=" + radius +
                ", volume=" + volume +
                '}';
    }
}
