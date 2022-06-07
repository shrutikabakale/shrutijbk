package com.demo.classdatatype;

public class mainTest {
public static void main(String[] args) {
	Student s1= new Student();
	s1.eid=101;
	s1.name="shruti";
	s1.course="bio";
	s1.gp= 8.7f;
	s1.rollno=11;

	s1.display();

	Book b1=new Book();
	b1.bid=2324;
	b1.bname="my book";
	b1.price=400;
	
	b1.display();
	
	Notes notes=s1.doStudy(b1);
	notes.readNotes();
	
}
}
