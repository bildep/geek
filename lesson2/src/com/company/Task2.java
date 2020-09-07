package com.company;


import java.util.Arrays;

public class Task2 {
  public static void main(String[] args) {

    int[] numArr = new int[8];

    for (int i = 0; i < numArr.length; i++) {
      numArr[i] = i * 3;
    }

    System.out.println(Arrays.toString(numArr));

  }

}
