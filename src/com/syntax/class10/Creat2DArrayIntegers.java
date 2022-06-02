package com.syntax.class10;

public class Creat2DArrayIntegers {

	public static void main(String[] args) {
			// Create a 2D array or integer type where you will store odd and even numbers. 
			//Develop a program which will identify/print the even numbers only.
		
			int [][]nums= {
					{1,5,3,},
					{5,8,6,4,},
					{9,2,7,6,8,},
					{7,2,8,3,1,4,9},
			};
		for (int a=0; a<nums.length; a++) {
			for(int b=0; b<nums[a].length; b++) {
				if (nums[a][b]%2==0) {
					System.out.print(nums[a][b]+" ");
				}
			}
		}

	}

}
