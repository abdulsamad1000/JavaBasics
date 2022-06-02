package com.syntax.class07;

public class HwloopExam {

	public static void main(String[] args) {
	// print only odd number from 100 to 1
		System.out.println();
		
		int r=100;
		while (r>=1) {
			if (r%2!=0) {
				System.out.println(r+" ");
			}
			r--;	
		}
		// anthor way
		int y=99;
		while (y>=1) {
			System.out.println(y+ " ");
			y-=2;
		}

	}

}
