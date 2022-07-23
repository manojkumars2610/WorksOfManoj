package com.manoj.learning.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;


public class KWeakestRows {

	 public int[] kWeakestRows(int[][] mat, int k) {
		 
//		 int[] temp = new int[mat.length];
		 int[] result = new int[k];
		 ArrayList<Integer> myAl= new ArrayList<Integer>();
		 for (int i = 0; i < mat.length; i++) {
//			 temp[i]=Arrays.stream(mat[i]).sum();
			 myAl.add(Arrays.stream(mat[i]).sum());
//			 System.out.println(temp[i]);
		 }
		 System.out.println(myAl);
		 Collections.sort(myAl);
//		 System.out.println(myAl);
//		 temp=(Integer[]) myAl.subList(0, k-1).toArray();
//		 
//		 System.out.println(Arrays.asList(temp));
//		 for (int i=0 ; i< temp.length; i++)
//			 System.out.println(temp[i]);
//		 
		 
//		 Arrays.sort(temp);
//		 System.out.println("Length = "+temp.length);
//		 System.out.println(Arrays.asList(temp));
//		 
//		 for (int i=0 ; i< temp.length; i++)
//			 System.out.println(temp[i]);
		 for ( int i=mat.length-1; i >=k; i--) {
//			 result[i]=myAl[i];
			 System.out.println(myAl);
			 System.out.println(myAl.remove(i));
		 }
		 
		 
		 
		return myAl.stream()
	            .mapToInt(Integer::intValue)
	            .toArray();
	        
	    }
	public static void main(String[] args) {

		KWeakestRows myObj = new KWeakestRows();
//		int[][] mat = { { 1,1,0,0,0}, {1,1,1,1,0}, {1,0,0,0,0}, {1,1,0,0,0},{1,1,1,1,1} };
		int[][] mat = { { 1,0,0,0}, {1,1,1,1}, {1,0,0,0}, {1,0,0,0} };
		int[] res = myObj.kWeakestRows(mat, 3);
		System.out.println("Final result");
		 for (int i=0 ; i< res.length; i++)
			 System.out.println(res[i]);
		
	}

}
