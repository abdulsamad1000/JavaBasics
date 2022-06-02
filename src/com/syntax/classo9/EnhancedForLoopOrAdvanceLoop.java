package com.syntax.classo9;

public class EnhancedForLoopOrAdvanceLoop {

	public static void main(String[] args) {
		// Enhanced for loop/ advanced for loop/ for each loop
		// in which satuation we can use Enhanced loop only when we work with array or collection
		
		String[] colors= {"pink","blue","white","black"};
		for (String color:colors) {
			System.out.print(color+" ");
			
		}
		
		System.out.println();
		int []numbers= {10,20,30,40};
		for(int num:numbers) {
			System.out.println(num);
		}
		
		
		
		

	}

}
