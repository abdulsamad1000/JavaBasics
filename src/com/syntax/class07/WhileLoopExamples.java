package com.syntax.class07;

public class WhileLoopExamples {

	public static void main(String[] args) {
		// first example: print number from 1 to 10;
		
		int num=1;
		
		while (num<=10) {
			System.out.print(num+" ");
			num++;
			// second example: print number from 10 to 100
			
			int box=10;
			while (box<=100) {
				System.out.print(box+" ");
				box++;
				// third example: print numbers from 10 to 1
				int b=10;
				while (b>=1) {
					System.out.println(b+" ");
					b--;
					
					//four example: print numbers from 100 to 50
					int y=100;
					while (y>=50) {
						System.out.print(y+" ");
						y--;
						// fifth example: print number from -1 to -10
						
						
						int c=-1;
						while (c>-10) {
							System.out.println(c+" ");
							c--;
						}
						// sixth example: print number from 1 to 20 but only even numbers
						// first way
						System.out.println();
						int e=2;
						while (e<20) {
							System.out.print(e+" ");
							e++;
						// 2 way
							System.out.println();
							int h=1;
							while (h<=20) {
								System.out.print(h+" ");
								h++;
								
								
							}
						
						}
					}
				}
				
			}
			
			
		}
		
	}

}
