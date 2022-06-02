package com.syntax.class10;

public class AllEelemntsFrom2Darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String [][]usa= {
				
				{"New York","Albany","Buffalo"},
				{"los Angeles","San Francisco","San Jose","San Diego","Redding"},
				{"Maimai","Orlando","Nicevill","Tampa"},
				{"McLean","Richmond","Lessburg"},
				
				
		};
	// outer loop iterates over rows
	// inner loop iterates over colums
	for (int row=0; row<usa.length; row++) {
		
		
		for(int col=0; col<usa[row].length; col++) {
			System.out.print(usa[row][col]);
		}
		System.out.println();
	}

	}

}
