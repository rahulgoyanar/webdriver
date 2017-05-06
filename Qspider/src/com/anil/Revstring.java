package com.anil;

public class Revstring {

	public static void main(String[] args) 
	{
		System.out.println(reverse("Mohan"));
	}

	static String reverse(String str) {
		StringBuilder scn = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--)
			scn.append(str.charAt(i));
		return scn.toString();
	}
}