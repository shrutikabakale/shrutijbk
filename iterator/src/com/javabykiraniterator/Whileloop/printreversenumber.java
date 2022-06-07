package com.javabykiraniterator.Whileloop;

public class printreversenumber {
	public static void main(String[] args) {
		int n=123;
		int rem;
		int sum=0;
		System.out.println("n= "+n);
		while(n>0){
			rem=n%10;
			n=n/10;
			sum=(sum*10)+rem;
			
			System.out.println("quotient (n)= "+n);
            System.out.println("remainder (rem)= "+rem);
            System.out.println("(sum*10)+rem= "+sum);
            System.out.println("sum = "+sum);
         
            System.out.println("\t");
			
		}
		
		System.out.println("reverse number = " +sum);
	}
	}


