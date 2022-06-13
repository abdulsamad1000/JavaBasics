package com.syntax.class11;

public class Car {

	String colour;
	String make;
	String model;
	int hp;
	int year;
	String typeOfEngine;
	int noOfDoors;
	
	void moveForward() {
		System.out.println("Car is moving forward");
	}
	void reverse() {
		System.out.println("Car is moving backwards");
	}
	public static void main(String[] args) {
		 Car bmw = new Car ();
		
		bmw.make="bmw";
		bmw.model="x6";
		bmw.colour="black";
		bmw.noOfDoors=5;
		bmw.year=2022;
		bmw.hp=300;
		bmw.moveForward();
		bmw.reverse();
		System.out.println(bmw.model);
		
	}
 

	}


