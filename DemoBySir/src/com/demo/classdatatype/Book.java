package com.demo.classdatatype;

public class Book {
int bid;
String bname;
float price;
String chapter1 = "Value of pi 3.14 and phi is 1.6";
String chapter2 = "standard gravity is 9.8m/s";
String chapter3 = "This is example for class to class communication";

String readchapter1(){
	return chapter1;
}
String readchapter2(){
	return chapter2;
}
String readchapter3(){
	return chapter3 ;
}
void display(){
	System.out.println("\n Book Information");
	System.out.println("eid  " +bid);
	System.out.println("bname " +bname);
	System.out.println("price " +price);
	
	
}
}
