package com.javabykiraniterator.Whileloop;

public class PrintSumofDigit {
	public static void main(String[] args) {
		int n=123;
		int r;
		int sum=0;
		System.out.println("n= "+n);
		while(n>0){
			r=n%10;
			n=n/10;
			sum=sum+r;
			System.out.println("quotient (n)= "+n);
            System.out.println("remainder (r)= "+r);
            System.out.println("sum=sum+r= "+sum);
            System.out.println("sum = "+sum);
         
            System.out.println("\t");
			
			
		}
		System.out.println("sum is =" +sum);
		
	}

}
