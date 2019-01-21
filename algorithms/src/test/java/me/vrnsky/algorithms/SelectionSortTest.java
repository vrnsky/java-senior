package me.vrnsky.algorithms;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SelectionSortTest {

    @Test
    public void whenTryToSortShouldCheckThatCorrectlySorted() {
        SelectionSort sorter = new SelectionSort();
        List<Integer> unsorted = new ArrayList<>();
        unsorted.add(1);
        unsorted.add(-2);
        unsorted.add(3);
        List<Integer> sorted = sorter.sort(unsorted);
        assertThat(sorted, is(Arrays.asList(-2, 1, 3)));
    }
}