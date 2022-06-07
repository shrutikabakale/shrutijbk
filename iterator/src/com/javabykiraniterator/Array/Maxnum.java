package com.javabykiraniterator.Array;

public class Maxnum {
	public static void main(String[] args) {
		int a[]={2,5,18,1,3,9};
		int max;
		max=a[0];
		for(int i=0;i<a.length;i++){
			
			if(max<a[i]){
				max=a[i];
				
			}
		}System.out.println(max);
		
	}

}
