package com.syntax.class10;

public class AnthorWayoF2DArray {

	public static void main(String[] args) {
		// create 2d array of states
		// 1 array - NY All cities of NY State
		// 2 array CA  ALL Cities of CA State
		// 3 array FL ALL Cities of FL state
		// 4 array VA ALL cities of VA state
		
		
		String [][]usa= {
				
				{"New York","Albany","Buffalo"},
				{"los Angeles","San Francisco","San Jose","San Diego","Redding"},
				{"Maimai","Orlando","Nicevill","Tampa"},
				{"McLean","Richmond","Lessburg"},
				
				
		};
		System.out.println(usa[1][2]); // San Jose
		System.out.println(usa [2][0]); // Maimai
		System.out.println("Total numbers of 1D arrays in usa= "+usa.length);
		
		// i want to see how many element inside my first array
		int elem1array= usa[0].length;
		System.out.println("number of element in 1 array= "+elem1array);
		
		// i want to see how many element inside my second array
		int elem2array= usa[1].length;
		System.out.println("number of element in 2 array= "+elem2array);
		
		
		
		
		

	}

}
