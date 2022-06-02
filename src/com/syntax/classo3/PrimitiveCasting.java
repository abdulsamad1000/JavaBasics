package com.syntax.classo3;

public class PrimitiveCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ctrl+space --> auto complete 
		
		int i=100;
		double d=100;
		
		System.out.println(i); //100
		System.out.println(d); //100.0
		
		long L=10000;
		// byte b=130; error: can not covert from int to byte
		// int x=99.99 error can not convert from double to int
		int x=(int)99.99; // narrowing
		System.out.println(x);
		
		byte b=(byte)130;
		System.out.println(b);
		
	
	}

}
