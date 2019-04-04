package me.vrnsky.patterns.Bridge;

public abstract class Shape {
    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public double square();
}
