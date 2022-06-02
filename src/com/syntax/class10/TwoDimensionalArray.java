package com.syntax.class10;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// to create 2D array we specify number of rows and colums=size
		int [][]numbers =new int [3][4];
		
		// 1 row
		numbers [0][0]=10;
		numbers [0][1]=20;
		numbers [0][2]=30;
		numbers [0][3]=40;
	    // 2 row
		numbers [1][0]=1;
		numbers [1][1]=2;
		numbers [1][2]=3;
		numbers [1][3]=4;
		// 3 row
		numbers [2][0]=9;
		numbers [2][1]=8;
		numbers [2][2]=7;
		numbers [2][3]=6;
		
		
		System.out.println(numbers[1][3]);
		System.out.println(numbers[0][1]);
		System.out.println(numbers[2][1]);
		
		int row=numbers.length;
		System.out.println("the number of rows = " +numbers.length);
		int colsOf1row= numbers[0].length;
		System.out.println("the number of columns = "+colsOf1row);
		
		System.out.println("======================================");
		
		
	// shorter way to write a 2D array 
	// I want to create a 2d array of states and cities of that particular state
		String [][] usa= {
				{"Texa","Austin","Dallas","Houston","Boston"},
				{"New York","Albany","Buffalo"},
				{"Calfornia","San Francico","San Deigo","Redding"},
				{"Virgina","Richmond","Leesburg"},
		};
		
		System.out.println(usa[1][1]);// if you want to access Albany
		System.out.println("i want to go to "+usa[2][0]);
		
		System.out.println("the rows are = " +usa.length);
		
		int cols2row=usa[0].length;
		System.out.println("the colums are = "+cols2row);
		
	}

}
