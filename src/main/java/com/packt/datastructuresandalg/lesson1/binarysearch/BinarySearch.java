package com.packt.datastructuresandalg.lesson1.binarysearch;

public class BinarySearch {
  public static void main(String[] args) {
    BinarySearch binarySearch = new BinarySearch();
    System.out.println(binarySearch.binarySearch(7, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    System.out.println(binarySearch.binarySearch(0, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    System.out.println(binarySearch.binarySearch(1, new int[] {1, 2, 3, 4, 5}));
  }

  public boolean binarySearch(int x, int[] sortedNumbers, int start, int end) {
    System.out.println("Looking for: " + x);
    if (end > start) {
      int mid = (end - start) / 2 + start;
      printArrayWithHighlights(sortedNumbers, start, mid, end);

      final var valueAtMid = sortedNumbers[mid];
      if (valueAtMid == x) {
        return true;
      } else if (valueAtMid > x) {
        return binarySearch(x, sortedNumbers, start, mid - 1);
      } else {
        return binarySearch(x, sortedNumbers, mid + 1, end);
      }
    }
    return false;
  }

  public boolean binarySearch(int x, int[] sortedNumbers) {
    return binarySearch(x, sortedNumbers, 0, sortedNumbers.length - 1);
  }

  private void printArrayWithHighlights(int[] array, int start, int mid, int end) {
    for (int i = 0; i < array.length; i++) {
      if (i == start) {
        System.out.print("[S]");
      }
      if (i == mid) {
        System.out.print("[M]");
      }
      if (i == end) {
        System.out.print("[E]");
      }
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }
}