package com.javabykiraniterator;

public class forloop1 {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == 1 || i == 2 || i == 3)
					System.out.print("*");
				if (i == 4 || i == 5||i==6)
				{
					System.out.print("#");
				}
				if (i == 7 || i == 8 || i == 9) 
				{
					System.out.print("@");
				}
			}
		
			System.out.println("");
		}
		

	}
}
