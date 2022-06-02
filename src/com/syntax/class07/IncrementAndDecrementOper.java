package com.syntax.class07;

public class IncrementAndDecrementOper {

	public static void main(String[] args) {
		
		int x=10;
		
		x=x+1;  // 11
		x+=1;  // 12
		System.out.println(x);  // the value is 12
		x++;  //this mean  12+1=13 // increment value of a variable by 1
		System.out.println(x); // the value is 13
		
		x--; // decrement value of a variable by 1
		System.out.println(x); // the value is 12 
		// increment and decrement Operators work only with variable 
		// we can not use increment and decrement operator with out variable like 
		// this 10++; or 10++;    we have to use with variable x++; or n--; 
		
		// examples
		
		int num=100;
		num++;
		System.out.println(num);
		
		long num2=1000;
		num2--;
		System.out.println(num2);
		

	}

}
