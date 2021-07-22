package com.strings;

import java.util.Arrays;

public class Anagram {
	
	public static boolean isAnagram(char[] s1,char[] s2) {
		if(s1.length!=s2.length) {
			return false;
		}
		else if(s1.length==0 || s2.length ==0) {
			return false;
		}
		else {
			Arrays.sort(s1);
			Arrays.sort(s2);
			for(int i =0;i<s1.length;i++) {
				if(s1[i]!=s2[i]) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		String str1 = "triangle";
		String str2 = "intregal";
		
		System.out.println(isAnagram(str1.toCharArray(),str2.toCharArray()));

	}

}
