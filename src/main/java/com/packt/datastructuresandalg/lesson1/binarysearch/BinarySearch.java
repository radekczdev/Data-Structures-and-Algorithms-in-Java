package com.packt.datastructuresandalg.lesson1.binarysearch;

public class BinarySearch {
    public boolean binarySearch(int x, int[] sortedNumbers) {
        System.out.println("Looking for: " + x);
        boolean containsX = false;
        int start = 0;
        int end = sortedNumbers.length - 1;

        while(!containsX && start <= end) {
            int mid = (end - start)/2 + start;
            final var valueAtMid = sortedNumbers[mid];
            printArrayWithHighlights(sortedNumbers,start,mid,end);
            if(valueAtMid == x) {
                containsX = true;
            } else if(valueAtMid > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return containsX;

    }

    private void printArrayWithHighlights(int[] array, int start, int mid, int end) {
        for (int i = 0; i < array.length; i++) {
            if (i == start) System.out.print("[S]");
            if (i == mid) System.out.print("[M]");
            if (i == end) System.out.print("[E]");
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.binarySearch(7, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(binarySearch.binarySearch(0, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(binarySearch.binarySearch(1, new int[]{1, 2, 3, 4,5}));
    }
}