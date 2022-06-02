package com.syntax.classo9;

public class HwForCarArray {

	public static void main(String[] args) {
		
		String []car= {"Toyota","Hunda","Mercedez","Jeep","Rangrover","BMW"};
		for(String carType:car) {
			System.out.print(carType+" ");
		}
		System.out.println();
		System.out.println("==============2nd way======================");
		
		for (int carType=0; carType<car.length; carType++) {
			System.out.print(car[carType]+" ");
		}
		
	}
	}