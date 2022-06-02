 package com.syntax.classo9;

public class ArrayIntro {

	public static void main(String[] args) {
		
		// create an array
		
		int[] b=new int[4];
		
		// store values
		b[0]=90;
		b[1]=85;
		b[2]=70;
		b[2]=100;
		
		// i want to access my values from my array.
		// we access them base on their index
		System.out.println(b[2]);   // 70
		System.out.println(b[1]+ b[3]); // 185
		
		
		// anthor example with stirng.
		
		String []classMates=new String[5];
		
		// store valuse
		classMates[0]="Mohamad";
		classMates[1]="Ali";
		classMates[2]="khan";
		classMates[3]="Kabir";
		classMates[4]="Jhon";
		
		// we need to create an array of my classmates names
		System.out.println("My calssmate name is "+classMates[2]);
		
		

	}

}
