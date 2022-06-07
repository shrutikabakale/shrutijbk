package com.javabykiraniterator.Whileloop;

public class Pallidrome_num {
	public static void main(String[] args) {
		int n=4334;
		int rem;
		int sum=0;
		int temp=n;
		while(n>0)
		{   System.out.println("sum= "+sum);
			rem=n%10;
			n=n/10;
			sum=(sum*10)+rem;
			 System.out.println("quotient (n)= "+n);
	            System.out.println("remainder (rem)= "+rem);
	            System.out.println("(sum*10)+rem= "+sum);
	            System.out.println("sum = "+sum);
	         
	            System.out.println("\t");
		}
		if(temp==sum){
			System.out.println(temp+ "number is pallidrom");
		}else 
			{
				System.out.println(temp+ "number is not  pallidrom");
			}
		}
		
	}
 
