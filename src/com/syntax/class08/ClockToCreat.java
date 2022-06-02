package com.syntax.class08;

public class ClockToCreat {

	public static void main(String[] args) {
		for (int h=0; h<=23; h++) {
			for (int m=0; m<=59; m++) {
				
			System.out.println(h+":"+m);
				
			}
		
		}
		
		
		
		
		
		System.out.println("------------------------------------------------------");
		
		for (int hrs=0; hrs<24; hrs++) {
			for (int min=0; min<60; min++) {
				String time;
				if (hrs<10 && min<min) {
					time="o"+hrs+":"+min;
					System.out.println(time);
				}else if (hrs<10 && min>10) {
					time="0"+hrs+":"+min;
				}else if (hrs>10 && min <10) {
					time=hrs+":"+"0"+min;
				}else {
					time= hrs+":"+min;
				}
				System.out.println(time);
			}
		}

	}

}
