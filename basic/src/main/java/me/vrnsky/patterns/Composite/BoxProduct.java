package me.vrnsky.patterns.Composite;

import java.util.ArrayList;
import java.util.List;

public class BoxProduct implements Product {

    private List<Product> products = new ArrayList<>();

    public BoxProduct(List<Product> products) {
        this.products = products;
    }


    @Override
    public int cost() {
        if (products != null && !products.isEmpty()) {
            return products.stream().mapToInt(Product::cost).sum();
        }
        return 0;
    }
}
