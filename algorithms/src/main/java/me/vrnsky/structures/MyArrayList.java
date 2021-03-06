package me.vrnsky.structures;

import java.util.*;
import java.util.function.UnaryOperator;

public class MyArrayList implements List {

    private Object[] data;
    private int size;
    private int positionPointer = 0;

    public MyArrayList() {
        this(100);
    }

    public MyArrayList(int capacity) {
        this.data = new Object[capacity];
    }

    @Override
    public boolean add(Object o) {
        ensureCapacityIfNeeds();
        if (positionPointer + 1 > data.length) {
            ensureCapacityIfNeeds();
        }
        data[positionPointer++] = o;
        size++;
        return true;
    }

    @Override
    public boolean addAll(Collection c) {
        if (!isEmpty()) {
            Object[] tail = c.toArray();
            Object[] newData = new Object[tail.length + data.length];
            System.arraycopy(data, 0, newData, 0, data.length);
            System.arraycopy(tail, 0, newData, data.length, tail.length);
            data = newData;
            size += c.size();
        } else {
            for (Object o : c) {
                data[positionPointer++] = o;
            }
            size += c.size();
        }
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(Object o) {
        for (Object obj : this.data) {
            if (obj != null && obj.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return this.data;
    }

    @Override
    public boolean remove(Object o) {
        if (contains(o)) {
            int removeIndex = -1;
            for (int index = 0; index < data.length; index++) {
                Object ourData = data[index];
                if (ourData != null && ourData.equals(o)) {
                    removeIndex = index;
                }
            }
            if (removeIndex != -1) {
                data[removeIndex] = null;
                size--;
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        /**
         * Работать должно следующим образом все элементы справа от index
         * Сдвигаем вправо на размер коллекции, и затем с помощью System.arraycopy
         * Копируем значения в массив
         */
        return true;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        if (containsAll(c)) {
            Iterator iterator = c.iterator();
            while (iterator.hasNext()) {
                remove(iterator.next());
            }
        }
        return true;
    }

    @Override
    public boolean containsAll(Collection c) {
        int count = 0;
        for (Object object : data) {
            Iterator iterator = c.iterator();
            while (iterator.hasNext()) {
                Object next = iterator.next();
                if (object != null && object.equals(next)) {
                    count++;
                }
            }
        }
        return count == c.size();
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public void replaceAll(UnaryOperator operator) {

    }

    @Override
    public void sort(Comparator c) {

    }

    @Override
    public void clear() {
        data = new Object[]{};
    }

    @Override
    public Object get(int index) {
        if (isValidIndex(index)) {
            return data[index];
        } else {
            throw new RuntimeException("ArrayIndexOutOfBoundException");
        }
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {
        if (isValidIndex(index)) {
            data[index] = element;
        } else {
            add(element);
        }
    }

    @Override
    public Object remove(int index) {
        Object removed = null;
        if (isValidIndex(index)) {
            removed = data[index];
            data[index] = null;
            size--;
        }
        return removed;
    }

    @Override
    public int indexOf(Object o) {
        for (int index = 0; index < data.length; index++) {
            Object element = data[index];
            if (element != null && element.equals(o)) {
                return index;
            }
        }
        throw new NoSuchElementException("No such element at the list");
    }

    @Override
    public int lastIndexOf(Object o) {
        for (int index = data.length - 1; index >= 0; index--) {
            Object element = data[index];
            if (element != null && data[index].equals(o)) {
                return index;
            }
        }
        throw new NoSuchElementException("No such element at the list");
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public Spliterator spliterator() {
        return null;
    }

    private void ensureCapacityIfNeeds() {
        int newLength = (data.length * 3) / 2 + 1;
        Object[] newValues = new Object[newLength];
        System.arraycopy(data, 0, newValues, 0, data.length);
        this.data = newValues;
    }

    private boolean isValidIndex(int askedPosition) {
        return askedPosition >= 0 && askedPosition < data.length;
    }
}
