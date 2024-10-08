package com.packt.datastructuresandalg.lesson2.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] numbers = new int[] {2, 5, 7, 2, 4, 2, 8, 1, 0};
        int[] numbers1 = new int[] {2, 5, 7, 2, 4, 2, 8, 1, 0};
        int[] numbers2 = new int[] {2, 5, 7, 2, 4, 2, 8, 1, 0};
        bubbleSort.sort(numbers);
        bubbleSort.sortImprovement1(numbers1);
        bubbleSort.sortImprovement2(numbers2);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers1));
        System.out.println(Arrays.toString(numbers2));
    }

    public void sort(int[] numbers) {
        int numberOfInvokes = 0;
        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    swap(numbers, j, j + 1);
                }
                numberOfInvokes++;
            }
        }
        System.out.println(String.format("Invoked: %s times", numberOfInvokes));
    }

    public void sortImprovement1(int[] numbers) {
        int numberOfInvokes = 0;
        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    swap(numbers, j, j + 1);
                }
                numberOfInvokes++;
            }
        }
        System.out.println(String.format("Invoked: %s times", numberOfInvokes));
    }

    public void sortImprovement2(int[] numbers) {
        int i = 0;
        boolean swapOccured = true;
        while (swapOccured) {
            swapOccured = false;
            i++;
            for (int j = 0; j < numbers.length - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    swap(numbers, j, j + 1);
                    swapOccured = true;
                }
            }
        }
        System.out.println(String.format("Invoked: %s times", i));
    }

    private void swap(int[] numbers, int j, int k) {
        int temp = numbers[j];
        numbers[j] = numbers[k];
        numbers[k] = temp;
    }
}
