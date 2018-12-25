package me.vrnsky.structures;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class Vector {

    private Object[] data;
    private AtomicInteger pointIndex = new AtomicInteger(0);
    private AtomicInteger size = new AtomicInteger(0);

    public Vector() {
        this(10);
    }

    public Vector(int size) {
        this.data = new Object[size];
    }

    public synchronized void add(Object e) {
        ensureCapacityIfNeeds();
        data[pointIndex.getAndIncrement()] = e;
        size.getAndIncrement();
    }

    public synchronized void remove(Object e) {
        Object removed = null;
        for (int index = 0; index < data.length; index++) {
            if (data[index] != null && data[index].equals(e)) {
                removed = data[index];
                data[index] = null;
            }
        }
        if (!Objects.isNull(removed)) {
            size.decrementAndGet();
        }
    }


    public synchronized Object get(int index) {
        return data[index];
    }

    private void ensureCapacityIfNeeds() {
        if (size.get() > data.length) {
            int ensuredCapacity = data.length * 2;
            Object[] newData = new Object[ensuredCapacity];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
    }
}
