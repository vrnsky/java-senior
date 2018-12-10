package me.vrnsky;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SelectionSortTest {

    @Test
    public void whenTryToSortShouldCheckThatCorrectlySorted() {
        SelectionSort sorter = new SelectionSort();
        int[] sorted = sorter.sort(new Integer[]{3, -2, 1});
        assertThat(sorted, is(new int[]{-2, 1, 3}));
    }
}