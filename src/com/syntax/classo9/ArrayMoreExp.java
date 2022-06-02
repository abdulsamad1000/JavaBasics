package com.syntax.classo9;

public class ArrayMoreExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	char []grade=new char[6];
	// first way
	grade [0]='A';
	grade [1]='B';
	grade [2]='C';
	grade [3]='D';
	grade [4]='E';
	grade [5]='F';
	System.out.println("print me the Array of "+grade[5]);
	
	System.out.println("========== 2 way =========================");
	String [] grade1= {"A","B","C","D","E","F"};
	System.out.println("print me the grade of "+grade1[0]);
	
	System.out.println("========== 3rd way ==========================");
	for (int i=0; i<grade.length; i++) {
		System.out.print(grade[i]+" ");
	}
	System.out.println();
	System.out.println("========== show the total result of my elements ==========================");
	
	int size=grade.length;
	System.out.println(size);
	
	System.out.println("=============== 1st way ==========================");
	String [] names=new String[3];
	names [0]="khan";
	names [1]="jhon";
	names [2]="mike";
	
	System.out.println("please print me the names of these peopole "+names[0]);
	
	System.out.println("==================== 2nd way ======================");
	String []names1= {"khan","jhon","mike"};
	System.out.println("please tell me the name "+names1[1]);
	
	System.out.println("=========== 1st way ===================");
	
	String [] words=new String [4];
	words[0]="Java";
	words[1]="Saturday";
	words[2]="Day";
	words[3]="Coding";
	System.out.println("Saturday is Java coding day "+words[0]);
	System.out.println("=============== 2nd way =====================");
	String []words1= {"Java","Saturday","Day","Coding"};
	System.out.println("Saturday is Java coding day "+words1[3]);
	
	System.out.println("=============== 3rd way ==================");
	String [] words2= {"Java","Saturday","day"};
	//          i want to retrieve all the elements
	for (int a=0; a<words2.length; a++) {
		System.out.print(words2[a]+" ");
	}
	
	
	
	
	
	
	
	
	

	}

}
