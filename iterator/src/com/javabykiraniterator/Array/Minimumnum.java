package com.javabykiraniterator.Array;

public class Minimumnum {
	public static void main(String[] args) {
		int a[]={2,5,18,1,2,3,9};
		int min;
		min=a[0];
		for(int i=0;i<a.length;i++){
			
			if(min>a[i]){
				min=a[i];
				System.out.println(min);
			}
		}
		
	}

}
