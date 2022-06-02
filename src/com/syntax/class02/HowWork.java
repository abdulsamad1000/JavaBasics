package com.syntax.class02;

public class HowWork {

	public static void main(String[] args) {
		// Task 01
		double num1= 19.99;
		double num2= 25.88;
		double sum, sub, mult, div;
		
		sum=num1+num2;
		sub=num1-num2;
		mult=num1*num2;
		div=num1/num2;
		System.out.println(" Task1");
		System.out.println("The addtion of 2 numbers"+num1+" and "+num2+" is equal to "+sum);
		System.out.println("The subtraction of 2 numberes "+num1+" and "+num2+" is equal to "+sub);
		System.out.println("The multiplication of 2 numbers "+num1+" and "+num2+" is equal to "+mult);
		System.out.println("The divsion of 2 numbers"+num1+" and "+num2+" is equal to "+div);
		
		System.out.println("------------------------------------------------------------");
		
		// task2
		double box1= 3.9f;
		double box2= Math.sqrt(box1);
		System.out.println("Task2 ");
		System.out.println(" The square of the "+box1+" is "+box2);
		int width,hight,premeter;
		int H=8;
		int W=5;
		int P=2*H+W;
		int area= W*H;
		
		System.out.println(" The primiter of a Rectancle with width "
		+W+" and hight "+H+" is equsl to "+P+" and the area "+area);
		
		
		
		

	}

}
