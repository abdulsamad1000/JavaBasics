package com.syntax.classo3;

public class PracticeForIfstatment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// i want to find the largest number 10 and 20
		int num=10;
		int num2=20;
		
		
		if (num>num2) {
			System.out.println("the number 20 is the largest number "+num2);
		}
		else {
			System.out.println("the number 10 is the largest number "+num);
		}
		System.out.println();
		System.out.println("===================== Double IF statement practice========================");
		
		// if morgageRate is less then a 4 i would be a house.
		
		double morgageRate=4.2;
		if (morgageRate<6) {
		System.out.println("I would buy a house ");
		}
		else {
			System.out.println(" i am not buying a house");
		}
		System.out.println();
		System.out.println("=========================== anthor example=================");
		// if you are hungry go and eat something 
		
		int num3=99;
		int num4=10;
		if (num3>num4) {
			System.out.println(num3+" is bigger number than "+num4);
		}
		System.out.println();
		System.out.println("================= Int anthor example ===================");
		// declar a temperture 
		// if temp is higher then 75 i will go for a walk
		
		int temp=74;
		if (temp>75) {
			System.out.println("I will go for a walk");
		}else {
			System.out.println(" i will do my home work");
		}
		System.out.println();
		System.out.println("========= char anthor examples ================");
		// for char and numeric values which are 10,50,30,15,21 etc we use == sign for compairson 
		char gender='M';
		
		if (gender=='F') {
			System.out.println(" You like man");
		}else {
			System.out.println(" You like women");
		}
		System.out.println();
		System.out.println("==================String anthro examples=============");
		// String example if my browser is eaqual to a chrom note when we work with String in IF statement inside 
		// the round bracket we write the variable then the equals and round brakets
		
		String browser="chrom";
		if (browser.equals("chrom")) {
			System.out.println(" i would like to execute all the test case on chrom");
			System.out.println("i want to test the whole application ");
		}else {
			System.out.println(" i am not doing any test cases");
			System.out.println(" reason wrong browser ");
		}
		System.out.println();
		System.out.println("======================Task for IF AND else statment========");
		double value=10.99;
		double value2=9.99;
		if (value>value2) {
			System.out.println(value+" is larger than ");
		}else {
			System.out.println(" other wise larger is "+value2);
		}
		System.out.println();
		System.out.println("=============2nd question Task for IF AND else statment ");
		int tempr=28;
		if (tempr<32) {
			System.out.println(" water will freez with tempreture "+tempr);
			System.out.println(" the water is really cold ");
			System.out.println(" the water is icy ");
		}else {
			System.out.println("water will not freez with tempreture "+tempr);
			System.out.println("it is not that cold out side");
		}
		System.out.println();
		System.out.println("============= anther task=====");
		int actualHrs=10;
		int expectedhrs=15;
		if (expectedhrs<actualHrs) {
			System.out.println("You will love the course and you will succed");
		}else {
			System.out.println("Course will be very hard for you!");
		}
		System.out.println();
		System.out.println("======================== anther example for time");
		// if the time is equal to morning say Good morning if time is not equal to morning then say Good afternoon
		
		String time="morning";
		if(time.equals("Morning")){
			System.out.println("Good morning people");
		}else {
			System.out.println("Good afternoon people");
		}
		System.out.println();
		System.out.println("===========================anthor IF else statment=============");
		int time1 =7;
		if (time1>8) {
			System.out.println("it is time for lunch");
		}else {
			System.out.println("it is time for break");
		}
		
		System.out.println();
		System.out.println("=========String anthro example ================ anthro ");
		
		String names="Abdulsamad";
		if (names.equals("Abdulsamad")) {
			System.out.println("This is Abdulsamad momand one our automaiton tester");
			
			
		}else {
			System.out.println("This is anthor person");
		}
		
		System.out.println();
		System.out.println("============= Int anther example================");
		// first print the largest number then print the small number
		int num6=30;
		int num7=25;
		if (num6<num7) {
			System.out.println("the num 6 is the largest number "+num7);
		}else {
			System.out.println("then the num 7 is the largest number "+num6);
		}
		System.out.println();
		System.out.println("==============covert double to int casting ========================");
		
		
		double b=100.99;
		
		int x=(int)100.99;
		System.out.println(x);
		System.out.println("============convert from int to double anthero exapmple of casting=====");
		// converting of integer to double 
		int c=10;
		double d=(double)10;
		System.out.println(d);
		// converting from integer to float
		int y=50;
		float e=(float)50;
		System.out.println(e);
		// coverting from float
		float f=10.99f;
		long g=(long)10.99;
		System.out.println(g);
		
		
		
		
		
		
		
		
		}
		
	}


