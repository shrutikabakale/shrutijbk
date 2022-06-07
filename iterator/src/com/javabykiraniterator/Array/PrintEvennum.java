package com.javabykiraniterator.Array;

public class PrintEvennum {
	public static void main(String[] args) {
		
		int a[]={10,20,5,7,50,40,50};
		for(int i=0;i<a.length;i++){
		if(a[i]%2==0){
			System.out.println(a[i]);
		}
		}
		//odd
		for(int j=0;j<a.length;j++){
			if(a[j]%2!=0){
				System.out.println(a[j]);
			}
		}
		}}
