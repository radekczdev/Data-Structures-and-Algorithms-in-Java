package com.packt.datastructuresandalg.lesson2.activity.mergesort;

public class MergeSort {

    private void merge(int[] array, int start, int middle, int end) {
        int lower = start;
        int higher = middle+1;

        var temporary = new int[end - start + 1];

        for (int i = 0; i <= end - start; i++) {
            if (lower < middle + 1 &&  (higher > end || array[lower] <= array[higher])) {
                temporary[i] = array[lower];
                lower++;
            } else {
                temporary[i] = array[higher];
                higher++;
            }
        }
        replaceElementsInArray(temporary, array, start);
    }

    private void replaceElementsInArray(int[] source, int[] target, int start) {
        for (int j : source) {
            target[start] = j;
            start++;
        }
    }

    private void mergeSort(int[] array, int start, int end) {
        if (end > start) {
            int middle = (end - start) / 2 + start;
            mergeSort(array, start, middle);
            mergeSort(array, middle + 1, end);
            merge(array, start, middle, end);
        }
    }

    public void mergeSort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }
}
