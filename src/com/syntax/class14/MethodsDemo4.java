package com.syntax.class14;

public class MethodsDemo4 {

	public static void main(String[] args) {
		MethodsDemo4 md=new MethodsDemo4();
		System.out.println(md.sumNumbers(10,15));
		md.printManyTimes("java", 3);
		
	}
		int sumNumbers(int num1,int num2) {
			return num1+num2;
		}
// writing a string and int which print java 3 time. our string is java and int is 3
		
		void printManyTimes(String str, int times) {
			for (int i=0; i<times; i++) {
				System.out.println(str);
			}
		}
	}

