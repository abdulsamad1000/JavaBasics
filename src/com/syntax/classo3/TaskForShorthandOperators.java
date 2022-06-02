package com.syntax.classo3;

public class TaskForShorthandOperators {

	public static void main(String[] args) {
		/*
		 * Task

Declare variable and increase it’s value by 500 and then by 200 using shorthand operator
Declare variable and decrease it’s value by 60 using shorthand operator
Declare variable cakePiece=11 and divide the value of that variable between 4 people
 using shorthand operator
Declare variable cake=25 and divide cake between 7 people . 
Using shorthand operator found out how many pieces of cake left 
after it was distributed equally among 7 people
		 */
		
		int num=60;
		num=num+500;
		num+=200;
		System.out.println(num); // 760
		int num1=80;
		num1-=60;
		System.out.println(num1);// 20
		
		int cakePiece=11;
		cakePiece/=4;
		System.out.println(cakePiece);// 2
		int cake=25;
		System.out.println(cake/7);// 3
		cake%=7;
		System.out.println(cake);// 4
		
		
	}

}
