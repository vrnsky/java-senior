package me.vrnsky.patterns.Decorator;

public class Example {

    public static void main(String[] args) {
        DataSource dataSource = new EncryptionDecorator(new FileDataSource());
        dataSource.writeData("PIN CODE");
        System.out.println(dataSource.readData());
    }
}
