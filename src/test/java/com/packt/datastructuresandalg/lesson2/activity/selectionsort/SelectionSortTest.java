package com.packt.datastructuresandalg.lesson2.activity.selectionsort;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SelectionSortTest {

    SelectionSort selectionSort = new SelectionSort();

    @Test
    void testEvenElements() {
        int[] numbers = new int[]{5, 3, 5, 1, 6, 8, 1, 9, 0, 1, 3, 12};
        selectionSort.sort(numbers);
        assertArrayEquals(new int[]{0, 1, 1, 1, 3, 3, 5, 5, 6, 8, 9, 12}, numbers);
    }

    @Test
    void testOddsElements() {
        int[] numbers = new int[]{5, 3, 5, 1, 6, 8, 1, 9, 0, 1, 16, 3, 12};
        selectionSort.sort(numbers);
        assertArrayEquals(new int[]{0, 1, 1, 1, 3, 3, 5, 5, 6, 8, 9, 12, 16}, numbers);
    }

    @Test
    void testAlreadySorted() {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        selectionSort.sort(numbers);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, numbers);
    }

    @Test
    void testSameNumber() {
        int[] numbers = new int[]{3, 3, 3, 3, 3};
        selectionSort.sort(numbers);
        assertArrayEquals(new int[]{3, 3, 3, 3, 3}, numbers);
    }

    @Test
    void testEmpty() {
        int[] numbers = new int[]{};
        selectionSort.sort(numbers);
        assertArrayEquals(new int[]{}, numbers);
    }

    @Test
    void testOneElement() {
        int[] numbers = new int[]{8};
        selectionSort.sort(numbers);
        assertArrayEquals(new int[]{8}, numbers);
    }
}
