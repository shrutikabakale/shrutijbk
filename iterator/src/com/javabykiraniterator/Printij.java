package com.javabykiraniterator;

public class Printij {
	public static void main(String[] args) {
		/*
		 * for(int i=1;i<=5;i++) { for(int j=1;j<=5;j++){ System.out.print("*");
		 * }System.out.println(); } }
		 */
		/*
		 * for (int i = 1; i <= 5; i++) { for (int j = 1; j <= 5; j++) {
		 * if(i==1||i==3||i==5) System.out.print("*"); } System.out.println();
		 * 
		 * }
		 */

		/*
		 * for (int i = 1; i <= 5; i++) { for (int j = 1; j <= 5; j++) {
		 * if(i==1||i==3||i==5||j==1||j==3||j==5) System.out.print("*"); else
		 * System.out.print("#"); } System.out.println();
		 * 
		 * /*for (int i = 1; i <= 5; i++) { for (int j = 1; j <= 5; j++) {
		 * if(i==1||i==3||i==5||j==1||j==3||j==5) System.out.print("*"); else
		 * System.out.print("#"); } System.out.println();
		 */
		/*for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 3; j++) {
				if (i == 1 || i == 2 || i == 3 )
					System.out.print("*");
				if (i == 4 || i == 5 || i == 6 )
				{	System.out.print("#");
				}
			}
			System.out.println();
		}*/
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == 1 || i == 2 || i == 3 )
					System.out.print("*");
				if (i == 4 || i == 5)
				{	System.out.print("#");
				}
				if (i == 6 || i == 7||i==8|i==9)
					
				{	System.out.print("@");
				}
			}
			System.out.println();
		}
	}

}
