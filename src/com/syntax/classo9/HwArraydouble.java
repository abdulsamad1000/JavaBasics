package com.syntax.classo9;

public class HwArraydouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double []numbers= {10.99,15.99,20.99,25.99};
		for (double y:numbers) {
			System.out.println(y+" ");
		}
		System.out.println("=========================2nd way================");
		System.out.println();
		for (int x=0; x<numbers.length; x++) {
			System.out.println(numbers[x]+" ");
		}
	}

}
