package me.vrnsky.algorithms;

public class BinarySearch {

    public int search(int[] array, int elem) {
        int low = 0;
        int high = array.length;
        int middle;

        while (low <= high) {
            middle = (high + low) / 2;
            int current = array[middle];
            if (current < elem) {
                low = middle + 1;
            } else if (current > elem) {
                high = middle - 1;
            } else {
                return middle;
            }
        }
        return  -1;
    }
}
