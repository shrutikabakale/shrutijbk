package com.demo.classdatatype;

public class Notes {

	String data="\n read the book\n";
	
	void writeNotes(String s){
		data = data+s;
	}
		String readNotes(){
			System.out.println(data);
			return data;
		}
	}
	

