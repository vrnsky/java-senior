package me.vrnsky.structures;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

public class MyArrayListTest {

    @Test
    @SuppressWarnings("unchecked")
    public void whenTryToAddNewValueToTheArrayListShouldCheckThatItAdded() {
        List list = new MyArrayList();
        String context = "context";
        list.add(context);
        String actual = (String) list.get(0);
        assertThat(actual, is("context"));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void whenTryToCheckSizeShouldCheckThatItShowCorrectValue() {
        List list = new MyArrayList();
        String context = "context1";
        String anotherContext = "contextAnother";
        list.add(context);
        list.add(anotherContext);
        assertThat(list.size(), is(2));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void whenTryToCheckThatElementContainsShouldTrueIfContains() {
        List list = new MyArrayList();
        String context = "context";
        list.add(context);
        assertThat(list.contains(context), is(true));
    }

    @Test
    public void whenListIsEmptyShouldIsEmptyReturnTrue() {
        List list = new MyArrayList();
        assertThat(list.isEmpty(), is(true));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void whenRemoveElementFromListShouldCheckThatIsRemoved() {
        List list = new MyArrayList();
        String context = "context";
        list.add(context);
        list.remove(context);
        assertThat(list.isEmpty(), is(true));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void whenTryRemoveAllElementsShouldCheckThatAllRemoved() {
        List list = new MyArrayList();
        list.addAll(Arrays.asList("context1", "context2", "context3"));
        list.removeAll(Arrays.asList("context1", "context2", "context3"));
        assertThat(list.size(), is(0));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void whenTryGetFirstIndexOfTheElementShouldCheckThatIsEarlier() {
        List list = new MyArrayList();
        list.addAll(Arrays.asList("context1", "context2", "context3"));
        assertThat(list.indexOf("context1"), is(0));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void whenTryLastIndexOfTheElementShouldCheckThatIsLast() {
        List list = new MyArrayList();
        list.addAll(Arrays.asList("context1", "context2", "context3"));
        assertThat(list.lastIndexOf("context2"), is(1));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void whenTryAddByIndexShouldCheckThatItAdded() {
        List list = new MyArrayList();
        list.add("egor");
        list.add("egor");
        list.add(0, "voronyansky");
        assertThat(list.get(0), is("voronyansky"));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void whenRemoveByIndexShouldCheckThatIsWasRemoved() {
        List list = new MyArrayList();
        list.add("egor");
        list.add("voronyansky");
        list.remove(1);
        assertThat(list.get(1), is(nullValue()));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void speedTestInsertComparing() {
        List<String> jdkList = new ArrayList<>();
        List myList = new MyArrayList();
        int elements = 30;

        long startTime = System.nanoTime();
        for (int index = 0; index < elements; index++) {
            jdkList.add("jdkLists");
        }
        long finishTime = System.nanoTime();
        System.out.println((finishTime - startTime) + " ns take " + jdkList.size() + " insert into jdkList");

        startTime = System.nanoTime();

        for (int index = 0; index < elements; index++) {
            myList.add("myLists");
        }
        finishTime = System.nanoTime();
        System.out.println((finishTime - startTime) + " ns take " + myList.size() + " insert into my list");
    }
}