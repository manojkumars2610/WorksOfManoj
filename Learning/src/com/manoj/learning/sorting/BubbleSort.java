package com.manoj.learning.sorting;

import java.util.Arrays;

public class BubbleSort {


    public static void main(String[] args) {
        int[] in = {8, 6, 85, 4, 3, -1, 51, 2,-104,-999};
        bubbleSort(in);
    }

    private static void bubbleSort(int[] in) {
        int k = in.length - 1;

        while (k >= 0) {
            for (int i = 0; i < k; i++) {
                if (in[i] > in[i + 1]) {
                    int temp = in[i + 1];
                    in[i + 1] = in[i];
                    in[i] = temp;
                }
            }
            k--;
        }
        System.out.println(Arrays.toString(in));
    }
}
