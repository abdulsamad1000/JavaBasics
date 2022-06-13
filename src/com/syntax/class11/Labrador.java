package com.syntax.class11;

public class Labrador {
	double weight;
	String color;
	int feet;
	int age;
	void runingFast() {
		System.out.println("Labrador dog is really fast in runing");
	}
	void bark() {
		System.out.println("Labrador dog is barking a lot");
	}
	void bite() {
		System.out.println("labrdor dog is bite ");
	}
	public static void main(String[] args) {
		Labrador dog=new Labrador();
		dog.weight=25;
		dog.color="white";
		dog.feet=4;
		dog.age=15;
		
		dog.runingFast();
		
		System.out.println(dog.feet);
		
		
	}

}
