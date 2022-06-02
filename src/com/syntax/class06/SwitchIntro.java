package com.syntax.class06;

public class SwitchIntro {

	public static void main(String[] args) {
		
		
		int day= 8;
		String name;
		if (day==1) {
			name=" monday ";
		}else if (day==2) {
			name="tuesday";
		}else if (day==3) {
			name=" wensday";
		}else if (day==4) {
			name=" thursday";
		}else if (day==5) {
			name=" friday";
		}else if (day==6) {
			name=" saturday";
		}else if (day==7) {
			name=" sunday";
		}else {
			name = "Invalid";
		}

		System.out.println(name);
		System.out.println("------------------------------------------------");
			// swithc is a value based statment
		switch (day) {

		case 1:
			name = "monday";
			break;
		case 2:
			name = "tuesday";
			break;
		case 3:
			name = "wensday";
			break;
		case 4:
			name = "thurday";
			break;
		case 5:
			name = "friday";
			break;
		case 6:
			name = "saturday";
			break;
		case 7:
			name = "sunday";
			break;
		default:
			name = "Invalid";
			break;
		}

		System.out.println(name);
		
		}
			
		}
		
	


