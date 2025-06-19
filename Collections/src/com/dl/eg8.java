package com.dl;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class eg8 {
	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(1);
		hashSet.add(3);
		hashSet.add(0);
		hashSet.add(5);
		hashSet.add(2);
		hashSet.add(null);
		System.out.println(hashSet);
		
		HashSet<String> hashSet1 = new HashSet<String>();
		hashSet1.add("one");
		hashSet1.add("two");
		hashSet1.add("zero");
		hashSet1.add("six");
		hashSet1.add("four");
		System.out.println(hashSet1);
		
		LinkedHashSet<Integer> LinkedhashSet = new LinkedHashSet<Integer>();
		LinkedhashSet.add(1);
		LinkedhashSet.add(3);
		LinkedhashSet.add(0);
		LinkedhashSet.add(5);
		LinkedhashSet.add(2);
		LinkedhashSet.add(null);
		System.out.println(LinkedhashSet);
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(1);
		treeSet.add(3);
		treeSet.add(0);
		treeSet.add(5);
		treeSet.add(2);
//		treeSet.add(null);
		System.out.println(treeSet);
	}
}
