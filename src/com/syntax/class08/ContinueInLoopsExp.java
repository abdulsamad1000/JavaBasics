package com.syntax.class08;

public class ContinueInLoopsExp {

	public static void main(String[] args) {
		// print number from 1 to 50 except 3 
		
		for (int a=1; a<=50; a++) {
			if (a==3) {
				continue;
			}
			System.out.print(a+" ");
		}

	}

}
