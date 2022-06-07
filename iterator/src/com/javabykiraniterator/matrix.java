package com.javabykiraniterator;

public class matrix {
	public static void main(String[] args) {

		/*
		 * for (int i = 1; i <= 3; i++) { for (int j = 1; j <= 3; j++) { if (i
		 * == 2) System.out.print("@");
		 * 
		 * else if (i == 3) System.out.print("#"); else System.out.print("*"); }
		 * System.out.println();
		 * 
		 * }
		 */
		//

		/*for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 3; j++) {
				// if(i==1||i==3)
				if (i % 2 != 0)
					System.out.print("*");
				else
				// if(i==2||i==4)
				if (i % 2 == 0)
					System.out.print("@");
				else
					System.out.print("$");
			}
			System.out.println();

		}*/
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				if(i==1||i==2||i==3&&j==1)
					System.out.print("*");
				else
					System.out.println("$");
					
		
	}
			System.out.println();
}
	}
}
