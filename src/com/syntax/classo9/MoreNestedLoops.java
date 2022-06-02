package com.syntax.classo9;

public class MoreNestedLoops {

	public static void main(String[] args) {
		// how to create a multiplication table.
		
		for (int x=1; x<=10; x++) {
			for (int y=1; y<=10; y++) {
				System.out.println(x+" x "+y+" = "+(x*y));
			}
			System.out.println("-------------------");
		}
		System.out.println("============= Clock ============");
		for (int hrs=0; hrs<24; hrs++) {
			for (int min=0; min<60; min++) {
				String time;
				if(hrs<10 && min<10) {
					time="0"+hrs+":"+min;
				}else if (hrs<10 && min>10) {
					time="0"+hrs+":"+min;
				}else if (hrs>10 && min<10) {
					time=hrs+":"+"0"+min;
				}else {
					time=hrs+":"+min;
				}
				System.out.println(time);
			}
		}
		
		}

	}


