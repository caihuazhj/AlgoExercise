package com.stack;

import java.util.Stack;

/**
 * 用java实现栈操作
 * @author Administrator
 *
 */
public class Stacks {

	static String[] months = {"January","February","Match","April","May","June","July",
			"August","September","October","November","December"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack stack = new Stack();
		for(int i=0;i<months.length;i++){
			stack.push(months[i]);
			
		}
		System.out.println("stack:"+stack);
		stack.addElement("top");
		
		System.out.println("555"+stack.elementAt(5));
		
		System.out.println("poping");
		
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

}
