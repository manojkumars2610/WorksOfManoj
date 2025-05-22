package com.manoj.learning.leetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class PickFromBothSides {

    public int solve(ArrayList<Integer> A, int B) {

        ArrayList<Integer> preSum = preSumArray(A);
        ArrayList<Integer> sufSum = sufSumArray(A,preSum.get(preSum.size()-1));
        int max=sufSum.get(sufSum.size()-B);
        int tempMax=0;
        for(int i=0; i<B; i++){
            if(i==B-1)
                tempMax=preSum.get((i));
            else
                tempMax=preSum.get(i)+sufSum.get(A.size()-B+1+i);
            if( tempMax > max)
                max=tempMax;
        }
        return max;
    }

    private ArrayList<Integer> preSumArray(ArrayList<Integer> a) {
        ArrayList<Integer> pre = new ArrayList<>();
        pre.add(a.get(0));
        for (int i=1; i< a.size(); i++){
            pre.add(pre.get(i-1)+a.get(i));
        }
        System.out.println(pre);
        return pre;
    }

    private ArrayList<Integer> sufSumArray(ArrayList<Integer> a, int tt) {
        ArrayList<Integer> suf = new ArrayList<Integer>(a.size());
        suf.add(tt);
        for (int i=1; i< a.size(); i++){
            suf.add(suf.get(i-1)-a.get(i-1));
        }
        System.out.println(suf);
        return suf;
    }

    public static void main(String[] args) {
        ArrayList<Integer> in =new ArrayList<Integer>();
//		in.add(5);
//		in.add(-2);
//		in.add(3);
//		in.add(1);
//        in.add(2);


        in.add(2);
        in.add(3);
        in.add(-1);
        in.add(4);
        in.add(2);
        in.add(1);




//        Integer[] array = {2, 3, -1, 4, 2, 1};
//        in= Arrays.asList(array);
////        System.out.println(in);
        PickFromBothSides obj = new PickFromBothSides();
        System.out.println(obj.solve(in,4));
//        System.out.println(obj.preSumArray(in));
//        System.out.println(obj.sufSumArray(in,9));
    }
}
