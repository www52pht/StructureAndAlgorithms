package com.www;

import javax.xml.bind.PrintConversionEvent;
import java.awt.geom.AffineTransform;
import java.beans.PropertyVetoException;
import java.util.Arrays;

/**
 * 快速排序
 * @author www
 * @version 1.0
 * @create 2021/2/23 19:51
 */
public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int index = partition(arr, low, high);

            quickSort(arr, low, index - 1);
            quickSort(arr, index + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        while (low < high) {
            // 1、先看右边，依次往左递减
            while (pivot <= arr[high] && low < high) {
                high--;
            }
            // 2、将右侧找到小于基准数的值加入到左边的（坑）位置， 左指针想中间移动一个位置
            if (low < high) {
                arr[low] = arr[high];
                low++;
            }
            // 3、再看左边，依次往右递增
            while (pivot > arr[low] && low < high) {
                low++;
            }
            // 4、将左侧找到的打印等于基准值的值加入到右边的坑中，右指针向中间移动一个位置 high--
            if (low < high) {
                arr[high] = arr[low];
                high--;
            }
        }
        // 最后将基准为与low和high相等位置的数字交换
        arr[low] = pivot;
        // 返回基准值的位置索引
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {1, 28, 3, 21, 11, 7, 6, 18};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }



}

