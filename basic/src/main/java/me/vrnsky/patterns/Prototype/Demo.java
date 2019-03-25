package me.vrnsky.patterns.Prototype;

public class Demo {

    public static void main(String[] args) {
        Prototypeable<Blueprint> original = new Blueprint(1L, "Yegor");
        Prototypeable<Blueprint> copy = original.prototype();

        System.out.println(((Blueprint) original).getId());
        System.out.println(((Blueprint) copy).getId());
    }
}
