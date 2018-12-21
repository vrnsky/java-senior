package me.vrnsky.algorithms;

import java.util.List;
import java.util.Map;

public class DeepSearch {

    public String search(Map<String, List<String>> map, String searchValue, String root) {
        List<String> names = map.get(root);
        for (String name : names) {
            if (name.equalsIgnoreCase(searchValue)) {
                return root;
            }
        }
        return search(map, searchValue, names.iterator().next());
    }
}
