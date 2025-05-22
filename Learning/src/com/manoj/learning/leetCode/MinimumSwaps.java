package com.manoj.learning.leetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimumSwaps {
    public int solve(ArrayList<Integer> A, int B) {
        int ws=0;
        for(int i: A){
            if (i <= B)
                ws++;
        }
        System.out.println(ws);
        int count=0,max;

        for(int i=0; i<ws; i++){
            if(A.get(i)<=B)
                ++count;
        }
        max=count;
        System.out.println("count= "+count);
        for (int i = ws; i <A.size() ; i++) {
            if (A.get(i) <=B)
                ++count;
            if(A.get(i-ws) <= B)
                --count;
            max=Math.max(max,count);
            System.out.println("count= "+count);
        }

        return ws-max;

    }

    public static void main(String[] args) {
//        Integer[] x= {1, 12, 10, 3, 14, 10, 5};
        Integer[] x= {31,98,58,86,36,31,3,22,4,17,51,33,56,7,91,17,59,66,54,67,55,41,58,24,100,1,98,68,21,33,27,67,20,66,20,100,36,89,20,15,13,26,11,29,99,36,39,49,74,77,54,66,30,21,14,18,83,72,10,22,53,83,60,9,68,56,9,21,77,44,45,61,97,82,35,16,38,95,55,11,46,77,25,3,44};
        ArrayList<Integer> in =new ArrayList<>(Arrays.asList(x));
        MinimumSwaps obj=new MinimumSwaps();

        System.out.println(obj.solve(in,18));
    }
}

/*

Problem Description

Given an array of integers A and an integer B, find and return the minimum number of swaps required to bring all the numbers less than or equal to B together.

Note: It is possible to swap any two elements, not necessarily consecutive.



Problem Constraints

1 <= length of the array <= 100000
        -109 <= A[i], B <= 109



Input Format

The first argument given is the integer array A.
The second argument given is the integer B.



Output Format

Return the minimum number of swaps.



Example Input

Input 1:

A = [1, 12, 10, 3, 14, 10, 5]
B = 8
Input 2:

A = [5, 17, 100, 11]
B = 20


Example Output

Output 1:

        2
Output 2:

        1


Example Explanation

Explanation 1:

A = [1, 12, 10, 3, 14, 10, 5]
After swapping  12 and 3, A => [1, 3, 10, 12, 14, 10, 5].
After swapping  the first occurence of 10 and 5, A => [1, 3, 5, 12, 14, 10, 10].
Now, all elements less than or equal to 8 are together.
Explanation 2:

A = [5, 17, 100, 11]
After swapping 100 and 11, A => [5, 17, 11, 100].
Now, all elements less than or equal to 20 are together.
 */
