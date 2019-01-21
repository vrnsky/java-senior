package me.vrnsky.algorithms;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class QuickSortTest {

    @Test
    public void whenTryToSortArrayShouldCheckThatArray() {
        QuickSort quickSort = new QuickSort();
        int[] array = new int[]{1, 2, 3, 4, 0, -1};
        quickSort.quickSort(array, 0, array.length - 1);
        assertThat(array, is(new int[]{-1, 0, 1, 2, 3, 4}));
    }

}