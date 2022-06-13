package com.syntax.class11;

public class Samsung {

	String name;
	String color;
	String OS;
	int year;
	double screen;
	int camera;
	void clearVoice() {
		System.out.println("Samsung has a great microphone");
	}
	void greatFeature() {
		System.out.println("Samsung has a lot of advance features compair to other phones");
	}
	public static void main(String[] args) {
		Samsung phone=new Samsung();
		phone.name="samsung glaxcy";
		phone.color="white";
		phone.OS="Android note12";
		phone.year=2019;
		phone.screen=5.9;
		phone.camera=5;
		phone.clearVoice();
		System.out.println(phone.name);
	}

}
