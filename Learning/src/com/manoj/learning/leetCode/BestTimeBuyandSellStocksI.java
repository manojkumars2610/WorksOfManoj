/*
Problem Description

Say you have an array, A, for which the ith element is the price of a given stock on day i.
If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Return the maximum possible profit.

Problem Constraints
0 <= A.size() <= 700000
1 <= A[i] <= 107

Input Format
The first and the only argument is an array of integers, A.

Output Format
Return an integer, representing the maximum possible profit.

 Example Input

Input 1:
A = [1, 2]
Input 2:

A = [1, 4, 5, 2, 4]


Example Output

Output 1:
        1
Output 2:
        4
Example Explanation

Explanation 1:
Buy the stock on day 0, and sell it on day 1.
Explanation 2:

Buy the stock on day 0, and sell it on day 2.

*/


package com.manoj.learning.leetCode;
import java.util.ArrayList;
import java.util.List;

public class BestTimeBuyandSellStocksI {
    public int maxProfit(final List<Integer> A) {
        if (A.size() == 0) {
            return 0;
        }

        int min=Integer.MAX_VALUE;
        int pro =0;
        int maxPro=0;
        int s=A.size();
        int max= Integer.MIN_VALUE;
       for(int i=s-1; i>=0; i--){
           int price=A.get(i);
           if( price > max){
               max=price;
           }
           if (price <max){
               pro=max-price;
           }
           if (pro> maxPro)
               maxPro=pro;
       }


        return maxPro;
    }

    public static void main(String[] args) {
//        [1, 4, 5, 2, 4]
        ArrayList<Integer> in =new ArrayList<Integer>();

//        in.add(1);
//        in.add(4);
//        in.add(5);
//        in.add(2);
//		in.add(4);

//
        in.add(2);
                in.add(1);
//        in.add(3);
//        in.add(2);


        BestTimeBuyandSellStocksI obj = new BestTimeBuyandSellStocksI();

        System.out.println(obj.maxProfit(in));
    }
}
