package com.company;

public class Task5 {
  public static void main(String[] args) {
    int[] arr = { 1, 5, 3, 2, 11, -4, 5, 2, 4, 8, 9, 0 };

    System.out.println(getMin(arr));

    System.out.println(getMax(arr));
  }

  public static int getMin(int[] arr) {

    int min = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < min) {
          min = arr[i];
        }
    }

    return min;
  }

  public static int getMax(int[] arr) {

    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }

    return max;
  }
}
