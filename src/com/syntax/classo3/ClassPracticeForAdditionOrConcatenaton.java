package com.syntax.classo3;

public class ClassPracticeForAdditionOrConcatenaton {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		String c="Hello";
		String d="Hi";
		
		System.out.println(a+b+c+d); // result: 30HelloHI
		System.out.println(a+c+b+d); // result: 10Hello20Hi
		System.out.println(c+d+a+b); // HelloHi1020 Note plus sign worked between string and int as concatenation 
		System.out.println(c+d+(a+b)); //result: HelloHi30
		
		boolean boo=true;
		System.out.println(c+boo);// result:Hellotrue
		
		
		
		
	}

}
