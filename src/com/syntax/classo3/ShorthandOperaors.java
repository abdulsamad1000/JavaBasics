package com.syntax.classo3;

public class ShorthandOperaors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int num=100;
	num=num+100;
	System.out.println(num); // 200
	num=num+50;
	System.out.println(num); // 250
	num+=100; // instead of writing my code num=num+100 l can write short way num+=100
	
	System.out.println(num); // 350
	num-=10;
	System.out.println(num); // 340
	num/=10;
	System.out.println(num);// 34
	num*=2;
	System.out.println(num);// 68
	
	num%=2;
	System.out.println(num);// 0 
	
	int a=10;
	int b=20;
	int c=30;
	a+=b;  // a=10+20
	a=10+20; // the a+=b; fromula is equal to a=10+20;
	
	System.out.println(a);// 30
	a+=b+c; // over here the = sign is an assignment operator the operation happend at the right
	// a+=b+c;  is same as a=30+50 total woudl be a=80
	System.out.println(a); // 80
	
	a*=10;
	System.out.println(a);// 800
	
	
	
	
	
	
	
	
	
			
		 
		
	}

}
