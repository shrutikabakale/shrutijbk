package com.demo.classdatatype;

public class Student {
	int eid;
	int rollno;
	String name;
	String course;
	float gp;
	
	Notes doStudy(Book b1){
		Notes notes =new Notes();
		String s1 = b1.readchapter1();
		notes.writeNotes(s1 + "\n")                      ;
		String s2=b1.readchapter2();
		notes.writeNotes(s2+ "\n");
		String s3=b1.readchapter3();
		notes.writeNotes(s3+ "\n");

		//Notes notes = null;
		return notes;
	}void display(){
		System.out.println("\n Student Information");
		System.out.println("eid " +eid);
		System.out.println("rollno " +rollno);
		System.out.println("name " +name);
		System.out.println("course " +course);
		System.out.println("gp " +gp);
		
	}
	
	

}
