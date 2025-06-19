package com.dl;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class ex9 {
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(5,"five");
		hashMap.put(1,"one");
		hashMap.put(6,"six");
		hashMap.put(4,"four");
		hashMap.put(3,"three");
		hashMap.put(null,"five");
		hashMap.put(5,null);
		hashMap.put(null,"five");
		System.out.println(hashMap);
		
		LinkedHashMap<Integer, String> LinkedHashMap = new LinkedHashMap<Integer, String>();
		LinkedHashMap.put(5,"five");
		LinkedHashMap.put(1,"one");
		LinkedHashMap.put(6,"six");
		LinkedHashMap.put(4,"four");
		LinkedHashMap.put(3,"three");
		LinkedHashMap.put(null,"five");
		System.out.println(LinkedHashMap);
		
		TreeMap<Integer, String> TreeMap = new TreeMap<Integer, String>();
		TreeMap.put(5,"five");
		TreeMap.put(1,"one");
		TreeMap.put(6,"six");
		TreeMap.put(4,"four");
		TreeMap.put(3,"three");
//		TreeMap.put(null,"five");
		System.out.println(TreeMap);
		
		
	}
}
