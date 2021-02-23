package com.www;

import javax.xml.transform.Source;
import java.util.Arrays;

/**
 * 冒泡排序
 * @author www
 * @version 1.0
 * @create 2021/2/23 19:20
 */
public class BubbleSort {
    public static int[] bubbleSort(int[] arr, int len) {
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array = {1, 28, 3, 21, 11, 7, 6, 18};

        bubbleSort(array, array.length);
        System.out.println(Arrays.toString(array));
    }

}
