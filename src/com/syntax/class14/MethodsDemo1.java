package com.syntax.class14;

import java.util.Scanner;

public class MethodsDemo1 {
	
			//what is a Method :Method is a block of code a group of java statements that are grouped together and
			//we can execute those statements buy just creating an object of the class that contains
			//How: that method and by writing the objects name .method name
			void printHello() {
				System.out.println("How are you guys");
			}
			boolean returnTrue() {
				return true;
			}
			int returnInt() {
				return 10;
				
			}
			
			//Method that return something and method that does not return something
			public static void main(String[] args) {
				MethodsDemo1 md=new MethodsDemo1();
				md.printHello();
				
				boolean y=md.returnTrue(); // first way
				System.out.println(md.returnTrue()); // i can do this to
				System.out.println(y);
				
				int z=md.returnInt();  // first way
				System.out.println(md.returnInt()); // i can do this to
				System.out.println(z);

				
				
				
				
			}
		
		}

	


