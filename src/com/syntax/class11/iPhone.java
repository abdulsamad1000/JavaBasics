package com.syntax.class11;

public class iPhone {
	String name;
	int camera;
	int year;
	void calling() {
		System.out.println(" use iphone to calling people");
	}
	void texting() {
		System.out.println("use iphone to text");
	}
	public static void main(String[] args) {
		iPhone phone = new iPhone();
		phone.name = "Pro Max";
		phone.camera = 3;
		phone.year = 2018;
		phone.calling();
		System.out.println(phone.camera);
	}

}
