package com.strings;

public class LengthOfString {
	
	public static int lenghByNewMethod(String s) {
		int count = 0;
		char[] c = s.toCharArray();
		for(int i: c) {
			System.out.println(i);
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		
		String s = "Level up";
		
		System.out.println("Lenght By In Built Method : "+s.length());
		System.out.println("Lenght By New Method : "+lenghByNewMethod(s));
		
	}

}
