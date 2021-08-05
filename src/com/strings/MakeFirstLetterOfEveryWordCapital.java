package com.strings;

public class MakeFirstLetterOfEveryWordCapital {

	public static String make(String s) {
		String uppers = s.substring(0, 1).toUpperCase() + s.substring(1);
		return uppers;
	}

	public static void main(String[] args) {
		String inputString = "hi what are you doing?";
		String outputString = "";
		String[] arrayOfString = inputString.split(" ");
		for (int i = 0; i < arrayOfString.length; i++) {
			outputString += make(arrayOfString[i]) + " ";
		}
		System.out.println(outputString);

	}

}
