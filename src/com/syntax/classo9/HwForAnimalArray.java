package com.syntax.classo9;

public class HwForAnimalArray {

	public static void main(String[] args) {
		
		String animals[]= {"Cow","loin","Dog","Horse","Sheep"};
		for (String name:animals) {
			System.out.print(name+" ");
		}
		System.out.println();
		System.out.println("================2nd way==================");
		for (int name=0; name<animals.length; name++) {
			System.out.print(animals[name]+" ");
		}
	}

}
