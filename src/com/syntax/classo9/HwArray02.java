package com.syntax.classo9;

public class HwArray02 {

	public static void main(String[] args) {
		// create an array of animals and store 5 elements into it.
		// using 2 different loops print all elements from the array.
		
		String []animal=new String[5];
		animal[0]="Tiger";
		animal[1]="loin";
		animal[2]="Cat";
		animal[3]="Dog";
		animal[4]="Elphent";
		for (String animalNam:animal) {
			System.out.print(animalNam+" ");
		}
		
		System.out.println();
		System.out.println("============2nd way=====================");
		for (int x=0; x<animal.length; x++) {
			System.out.print(animal[x]+" ");
			
		}



	}

}
