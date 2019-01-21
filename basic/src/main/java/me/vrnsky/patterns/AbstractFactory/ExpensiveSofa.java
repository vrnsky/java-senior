package me.vrnsky.patterns.AbstractFactory;

public class ExpensiveSofa implements Sofa {
    @Override
    public void info() {
        System.out.println("It is expensive sofa");
    }
}
