package me.vrnsky.structures;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StackTest {

    @Test
    public void whenPushElementShouldCheckThatItAdded() {
        Stack stack = new Stack();
        stack.push("context");
        assertThat(stack.pop(), is("context"));
    }

    @Test
    public void whenPopElementShouldGetLastElement() {
        Stack stack = new Stack();
        stack.push("context1");
        stack.push("context2");
        stack.push("context3");
        assertThat(stack.pop(), is("context3"));
    }

    @Test
    public void whenPegiekElementShouldElementWasNotRemoved() {
        Stack stack = new Stack();
        stack.push("context1");
        stack.push("context2");
        stack.push("context3");
        Object last = stack.peek();
        assertThat(last, is("context3"));
        assertThat(stack.size(), is(3));
    }

    @Test
    public void whenPushElementToFullyStackShouldCheckThatCapacityEnsure() {
        Stack stack = new Stack(10);
        for (int index = 0; index < 6; index++) {
            stack.push(String.valueOf(index));
        }
        stack.push("7");
        stack.push("8");
        stack.push("9");
        stack.push("10");

    }
}