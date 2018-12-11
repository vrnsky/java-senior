package me.vrnsky;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort {

    private int findMinimal(List<Integer> numbers) {
        int smallestIndex = 0;
        int min = numbers.get(0);
        for (int index = 0; index < numbers.size(); index++) {
            if (min >= numbers.get(index)) {
                min = numbers.get(index);
                smallestIndex = index;
            }
        }
        return smallestIndex;
    }

    public List<Integer> sort(List<Integer> array) {
        List<Integer> sorted = new ArrayList<>();
        while (!array.isEmpty()) {
            int smallest = findMinimal(array);
            sorted.add(array.get(smallest));
            array.remove(smallest);
        }
            return sorted;
    }
}
