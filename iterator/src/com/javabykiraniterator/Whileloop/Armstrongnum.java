package com.javabykiraniterator.Whileloop;

public class Armstrongnum {
	public static void main(String[] args) {
		int n=370;
		 int temp;
		 int rem;
		 int sum = 0;

	        temp = n;
	        System.out.println("n = "+n);
	        while (n>0)
	        {   System.out.println("sum= "+sum);
	            rem = n % 10;
	            n=n/10;
	            sum=sum+(rem*rem*rem);
	            System.out.println("quotient (n/10)= "+n);
	            System.out.println("remainder (rem)= "+rem);
	            System.out.println("sum=sum+(rem*rem*rem)= " +sum);
	            System.out.println("sum = "+sum);
	            System.out.println("\t");
	        }
	        System.out.println("Total sum = "+sum);
	        if(temp == sum)
	            System.out.println(temp + " is an Armstrong number.");
	        else
	            System.out.println(temp + " is not an Armstrong number.");
	    }
	}
	


