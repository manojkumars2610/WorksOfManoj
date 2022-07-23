package com.manoj.learning.leetCode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	 public List<String> fizzBuzz(int n) {
		 List<String> output= new ArrayList<>(n);
		 String temp=null;
		 for (int i=1; i<=n ; i++) {
			 temp=Integer.toString(i);
			 if (i%15==0) {
				 temp="FizzBuzz";
			 }
			 else if (i%3==0) {
				 temp="Fizz";
			 }
			 else if (i%5==0) {
				 temp="Buzz";
			 }
			 output.add(temp);
		 }
		return output;
	        
	    }
	 
	public static void main(String[] args) {
		
		FizzBuzz myObj = new FizzBuzz();
		
		System.out.println(myObj.fizzBuzz(30));
	}

}
