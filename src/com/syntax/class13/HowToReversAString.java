package com.syntax.class13;

public class HowToReversAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String ("Sunday");
		String str1="Sunday";
		for (int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		System.out.println("===== anthor example ========");
		String str2="Abdulsamad";
		for (int i=str2.length()-1; i>=0; i-- ) {
			System.out.print(str2.charAt(i));
		}

	}

}
