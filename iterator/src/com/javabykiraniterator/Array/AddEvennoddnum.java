package com.javabykiraniterator.Array;

public class AddEvennoddnum {
	public static void main(String[] args) {

		int a[] = { 10, 20, 5, 7, 50, 40, 50 };
		int evensum = 0, oddsum = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				evensum = evensum + a[i];
				
			} else
				oddsum = oddsum + a[i];
			
		}System.out.println("evennumbersum" + evensum);
		System.out.println("odd number sum" + oddsum);
	}

}
