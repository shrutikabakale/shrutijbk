package com.demo.classdatatype;

public class CallMethodwithoutCreatingObject {

	int x=10,y=20;
	float z;
	
	void add(){
		z=x+y;
		display(z);
		
	}
	void sub()
	{
		z=x-y;
		display(z);
	}
	 void display(float ans)
	 {
		 System.out.println(ans);
		 
	 }
	 public static void main(String[] args) {
		 CallMethodwithoutCreatingObject s1=new CallMethodwithoutCreatingObject();
		 s1.add();
		 s1.sub();
		
	}
	
}
