package me.vrnsky.patterns.AbstractFactory;

public class Starter {

    public static void main(String[] args) {
        AbstractFurnitureFactory factory = getFactory(100);

        //At the console will be printed a cheap furniture
        factory.getChair().info();
        factory.getSofa().info();
        factory.getTable().info();

        factory = getFactory(10000);

        //At the console will be printed a expensive furniture
        factory.getChair().info();
        factory.getSofa().info();
        factory.getTable().info();

    }

    public static AbstractFurnitureFactory getFactory(int wallet) {
        if (wallet < 999) {
            return new CheapFactory();
        } else {
            return new ExpensiveFactory();
        }
    }
}
