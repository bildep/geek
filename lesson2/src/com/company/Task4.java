package com.company;

import java.util.Arrays;

public class Task4 {
  public static void main(String[] args) {
    int[][] arr = new int[5][5];

    for (int i = 0; i < arr.length ; i++) {
      for (int j = 0; j < arr.length; j++) {
          if (i == j || (i + j) == arr.length - 1) {
            arr[i][j] = 1;
          }
      }
    }

    for (int[] el : arr) {
      System.out.println(Arrays.toString(el));
    }

  }
}
