package me.vrnsky;

public class SelectionSort {

    private int findMinimal(Integer[] array, int start, int finish) {
        int min = Integer.MAX_VALUE;
        for (int index = start; index < finish; index++) {
            if (array[index] != null && array[index] < min) {
                min = array[index];
                array[index] = null;
            }
        }
        return min;
    }

    public int[] sort(Integer[] array) {
        int[] sorted = new int[array.length];
        int index = 0;
        for (int counter = 0; counter < array.length; counter++) {
            sorted[index++] = findMinimal(array, counter, array.length);
        }
        return sorted;
    }
}
