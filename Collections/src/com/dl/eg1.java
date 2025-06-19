package com.dl;

import java.util.ArrayList;

public class eg1 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		//add()
		al.add(1);
		al.add(2);
		al.add(2,3);
		al.add(4);
		System.out.println(al);
		
		//update(add)
		al.add(2,4);
		System.out.println(al);
		
		//update(set)
		al.set(4, 5);
		System.out.println(al);
		
		//search(get())
//		al.get(4);
		System.out.println(al.get(4));
		
		//delete
		System.out.println(al.remove(1));
		System.out.println(al);
		
		//indexOf()
		System.out.println(al.indexOf(3));
	}
}
