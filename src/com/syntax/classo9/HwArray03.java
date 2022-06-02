package com.syntax.classo9;

public class HwArray03 {

	public static void main(String[] args) {
		// create an array of animals and store 5 elements into it.
		// using 2 different loops print all elements from the array.
		
		String []animals= {"Tiger","loin"," Cat"," Dog"," Elphent"};
		for (String animalType:animals) {
			System.out.print(animalType+" ");
		}
		System.out.println();
		System.out.println("==================2nd way============================");
		for (int x=0; x<animals.length; x++) {
			System.out.print(animals[x]+" ");
		}

	}

}
