package com.syntax.class11;

public class Pixel {
	
	String model;
	String OS;
	int camera;
	int battery;
	double resulotion;
	void calling() {
		System.out.println(" calling with wife");
	}
	void texting() {
		System.out.println(" you can text ");
	}
	public static void main(String[] args) {
		Pixel phone=new Pixel();
		phone.model="Android";
		phone.OS="Android 13";
		phone.camera=4;
		phone.battery=48;
		phone.resulotion=5.7;
		phone.texting();
		System.out.println(phone.OS);
	}

}
