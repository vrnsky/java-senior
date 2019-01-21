package me.vrnsky.patterns.FabricMethod;

public class PaperStorage implements InfoStorage {

    private Object[] paperSheet = new Object[10];
    private int index;

    public PaperStorage() {
        this.index = 0;
    }

    @Override
    public void save(SaveableData data) {
        if (index + 1 > 9) {
            throw new IllegalStateException("Paper sheet is already full!");
        }
        paperSheet[index++] = data;
    }
}
