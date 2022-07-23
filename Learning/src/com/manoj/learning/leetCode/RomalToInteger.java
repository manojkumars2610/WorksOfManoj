package com.manoj.learning.leetCode;

import java.util.HashMap;

public class RomalToInteger {

    int romanToInt(String s) {
        int myInt=0;
        HashMap<Character,Integer> myMap = new HashMap<>();
        myMap.put('I',1);
        myMap.put('V',5);
        myMap.put('X',10);
        myMap.put('L',50);
        myMap.put('C',100);
        myMap.put('D',500);
        myMap.put('M',1000);
        
        HashMap<Character,Character> preMap = new HashMap<>();
        preMap.put('V','I');
        preMap.put('X','I');
        preMap.put('L','X');
        preMap.put('C','X');
        preMap.put('D','C');
        preMap.put('M','C');
        
        boolean preFlag=false;
        for (int i = s.length() - 1; i >= 0; i--) {
        	if(preFlag) {
        		myInt=myInt-myMap.get(s.charAt(i));
        	}
        	else {
        		myInt=myInt+myMap.get(s.charAt(i));
        	}
        	
        	if(i>0 && (Character.compare(s.charAt(i-1), preMap.getOrDefault(s.charAt(i),'9'))==0 )){
        		preFlag=true;
        	}else
        		preFlag=false;
        }
        System.out.print("myInt="+myInt+"\n");
        return myInt;
    }

public static void main(String args[]) {
	RomalToInteger obj = new RomalToInteger();
//	obj.romanToInt("LVIII");
//	obj.romanToInt("III");
//	obj.romanToInt("MMCV");
//	obj.romanToInt("MCMXCIV");
//	obj.romanToInt("IV");
	obj.romanToInt("MCDLXXVI");
}
};