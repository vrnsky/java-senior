package me.vrnsky;

import me.vrnsky.algorithms.Summator;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

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