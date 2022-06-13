package com.syntax.class11;

public class phone1 {
	String model;
	String make;
	double screen;
	int Ram;
	int storage;
	int camera;
	void call() {
		System.out.println("calling someone");
	}
	void takePicture() {
		System.out.println("use my camera app to take picture");
	}
	
	public static void main(String[] args) {
		phone1 s22Ultra=new phone1();
		s22Ultra.make="Samsugn";
		s22Ultra.model="Samsung galaxy s22Ultra";
		s22Ultra.screen=6.8;
		s22Ultra.Ram=12;
		s22Ultra.camera=108;
		s22Ultra.storage=512;
		s22Ultra.call();
		System.out.println(s22Ultra.make);
		
		
		
	}
}
