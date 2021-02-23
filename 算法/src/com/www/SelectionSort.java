package com.www;

import java.util.Arrays;

/**
 * 选择排序
 *
 * @author www
 * @version 1.0
 * @create 2021/2/23 21:22
 */
public class SelectionSort {
    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 28, 3, 21, 11, 7, 6, 18};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
