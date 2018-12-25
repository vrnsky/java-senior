package me.vrnsky.structures;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

public class VectorTest {

    @Test
    public void whenAddElementShouldCheckThatAdded() {
        Vector vector = new Vector();
        String context = "context";
        vector.add(context);
        assertThat(vector.get(0), is(context));
    }

    @Test
    public void whenRemoveElementShouldCheckThatElementWasRemoved() {
        Vector vector = new Vector();
        String context = "context";
        vector.add(context);
        vector.remove(context);
        assertThat(vector.get(0), is(nullValue()));
    }
}