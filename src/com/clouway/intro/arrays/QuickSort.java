package com.clouway.intro.arrays;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class QuickSort {

  /**
   * sorts an array by quicksort algorithm
   * @param arr int array to be sorted
   * @param start int specifying the index from which to begin sorting
   * @param end int specifying the index on which to stop sorting
   */
  public void sorting(int[] arr, int start, int end) {
    if (arr == null || arr.length == 0)
      return;

    if (start >= end)
      return;

    int middle = start + (end - start) / 2;
    int pivot = arr[middle];

    int i = start, j = end;
    while (i <= j) {
      while (arr[i] < pivot) {
        i++;
      }

      while (arr[j] > pivot) {
        j--;
      }

      if (i <= j) {
        int cup = arr[i];
        arr[i] = arr[j];
        arr[j] = cup;
        i++;
        j--;
      }
    }

    if (start < j)
      sorting(arr, start, j);

    if (end > i)
      sorting(arr, i, end);
  }

}
