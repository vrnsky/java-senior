package me.vrnsky.algorithms;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DeepSearchTest {

    @Test
    public void whenSearchInDeepShouldCheckThatSearchFindValue() {
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("Egor Voronyansky", Arrays.asList("Anton Treskin", "Zheka Dmitriev", "Mukha"));

        // first layer connection
        graph.put("Anton Treskin", Arrays.asList("Alexandra Maltseva", "Roman Chirko", "Dima Zimonin"));
        graph.put("Zheka Dmitriev", Arrays.asList("Nastya Anysurname", "Masha Pasha"));

        // second layer connection
        graph.put("Alexandra Maltseva", Arrays.asList("Vasilisa Grachevskaya"));

        DeepSearch deepSearch = new DeepSearch();
        assertThat(deepSearch.search(graph, "Vasilisa Grachevskaya", "Egor Voronyansky"), is("Alexandra Maltseva"));
    }
}