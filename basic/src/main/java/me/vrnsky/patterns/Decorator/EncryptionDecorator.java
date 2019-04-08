package me.vrnsky.patterns.Decorator;

public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        System.out.println("ENCRYPTED " + data);
    }

    @Override
    public String readData() {
        return "MEOW";
    }
}
