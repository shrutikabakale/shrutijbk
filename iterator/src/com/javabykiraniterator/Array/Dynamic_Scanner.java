package com.javabykiraniterator.Array;

import java.util.Scanner;

public class Dynamic_Scanner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array" );
		int size=sc.nextInt();
		int b[]=new int[size];
		System.out.println("Enter the value of array" );
		for(int i=0;i<b.length;i++){
			b[i]=sc.nextInt();
			
		}
		for(int i=0;i<b.length;i++){
		System.out.println(b[i]);
	}

}}
