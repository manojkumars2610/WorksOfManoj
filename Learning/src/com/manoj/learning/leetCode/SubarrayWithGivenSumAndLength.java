package com.manoj.learning.leetCode;

import java.util.ArrayList;

public class SubarrayWithGivenSumAndLength
{
    public int solve(ArrayList<Integer> A, int B, int C) {
        int s= A.size();
        int winSum=0;
        for(int i=0; i<B; i++){
            winSum+=A.get(i);

        }
        if(winSum==C)
            return 1;

        for(int i=B; i<s; i++){
            winSum+=A.get(i)-A.get(i-B);
            if(winSum==C)
                return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        ArrayList<Integer> in = new ArrayList<>();

//        A = [1, 2, 3]

        in.add(4);
        in.add(3);
        in.add(2);
        in.add(6);
        in.add(1);
//        in.add(8);
//        in.add(2);

        SubarrayWithGivenSumAndLength obj= new SubarrayWithGivenSumAndLength();

        System.out.println(obj.solve(in,3,11));
    }
}
