package me.vrnsky.patterns.Composite;

import java.util.Arrays;

public class Example {

    public static void main(String[] args) {
        Product cup = new SingleProduct(10);
        Product tea = new SingleProduct(20);
        Product book = new SingleProduct(150);

        Product product = new BoxProduct(Arrays.asList(cup, book, tea));

        System.out.println("Cost of cup, tea and book is " + product.cost() + " $");


        Product bookOne = new SingleProduct(100);
        Product bookTwo = new SingleProduct(200);
        Product bookThree = new SingleProduct(150);
        Product books = new BoxProduct(Arrays.asList(bookOne, bookTwo, bookThree));
        Product customerBucket = new BoxProduct(Arrays.asList(books, tea, cup));

        System.out.println("Cost of three books and cup, tea is " + customerBucket.cost() + " $");

    }
}
