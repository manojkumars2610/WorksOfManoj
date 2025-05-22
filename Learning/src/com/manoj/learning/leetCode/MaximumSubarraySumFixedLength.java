package com.manoj.learning.leetCode;

import java.util.ArrayList;

public class MaximumSubarraySumFixedLength {
    public Long solve(ArrayList<Integer> A, int B) {
        Long maxSum=0L;
        int s=A.size();
        Long winSum=0L;
        for(int i=0;i<B; i++){
            maxSum=winSum+=A.get(i);
        }

        for(int i=B;i<s; i++){
            winSum=winSum+A.get(i)-A.get(i-B);
            if (winSum>maxSum)
                maxSum=winSum;
        }

        return maxSum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> in = new ArrayList<>();

//        A = [1, 2, 3]

        in.add(6);
        in.add(7);
        in.add(8);
        in.add(2);

        MaximumSubarraySumFixedLength obj= new MaximumSubarraySumFixedLength();

        System.out.println(obj.solve(in,2));
    }

}
