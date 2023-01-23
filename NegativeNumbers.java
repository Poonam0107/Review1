package com.review;

import java.util.Arrays;

public class NegativeNumbers {

	public static void main(String[] args) {
		int [] arr= {1,7,-8,5,-3,2,-6,-1,-4,-9,};
		int n=arr.length;
		Arrays.sort(arr);
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}

	

	}

}
