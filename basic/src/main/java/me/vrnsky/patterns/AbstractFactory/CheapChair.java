package me.vrnsky.patterns.AbstractFactory;

public class CheapChair implements Chair {
    @Override
    public void info() {
        System.out.println("It is cheap chair");
    }
}
