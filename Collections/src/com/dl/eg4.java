package com.dl;

import java.util.LinkedList;
import java.util.ListIterator;

public class eg4 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		ListIterator<Integer> iterator = list.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
	}
}
