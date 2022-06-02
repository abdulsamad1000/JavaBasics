package com.syntax.class10;

public class Array2D {

	public static void main(String[] args) {
		//Create a 2D array of integers. 
		//Develop a program which will calculate the sum of  even and odd numbers for that array.
		
		int[][]numbers= {
				{2,3,4},
				{5,6,7,9},
				{9,5,7,6,3},
				{8,6,3,7,5,3,9},
				
				};
		int sumEven=0;
		int sumOdd=0;
		for(int x=0; x<numbers.length; x++) {
			for (int y=0; y<numbers[x].length; y++) {
				if (numbers[x][y]%2==0) {
					sumEven+=numbers[x][y];
					
				}else {
					sumOdd+=numbers[x][y];
				}
			}
		}
		System.out.println("sum of Even number are = "+sumEven);
		System.out.println("sum of Even number are = "+sumOdd);
		
	}

}
