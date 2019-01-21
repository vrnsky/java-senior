package me.vrnsky.patterns.AbstractFactory;

public class CheapFactory extends AbstractFurnitureFactory {
    @Override
    public Chair getChair() {
        return new CheapChair();
    }

    @Override
    public Sofa getSofa() {
        return new CheapSofa();
    }

    @Override
    public Table getTable() {
        return new CheapTable();
    }
}
