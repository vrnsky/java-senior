package me.vrnsky;

import me.vrnsky.algorithms.QuickSort;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void whenTryToSortArrayShouldCheckThatArray() {
        QuickSort quickSort = new QuickSort();
        int[] array = new int[]{1,2,3,4,0,-1};
        quickSort.quickSort(array, 0, array.length - 1);
        assertThat(array, is(new int[]{-1,0,1,2,3,4}));
    }

}