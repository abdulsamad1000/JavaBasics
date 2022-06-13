package com.syntax.class11;

public class Phone {
	
	String name;
	String model;
	int storage;
	int ram;
	
	void useToTalk() {
		System.out.println(" phone can be use to talk");
	}
	void useForText() {
		System.out.println("phone can be use to text");
	} 
	public static void main(String[] args) {
		Phone samsung=new Phone();
		samsung.name="Samsung Galaxy";
		samsung.model="Note10";
		samsung.storage=125;
		samsung.ram=8;
		
		samsung.useForText();
		System.out.println(samsung.ram);
		
		
	}
;
	
}
