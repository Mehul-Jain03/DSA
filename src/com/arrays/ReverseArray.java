package com.arrays;

public class ReverseArray {
	
	public static void reverseUsingThirdVariable(int[] arr) {
		
		int[] rev = new int[arr.length];
		int index = 0;
		for(int i = arr.length-1;i>=0;i--){
			rev[index] = arr[i];
			index++;
		}
		
			for(int a : rev) {
				System.out.print(a+" ");
			}	
	}
	
	public static void reverseWithoutUsingThirdVariable(int[] arr) {
		
		int i =0;
		int j =arr.length-1;
		while(i<=j) {
			int k = arr[i];
			arr[i] = arr[j];
			arr[j]= k;
			i++;
			j--;
		}
		
		for(int a : arr) {
			System.out.print(a+" ");
		}	
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,45,23,76,15,12};
		//reverseUsingThirdVariable(arr);
		reverseWithoutUsingThirdVariable(arr);
	}

}
