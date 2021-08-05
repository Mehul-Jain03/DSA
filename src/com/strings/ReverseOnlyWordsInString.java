package com.strings;

public class ReverseOnlyWordsInString {

	public static void main(String[] args) {
		String inputString = "hi what are you doing?";
		String outputString = "";
		String[] arrayOfString = inputString.split(" ");
		for(int i = arrayOfString.length-1; i>=0;i--) {
			outputString +=arrayOfString[i]+" ";
		}
		System.out.println(outputString.trim());
	}

}