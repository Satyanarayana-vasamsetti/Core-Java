package com.dl;

import java.util.Stack;

public class eg7 {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.add("one");
		stack.add("one");
		stack.add("two");
		stack.add("three");
		stack.add("four");
		System.out.println(stack);
		
		Stack<Integer> s = new Stack<Integer>();
		s.push(1);//3
		s.push(2);
		s.push(3);//1
		
		System.out.println(s.pop());
		System.out.println(s.search(3));
		System.out.println(s.peek());
		}
}
