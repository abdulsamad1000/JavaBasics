package com.syntax.class04;

public class MoreNestedIf {

	public static void main(String[] args) {
		
		/*we need to check if repl was completed
		 * 
		 * if repl is completed we want to see
		 * if you did 15 and more --> great job
		 * id you did more than 10 --> did good
		 * id less than 10 -> try to completed all assignment 
		 */
		
		boolean didRepl=true;
		int assignments;
		
		if (didRepl) {
			
			System.out.println("How many assignment have you done");
			assignments=17;
			
			if (assignments>15) {
				System.out.println("You did a geat job");
			}else if (assignments>10) {
				System.out.println("You did a good job");
		}else {
			System.out.println("Please completed all repl as");
			}
		}
		 System.out.println(" You should complete your Reple Hw");	
	}

}
