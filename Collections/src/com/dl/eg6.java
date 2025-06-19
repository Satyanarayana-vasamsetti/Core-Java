package com.dl;

import java.util.Enumeration;
import java.util.Vector;

public class eg6 {
	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();
		vector.add("one");
		vector.add("two");
		vector.add("three");
		vector.add("four");
		System.out.println(vector);
		
		Enumeration<String> elements = vector.elements();
		while(elements.hasMoreElements()) {
			System.out.println(elements.nextElement());
		}
	}
}
