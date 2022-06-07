package com.javabykiraniterator.Array;

public class ReverseCopyArray {
public static void main(String[] args) {
	int a[]={10,20,30,40,50};
	int b[]=new int[a.length];
	for(int i=a.length-1,j=0;i>=0;i--,j++){
		b[j]=a[i];
		
	
	}
	System.out.println("b array");	
	for(int  i=0;i<b.length;i++){
		
		System.out.println(b[i]+" ");	
	}
	
}
}
