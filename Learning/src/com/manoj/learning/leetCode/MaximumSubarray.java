package com.manoj.learning.leetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumSubarray {
    public int maxSubarray(int A, int B, ArrayList<Integer> C) {
        int s=C.size();
        int ans=0;

        for(int i=0;i <s ; i++){
            int sum=0;
            for(int j=i;j<s ; j++){
                sum+=C.get(j);
                if(sum<=B)
                    ans= Math.max(sum, ans);
                else
                    break;
            }
        }
    return ans;
    }

    public static void main(String[] args) {
        Integer[] x= {2, 1, 3, 4, 5};
        ArrayList<Integer> in =new ArrayList<>(Arrays.asList(x));
        MaximumSubarray obj=new MaximumSubarray();

        System.out.println(obj.maxSubarray(5,12,in));

    }
}
