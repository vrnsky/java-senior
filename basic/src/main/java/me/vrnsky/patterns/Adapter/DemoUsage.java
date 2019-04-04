package me.vrnsky.patterns.Adapter;

public class DemoUsage {

    public static void main(String[] args) {
        XmlStockClient stockClient = new XmlStockProvider();
    }
}
