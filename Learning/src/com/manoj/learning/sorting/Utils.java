package com.manoj.learning.sorting;

public class Utils {

    static  void  printArray(int[] data){
        for (int i:data
        ) {
            System.out.print(i+"\t");
        }
        System.out.println("");
    }

    static int[] swap(int[] data, int a, int b) {
        int temp;
        temp = data[a];
        data[a] = data[b];
        data[b] = temp;

        return data;
    }

}
