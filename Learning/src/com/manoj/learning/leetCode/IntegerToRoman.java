package com.manoj.learning.leetCode;

public class IntegerToRoman {

	public String intToRoman(int num) {
		String result="";
		String[] ones= {"","I","II","III","IV","V","VI","VII","VIII","IX"};  
		String[] tens= {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String[] huns= {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"}; 
		String[] thou= {"","M","MM","MMM"}; 

		result = thou[num/1000]+
				huns[(num%1000)/100]+
				tens[num%100/10]+
					ones[num%10];
		
		return result;
	}
	public static void main(String[] args) {
		
		IntegerToRoman myObj = new IntegerToRoman();
		
		System.out.println(myObj.intToRoman(100));
	}

}
