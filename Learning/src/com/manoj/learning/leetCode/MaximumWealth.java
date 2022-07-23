package com.manoj.learning.leetCode;

import java.util.Arrays;

public class MaximumWealth {
	public int maximumWealth(int[][] accounts) {
		System.out.println(accounts.length);
		System.out.println(accounts[1].length);
		int max = 0;
		for (int i = 0; i < accounts.length; i++) {
			int wealth = 0;
			for (int j = 0; j < accounts[i].length; j++) {
				wealth += accounts[i][j];
			}
			if (wealth > max)
				max = wealth;
		}
		return max;

	}

	public int maximumWealthStream(int[][] accounts) {
		
		return Arrays.stream(accounts)
				.mapToInt(i-> Arrays.stream(i).sum())
				.max()
				.getAsInt();
	}

	public static void main(String[] args) {
		MaximumWealth myObj = new MaximumWealth();
		int[][] accounts = { { 1, 5 }, { 7, 3 }, { 3, 5 } };

		System.out.println(myObj.maximumWealth(accounts));
		System.out.println(myObj.maximumWealthStream(accounts));
	}

}
