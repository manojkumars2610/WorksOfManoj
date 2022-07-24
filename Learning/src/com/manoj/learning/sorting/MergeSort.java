package com.manoj.learning.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] input = {9, 8, 7, 10,1,2,99,88,90,55,32};
//        int [] input= {9,8};
        mergeSort(input, 0, input.length - 1);

        System.out.println(Arrays.toString(input));
    }

    static void mergeTwoSortedArrays() {
        int[] a = {1, 3, 5};
        int[] b = {-1, 0, 1, 2, 4, 6,};
        int[] res = new int[a.length + b.length];

        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                res[k] = a[i];
                i++;
                k++;
            } else if (a[i] > b[j]) {
                res[k] = b[j];
                j++;
                k++;
            }
        }
        while (i < a.length) {
            res[k] = a[i];
            i++;
            k++;
        }
        while (j < b.length) {
            res[k] = b[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(res));
    }

    static void merge(int[] input, int s, int m, int e) {
        int temp[] = new int[e - s + 1];

        int i = s;
        int j = m + 1;
        int k = 0;

        while (i <= m && j <=e) {
            if (input[i] <= input[j]) {
                temp[k] = input[i];
                i++;
                k++;
            }
            if (input[i] > input[j]) {
                temp[k] = input[j];
                j++;
                k++;
            }
        }
        while (i <= m) {
            temp[k] = input[i];
            i++;
            k++;
        }

        while (j <= e) {
            temp[k] = input[j];
            j++;
            k++;
        }
        System.out.println("TEmp array = "+Arrays.toString(temp));
        for (int l = 0; l < temp.length; l++) {
            input[s + l] = temp[l];
        }

    }
    private static void mergeSort(int[] input, int s, int e) {
/*        while(s<e){
            int m= (s+e)/2;
            System.out.println("value of m= "+m);
            mergeSort(input,s,m);
            mergeSort(input,m+1,e);
            merge(input,s,m,e);
        }*/
        if (s == e)
            return;
        int m = (s + e) / 2;
        mergeSort(input, s, m);
        mergeSort(input, m + 1, e);
        merge(input, s, m, e);
    }
}
