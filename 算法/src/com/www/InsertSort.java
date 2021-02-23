package com.www;

import javax.swing.table.AbstractTableModel;
import java.util.Arrays;

/**
 * 直接插入排序：Java
 *
 * @author www
 * @date 2021/02/23
 */

public class InsertSort {
    private static void insertSort(int [] arr) {
        int preIndex, current;
        for (int i = 1; i < arr.length; i++) {
            preIndex = i - 1;
            current = arr[i];
            while (preIndex >= 0 && arr[preIndex] > current) {
                arr[preIndex + 1] = arr[preIndex];
                preIndex--;
            }
            arr[preIndex + 1] = current;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 28, 3, 21, 11, 7, 6, 18};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
