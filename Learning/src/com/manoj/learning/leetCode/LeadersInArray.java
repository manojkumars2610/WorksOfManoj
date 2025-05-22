package com.manoj.learning.leetCode;

import java.util.ArrayList;

public class LeadersInArray {

    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> res = new ArrayList<>();
        int temp=Integer.MIN_VALUE;

        for (int i=A.size()-1; i>=0; i--){
            if(A.get(i)> temp){
                temp=A.get(i);
                res.add(A.get(i));
            }else
                continue;

        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> in =new ArrayList<Integer>();
//		in.add(16);
//		in.add(17);
//		in.add(4);
//		in.add(3);
//		in.add(5);
//        in.add(2);

        in.add(5);
        in.add(4);
//        System.out.println(in);
        LeadersInArray obj = new LeadersInArray();
        System.out.println(obj.solve(in));
    }
}
