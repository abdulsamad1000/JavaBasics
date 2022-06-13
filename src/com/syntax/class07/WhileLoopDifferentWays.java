package com.syntax.class07;

public class WhileLoopDifferentWays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print me the numbers from 20 to 60 only the Even numbers 
		int num=20;
		while (num<=60) {
			System.out.print(num+" ");
			num+=2;
		}
		System.out.println();
		System.out.println("========= 2nd way of the same example===");
		// print me the numbers from 20 to 60 only the Even numbers
		int num2=20;
		while (num2<=60) {
			if (num2%2==0) {
				System.out.print(num2+" ");
			}
			num2+=2;
		}
		System.out.println();
		System.out.println("========== 1st example for Odd numbers===");
		// print me the Odd numbers from 13 to 40 
		int num3=13;
		while (num3<=40) {
			System.out.print(num3+" ");
			num3-=-2;
		}
		System.out.println();
		System.out.println("============= 2nd way of the same example for Odd number==");
		// print me the Odd numbers from 13 to 40 
		int num4=13;
		while (num4<=40) {
			if (num4%2!=0) {
				System.out.print(num4+" ");
			}
			num4-=-2;
		}
		System.out.println();
		System.out.println("====== to print numbers examples=====");
		// print me the numbers from 20 to 50 
		int num5=20;
		while (num5<=50) {
			System.out.print(num5+" ");
			num5++;
		}
		System.out.println();
		System.out.println("====== to print numbers examples=====");
		// print me the numbers from 200 to 20
		int num6=200;
		while (num6>=20) {
			System.out.print(num6+" ");
			num6--;
		}
		System.out.println();
		System.out.println("====== to print the even numbers examples=====");
		// print me the even numbers from 14 to 84
		int num7=14;
		while (num7<=84) {
			System.out.print(num7+" ");
			num7+=2;
		}
		System.out.println();
		System.out.println("====== to print the odd numbers examples=====");
		// print me the even numbers from 55 to 95
		int num8=55;
		while (num8<=95) {
			System.out.print(num8+" ");
			num8-=-2;
		}
		System.out.println();
		System.out.println("====== 2nd ways of finding even numbers =====");
		// print me the even numbers from 12 to 44
		int num9=12;
		while (num9<=44) {
			if (num9%2==0) {
				System.out.print(num9+" ");
			}
			num9+=2;
		}
		System.out.println();
		System.out.println("====== 2nd ways of finding odd numbers =====");
		// print me the even numbers from 17to 47
		int num10=17;
		while (num10<=47) {
			if (num10%2!=0) {
				System.out.print(num10+" ");
			}
			num10-=-2;
		}
			
			
			
			
			
		
	}

}
