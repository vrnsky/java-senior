package me.vrnsky.patterns.AbstractFactory;

public class ExpensiveFactory extends AbstractFurnitureFactory {
    @Override
    public Chair getChair() {
        return new ExpensiveChair();
    }

    @Override
    public Sofa getSofa() {
        return new ExpensiveSofa();
    }

    @Override
    public Table getTable() {
        return new ExpensiveTable();
    }
}
