package com.evergent.corejava.collections.stack;
//push():adding values into stack
//pop():remove values into stack
//peek():last element value is s
import java.util.Stack;

public class Stack_Demo3 {

	public static void main(String[] args) {
		Stack mystack=new Stack();
		mystack.push("Red");
		mystack.push("Black");
		mystack.push("white");
		System.out.println(mystack);
		boolean b=mystack.isEmpty();
		System.out.println(b);
		System.out.println(mystack);

		
		
		// TODO Auto-generated method stub

	}

}
