package com.packt.datastructuresandalg.lesson2.activity.selectionsort;

public class SelectionSort {

  public void sort(int[] array) {
    int currentPlace = 0;
    while (currentPlace < array.length - 1) {
      int smallestIndex = array.length - 1;
      int smallest = array[smallestIndex];
      for (int i = currentPlace; i < array.length - 1; i++) {
        if (array[i] < smallest) {
          smallest = array[i];
          smallestIndex = i;
        }
      }
      swap(array, smallestIndex, currentPlace);
      currentPlace++;
    }
  }

  private void swap(int[] array, int smallerIndex, int placeToPut) {
    int temp = array[placeToPut];
    array[placeToPut] = array[smallerIndex];
    array[smallerIndex] = temp;
  }
}
