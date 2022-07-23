package com.manoj.learning.leetCode.incomplete;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class MakeSquare {

	public boolean makesquare(Integer[] matchsticks) {
		java.util.List<Integer> matchstick = Arrays.asList(matchsticks); ;

		int peri=findSum(matchsticks);
		int side= peri/4;

		if (peri%4!=0) {
			System.out.println(" Cannot make square");
			return false;
		}

		for (int i : matchsticks) {
			if(i> side) {
				System.out.println("Stick is bigger that the side");
				return false;
			}
		}

		return true;
	}

	public int findSum(Integer[] matchsticks) {
		int sum=0;
		for (int i : matchsticks) {
			sum+=i;
		}
		return sum;
	}

	public void twosum(ArrayList<Integer> matchstick, int side) {
		ArrayList<Integer> temp=new ArrayList<Integer>();
		for (int i: matchstick) {
			if(temp.contains(side-i)) {

			}else {
				temp.add(i);
			}
		}





	}
	public static void main(String[] args) {

		Integer[] matchsticks = {1,1,2,2,2};
		MakeSquare myObj = new MakeSquare();
		System.out.println("Output = "+ myObj.makesquare(matchsticks));

	}

}
