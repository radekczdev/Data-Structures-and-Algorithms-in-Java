package com.packt.datastructuresandalg.lesson2.sorting;

import java.util.Arrays;

public class QuickSort {
    public void sort(int[] numbers) {
        System.out.print("Start: ");
        printNumbers(numbers);
        sort(numbers, 0, numbers.length - 1);
    }

    private void sort(int[] numbers, int start, int end) {
        if (start < end) {
            System.out.println("Next Split");
            printNumbers(numbers);
            int p = partition(numbers, start, end);
            System.out.println("sorting:");
            System.out.println(Arrays.toString(p-1 < start ? new int[]{} : Arrays.copyOfRange(numbers, start, p-1)));
            sort(numbers, start, p - 1);
            printNumbers(numbers);
            System.out.println(Arrays.toString(end < p+1 ? new int[]{} : Arrays.copyOfRange(numbers, p+1, end)));
            sort(numbers, p + 1, end);
        }
    }

    private void printNumbers(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
    }

    private int partition(int[] numbers, int start, int end) {
        int pivot = numbers[end];
        System.out.println("Pivot: " + pivot);
        int x = start - 1;
        for (int i = start; i < end; i++) {
            if (numbers[i] < pivot) {
                x++;
                swap(numbers, x, i);
            }
        }
        swap(numbers, x + 1, end);
        return x + 1;
    }

    private void swap(int[] numbers, int j, int k) {
        int temp = numbers[j];
        numbers[j] = numbers[k];
        numbers[k] = temp;
    }


    public static void main(String args[]) {
        QuickSort quickSort = new QuickSort();
        int[] numbers = new int[]{4,5,33,17,3,21,1,16};
//        int[] numbers = new int[]{2, 5, 7, 2, 4, 2, 8, 1, 0, 9, 3, 6};
        quickSort.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

}