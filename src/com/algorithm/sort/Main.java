package com.algorithm.sort;

import java.util.Arrays;

public class Main {
    /**
     * 冒泡排序-升序
     *
     * @param array
     */
    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.println("i=" + i + ":" + Arrays.toString(array));
            for (int j = 0; j < array.length - 1 - i; j++) {
                System.out.println("j=" + array[j] + "," + array[j+1]);
                if (array[j] > array[j + 1]) {
                    // 交换数据
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;

                    System.out.println("j=" + j + ":" + Arrays.toString(array));
                }
            }
        }
    }

    public static void main(String[] args) {
        // write your code here
        int[] intArray = new int[]{7, 3, 1, 6, 2, 9, 10, 0, 32, -1, 4};
        System.out.println("Before:" + Arrays.toString(intArray));
        bubbleSort(intArray);
        System.out.println("After:" + Arrays.toString(intArray));
    }
}
