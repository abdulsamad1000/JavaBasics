package com.syntax.class13;

public class HowToReplaceOneLetterToAnthorLetterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// note this method it replace one character to anthor character one whole
		// word to anthro whole word
		String str = "Batch 13 is good actullay very good";
		System.out.println(str.replace("good", "great"));
		System.out.println(str.replace("B", "b"));
		System.out.println(str.replace("13", "15"));
		System.out.println(str.replace("Batch 13", "batch 15"));
		System.out.println(str.replace("is", "are"));
		System.out.println(str.replaceFirst("g", "G"));

		System.out.println();
		System.out.println("=== Complex examples with replace methods=====");
		
		// In this exmple we can replace the mix words numbers specail characters
		// by using the method str.repalceAll("","");
		String str2 = "sfkafdb1234567897665iKSNDASD!@#$((%^^'";

		System.out.println(str2.replaceAll("[0-9]", "#"));
		System.out.println(str2.replaceAll("[a-z]", "*"));
		System.out.println(str2.replaceAll("[A-Z]", "%"));
		System.out.println(str2.replaceAll("[A-Za-z]", "@"));
		System.out.println(str2.replaceAll("[A-Za-z0-9]", "#"));
		System.out.println(str2.replaceAll("[^0-9]", "#"));
		System.out.println(str2.replaceAll("[^a-z]", "="));
		System.out.println(str2.replaceAll("[^A-Z]", "+"));
		System.out.println(str2.replaceAll("[^A-Za-z0-9]", "&"));
		
		
		System.out.println();
		System.out.println("======= anther exmples===");
		// if you want to replace the certian thing and you want to retain the rest of 
		// String str="abcdefg12444jfdjjfd you want to replace things after g
		String str3="abcdefgDFGRR12444#$%^&**^^^";
		System.out.println(str3.replaceAll("[a-g]","%"));
		System.out.println(str3.replaceAll("[^A-Za-z0-9]",""));
		
		
		
		
		

	}

}
