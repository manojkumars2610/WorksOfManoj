package com.manoj.learning.leetCode;

public class PalindromeNumber {
	
	 public boolean isPalindrome(int x) {
		 int temp=x, y=0;
		 
		 do {
			 y=y*10+temp%10;
			 temp=temp/10;
		 }while(temp>0);
		 
		 if (x==y && x>=0) {
			 return true;
		 }else
			 return false;
	        
	    }

	public static void main(String[] args) {
		
		PalindromeNumber myObj = new PalindromeNumber();
		
		int x = 0;
		
		System.out.println("Output= "+myObj.isPalindrome(x));

	}

}
