package me.vrnsky.patterns.Composite;

public class SingleProduct implements Product {
    private int cost;

    public SingleProduct(int cost) {
        this.cost = cost;
    }

    @Override
    public int cost() {
        return this.cost;
    }
}
