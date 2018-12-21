package me.vrnsky.structures;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
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

}