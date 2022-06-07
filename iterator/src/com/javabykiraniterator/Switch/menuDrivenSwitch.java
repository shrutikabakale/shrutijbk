package com.javabykiraniterator.Switch;

import java.util.Scanner;

public class menuDrivenSwitch {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int a, b;

		System.out.println("1.Addition,\n2.Substraction,\n3.Multiplication,\n4.Division");

		System.out.println("Enter the choice");
		int num = sc.nextInt();
		// if(num>4){System.out.println("Invalid choice");
		int Number = num;

		switch (Number) {
		case 1: // add();
			System.out.println("Enter the value of a");
			a = sc.nextInt();
			System.out.println("Enter the value of b");
			b = sc.nextInt();
			int c = a + b;
			System.out.println("The result is " + c);
			break;

		case 2:
			System.out.println("Enter the value of a");
			a = sc.nextInt();
			System.out.println("Enter the value of b");
			b = sc.nextInt();
			int s = a - b;
			System.out.println("The result is " + s);
			break;

		case 3:
			System.out.println("Enter the value of a");
			a = sc.nextInt();
			System.out.println("Enter the value of b");
			b = sc.nextInt();
			int m = a - b;
			System.out.println("The result is " + m);
			break;

		case 4:
			System.out.println("Enter the value of a");
			a = sc.nextInt();
			System.out.println("Enter the value of b");
			b = sc.nextInt();
			float d = a / b;
			System.out.println("The result is " + d);
			break;

		default:
			System.out.println("Invalid Input");
			break;

		}
	}

	static void add() {
		System.out.println("Enter the value of a");
		int a = sc.nextInt();
		System.out.println("Enter the value of b");
		int b = sc.nextInt();
		int c = a + b;
		System.out.println("The result is " + c);
	}
}
