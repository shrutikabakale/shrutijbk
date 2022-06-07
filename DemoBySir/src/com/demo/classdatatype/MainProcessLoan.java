package com.demo.classdatatype;

public class MainProcessLoan {
	
			public static void main(String[] args) {
				ExamleClassAsObject s1=new ExamleClassAsObject();
				ClassAsObjectProcessLoan c1=new ClassAsObjectProcessLoan();
				c1.p= 100000f;
				c1.n=5f;
				c1.r=8.5f;
				float r=s1.callIntrest(c1);
				System.out.println(r);
			}
}
	
