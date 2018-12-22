package me.vrnsky.algorithms;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SummatorTest {

    private Summator summator = new Summator();

    @Test
    public void whenUseIterateSumShouldCheckThatSumCorrect() {
        assertThat(summator.iterativeSum(100), is(5050));
    }

    @Test
    public void whenUseRecursiveSumShouldCheckThatSumCorrect() {
        assertThat(summator.recursiveSum(100), is(5050));
    }
}