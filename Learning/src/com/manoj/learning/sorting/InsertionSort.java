package com.manoj.learning.sorting;

import static com.manoj.learning.sorting.Utils.printArray;

public class InsertionSort {
    public static int[] insertionSort(int[] data){

        for (int i = 0; i < data.length; i++) {

            for (int j = i; j >0 ; j--) {
//                System.out.println("j=="+j+"\ti=="+i+"\ti value ="+data[i]+"\tj value ="+data[j]);
                if(data[j] < data[j-1]){
                    int temp=data[j];
                    data[j]=data[j-1];
                    data[j-1]= temp;
                }
            }

        }
    return data;

    }



    public static void main(String[] args) {
        int[] data = {5, 4, 3, 2, 1};
//        int[] data = {3, 1, 2, 4, 5};
        printArray(data);
        insertionSort(data);
        System.out.println("After sorting...");
        printArray(data);

    }
}
