package com.manoj.learning.sorting;

import java.util.Arrays;
import static com.manoj.learning.sorting.QuickSort.*;

public class QuickSortLastPivot {

    static void quickSortLastPivot(int[] data,int start, int end){
        if (start > end)
            return;

        int pvt = data[end];
        int pvtLoc=end;
        int ini=start;
        while (start < end) {

            while (data[start] < pvt) {
                start++;
            }
            while (ini < end && data[end] >= pvt) {
                end--;
            }
            if (start < end)
                QuickSort.swap(data, start, end);
        }
        QuickSort.swap(data, start, pvtLoc);
        quickSortLastPivot(data,ini,start-1);
        quickSortLastPivot(data,start+1,pvtLoc);



        printArray(data);
    }

    public static void main(String[] args) {
//        int[] data = {5, 1, 2, 4, 3};
//         data = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] data = {7,6,9,3,6,8,3,5,3,6,};
        Arrays.stream(data).forEach(System.out::println);
        printArray(data);
        quickSortLastPivot(data, 0, data.length - 1);
    }

}
