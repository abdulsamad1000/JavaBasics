package com.syntax.class13;

public class ShortNoteForMethodsUsage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to create a string class we need to have our stirng main methods
		// which is String str=new String("this is batch 13");

		String str = new String("Batch 13 is great.i was kidding");
		System.out.println(str.length());
		// (str.length();=> Method this method will show you how many character
		// have in this sentence.
		// it will account the spaces to.
		System.out.println(str.toUpperCase());
		// (str.toUpperCase();=> Method Note this will not change the original sentence
		// this is the method which we can change sentence from lower to uppercase.
		// if you want to print the original statement just do this.
		System.out.println(str);
		// (str.isEmpty();=> Methodif i want to check if this string variable contains
		// anything or it is empty
		// we use this bellow methods for it.
		// not if it contains anything it will tells as false if its empty then it true.
		System.out.println(str.isEmpty());
		// (str.trim();=> Method example: i was reading a data from webpage theri were
		// soem field field mean properties liek firstname lastname password
		// i want to make sure when the user are entering the information i do not want
		// take any space i want remove all the spaces.
		// pratent Tara is password name the user put the password with spaces
		// how i can remove the space i can use trim method. i will not see the spces
		// before and after the actual text.
		String str2 = new String(" Tara    ");
		// this above String is the same as bellow
		String str3 = "Tara";
		System.out.println(str2.trim());
		// (str.contains();=> this method we use to search something in our string
		// like do we have that word or character in the text or sentence or not.
		// we use this method for contains. like this below exapmpel.
		str = new String("Batch 13 is great.i was kidding");
		System.out.println(str.contains("is"));
		// (str.startWith();=> by this methods we can search if our text or sentence
		// start with words like this below example.
		str = new String("Batch 13 is great.i was kidding");
		System.out.println(str.startsWith("Batch"));
		// (str.endsWith();=> by this method we can seach the text or sentece by the end
		// word or letter to find the ends we use this method endsWith
		str = new String("Batch 13 is great.i was kidding");
		System.out.println(str.endsWith("kidding"));

		System.out.println("=== anthor example to find the index in the sentence");
		// (str.charAt(0);=> i want to know which letter or charchter is exist in index we
		// use this method to find the index of that letter or character
		// in the text or sentence we use this method (str.charAt(0);
		// attention always the index start from 0 when we use this method it count the
		// spaces as well then it give as the letter or characters
		str = new String("Batch 13 is great.i was kidding");
		System.out.println(str.charAt(9));
		System.out.println(str.charAt(20));
		System.out.println("== anthor examples===");
		// (str.indexOf();=> we use this method if we want to know the index that exist 
		// letter example index of (i)it will show as in which index this letter is like
		// 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,etc. but in the double quotation
		//in the string we use this method (str.indexOf();
		String str4=new String ("Where is sameer");
		// comment this above string is same as below we can write the above like this
		// they are the same either way.
		String str5="Where is sameer";
		System.out.println(str5.indexOf("i"));
		System.out.println(str5.indexOf("m"));
		System.out.println(str5.indexOf("e",1));
		System.out.println(str5.indexOf("r",8 ));
		// how to write a for loop
		
		int counter=0;
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i)=='e') {
				counter++;
				System.out.println(i);
			}
		}
		// (str.substring(); ==>  this method we use when we want to get a part of the 
		// string if i am not interested in the complete string just a part their is 
		// method we can use for it. that is str.substring();
		// this method is ignored the letter in a head and start printing
		String str7=new String("i am confused true");
		str7="i am confused true";
		System.out.println(str7.substring(14));
		
		
		
		
		

	}

}
