package me.vrnsky.structures;

public class Stack {

    private Object[] data;
    private int insertPointer = 0;
    private int size = 0;

    public Stack() {
        this(100);
    }

    public Stack(int capacity) {
        data = new Object[capacity];
    }

    public void push(Object object) {
        ensureCapacityIfNeeds();
        data[insertPointer++] = object;
        size++;
    }

    public Object pop() {
        Object value = data[size - 1];
        data[size - 1] = null;
        size--;
        return value;
    }

    public Object peek() {
        return data[--size];
    }

    public int size() {
        return size;
    }

    private void ensureCapacityIfNeeds() {
        int partOfData = (data.length * 2) / 3;
        if (size > partOfData) {
            Object[] newData = new Object[data.length + partOfData];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
    }
}
