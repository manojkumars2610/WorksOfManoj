package com.manoj.learning.leetCode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

public int[] twoSum(int[] nums, int target) {
	
        HashMap<Integer,Integer> myMap = new HashMap<>();
        for (int i=0;i<nums.length; i++) {
        	if(myMap.get(target-nums[i]) != null){
        		int[] result = {myMap.get(target-nums[i]),i};
        		return result;
        	}else {
        		myMap.put(nums[i], i);
        	}
        }
		return null;
    }

	public static void main(String[] args) {
		TwoSum myObj = new TwoSum();

//		int[] nums = { 2, 7, 11, 15 };
//		int[] nums= {3,2,4 };
		int[] nums= {1,2,3 };
//		int[] res=myObj.twoSum(nums, 9);
		int[] res=myObj.twoSum(nums, 4);
		System.out.println(res[0] + " "+res[1]);
	}

}
