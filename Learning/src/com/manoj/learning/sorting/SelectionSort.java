package com.manoj.learning.sorting;

import java.util.Arrays;

import static com.manoj.learning.sorting.Utils.*;


public class SelectionSort {
    static void selectionSort(int[] data){

        for (int i = 0; i < data.length; i++) {
            int cMin=data[i];
            int cPos=i;
            for (int j = i; j < data.length; j++) {

                if (data[j] < cMin) {
                    cMin = data[j];
                    cPos=j;
                }
            }
            if (i!= cPos) {
                int temp = data[i];
                data[i] = data[cPos];
                data[cPos] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] data = {5, 4, 3, 2, 1};
//        int[] data = {3, 1, 2, 4, 5};
//        int[] data = {9, 8, 7, 6, 5, 4, 3, 2, 1};
//        int[] data = {7,6,9,3,6,8,3,5,3,6,};
        System.out.println("Before sorting...");
        printArray(data);
        selectionSort(data);
        System.out.println("After sorting...");
        printArray(data);

        Arrays.toString(data);
    }
}
