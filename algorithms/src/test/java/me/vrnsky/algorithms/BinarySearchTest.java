package me.vrnsky.algorithms;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BinarySearchTest {


    @Test
    public void whenTryToSortValidArrayShouldCheckThatCorrectlyFindIndexOfTheElement() {
        BinarySearch sort = new BinarySearch();
        int index = sort.search(new int[]{1, 2, 3}, 3);
        assertThat(index, is(2));
    }

    @Test
    public void whenTryToSortNotValidArrayShouldCheckThatReturnSome() {
        BinarySearch sort = new BinarySearch();
        int index = sort.search(new int[]{3, 1, 2, 4, 13, -1}, 3);
        assertThat(index, is(-1));
    }

}