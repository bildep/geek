package com.company;

public class Task6 {
  public static void main(String[] args) {

    int[] arr = {2, 2, 2, 1, 2, 2, 10, 1};
    int[] arr2 = {1, 1, 1, 2};

    System.out.println(checkBalance(arr));
    System.out.println(checkBalance(arr2));
  }

  public static boolean checkBalance(int[] arr) {
    boolean result = false;
    int summ = 0;

    for (int i : arr) {
        summ += i;
    }

    if ((summ % 2) == 0) {
        result = true;
    }

    return result;
  }
}
