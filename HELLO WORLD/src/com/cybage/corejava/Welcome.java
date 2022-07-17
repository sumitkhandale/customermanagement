package com.cybage.corejava;

public class Welcome {
	public static void main(String[] args) {
		
		String str = "SUMITKHANDALE";
		String rev = "";
		int i;
		for(i = str.length()-1;i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("The reverse of the given string : " + rev);
		
	}

}
