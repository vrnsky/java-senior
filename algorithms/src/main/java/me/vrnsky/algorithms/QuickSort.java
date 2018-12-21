package me.vrnsky.algorithms;

public class QuickSort {

    public void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;

        //За опорный элемент принимаем условную середину массива
        int middle = low + (high - low) / 2;
        int opora = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++; //считаем до какого индекса хранятся элементы меньше опорного
            }

            while (array[j] > opora) {
                j--; //считаем до какого индекс хранятся элементы больше опорного
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }
}
