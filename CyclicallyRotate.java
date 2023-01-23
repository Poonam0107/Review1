package com.review;

public class CyclicallyRotate {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6,7,8,9,10};
        for(int i=0; i<arr.length;i++)
        {
        	int temp = arr[i];
        	arr[i]=arr[arr.length-1];
        	arr[arr.length-1]=temp;
        }
        for(int i:arr)
        {
        	System.out.println(i+ " ");
        }

	}

}
