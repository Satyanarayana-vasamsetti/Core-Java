package com.dl;

import java.util.LinkedList;

public class eg2 {
	public static void main(String[] args) {
		//LinkedList
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		
		list.set(4, 11);
		System.out.println(list);
		
	}
}
