package com.manoj.learning.leetCode;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class SumOfAllSubarrays {

    public Long subarraySum(ArrayList<Integer> A) {

        Long sum=0L;
        Long s=Long.valueOf(A.size());
        for (int i=0; i<s;i++) {
            sum += (Long) (A.get(i) * (i + 1) * (s - i));
        }
        return sum;
    }


    public static void main(String[] args) {
        ArrayList<Integer> in = new ArrayList<>();

//        A = [1, 2, 3]

        in.add(2);in.add(1);
        in.add(3);

        SumOfAllSubarrays obj= new SumOfAllSubarrays();

        System.out.println(obj.subarraySum(in));
    }
}
