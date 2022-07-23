package com.manoj.learning.leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	
public int majorityElementUsingMap(int[] nums) {
	
	HashMap<Integer, Integer> tracker = new HashMap<>();

	int i=0;
	for(; i<nums.length; i++){
		if(tracker.containsKey(nums[i])) {
			tracker.put(nums[i],(tracker.get(nums[i])+1)  );
			
			if(tracker.get(nums[i])>nums.length/2) {
				System.out.println("inside if condition");
				return nums[i];
			}
		}else
			tracker.put(nums[i],1);
	}
	return 0;
        
    }

public int majorityElement(int[] nums) {
	Arrays.sort(nums);
	return nums[nums.length/2];
}

	public static void main(String[] args) {
		
//		int[] nums = {2,1,1,2,2,3,3,3,3,3,4,4,43,3,3,3,3};
		int[] nums= {2,2,1,1,2,4,5,8,2,2};
		System.out.println(nums.length);
		MajorityElement myObj= new MajorityElement();
		System.out.println(myObj.majorityElementUsingMap(nums));
		System.out.println(myObj.majorityElement(nums));

	}

}
