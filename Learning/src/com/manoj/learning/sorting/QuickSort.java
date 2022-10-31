package com.manoj.learning.sorting;

import java.util.Arrays;

public class QuickSort {

    static int partition(int[] data, int start, int end) {

//        System.out.println("END =" + data[end]);
        int pivot = data[start];
        int piPos= start;
//        System.out.println("END =" + data[end]);
//        System.out.println("pivot=" + pivot);
//        System.out.println("Inside partition");
        while (start < end) {

            while ( start < end && data[start] <= pivot) {
                start++;
            }
            while ( data[end] > pivot) {
                end--;
            }
            if ( start < end)
                data = swap(data, start, end);
        }
//        System.out.println("END pos= "+ end);
//        System.out.println("final = "+ data[end]);
        swap(data,piPos,end);


        return end;
    }

    static  int[] quickSort(int[] data, int start, int end){
        if (start >= end)
            return data;
        int pos = partition(data, start, end);
         quickSort(data,start,pos-1);
         quickSort(data,pos+1,end);
        printArray(data);
        return data;
    }

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


    public static void main(String[] args) {
//        int[] data = {5, 4, 3, 2, 1};
//        int[] data = {3, 1, 2, 4, 5};
        int[] data = {9, 8, 7, 6, 5, 4, 3, 2, 1};
//        int[] data1 = {7,6,9,3,6,8,3,5,3,6,};
        printArray(data);

//        partition(data, 0, data.length - 1);
            data = quickSort(data, 0, data.length - 1);
        System.out.println("After sorting...");
//        Arrays.stream(data).forEach(System.out::println);
        printArray(data);
    }

}
