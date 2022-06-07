package com.javabykiraniterator.Array;

public class FindEvenindexnnum {
	public static void main(String[] args) {
		int a[]={11,22,34,44,56};
		
		for(int i=0;i<a.length;i++){
			//if(i%2==0)
			{
				if((a[i]%2==0)&&(i%2==0)){
					System.out.println(i);
					System.out.println(a[i]);
				}

			}
		
		}
	}
}
		