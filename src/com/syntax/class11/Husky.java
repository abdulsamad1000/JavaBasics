package com.syntax.class11;

public class Husky {
	// Task#2
	// Create a Dog Class and create 3 different objects of it:
	// Husky, Bulldog, Labrador with specific attributes and behaviors.
	
	String name;
	String color;
	int age;
	double weight;
	double hieght;
	void smell() {
		System.out.println(" Dog smell");
	}
	void run() {
		System.out.println(" Dog runing");
	}
	void bite() {
		System.out.println("Dog bites");
	}
	public static void main(String[] args) {
	Husky dog=new Husky();
	dog.name="husky";
	dog.color="brown";
	dog.weight=10;
	dog.hieght=2;
	dog.run();
	System.out.println(dog.name);
		
	}
}
