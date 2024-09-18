package com.evergent.corejava.collections.stack;
//push:Add an element to the top of the stack
//pop:Remove the top element from stack
//peek:view the top element from stack without removing it.
//isEmpty:check if the stack is empty
//search for an element in the stack and return its position from the top
import java.util.Stack;
public class Stack_Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Stack<String>Stack=new Stack<>();
		Stack.push("Apple");
		Stack.push("Banana");
		Stack.push("cherry");
		Stack.push("Date");
		System.out.println("Stack:"+Stack);
		String topElement=Stack.peek();
		System.out.println("Top element:+topelement");
		String removedElement=Stack.pop();
		System.out.println("popped element:"+removedElement);
		System.out.println("stack after pop:"+Stack);
		System.out.println("------------------");
		boolean isEmpty=Stack.isEmpty();
		System.out.println("Is the stack empty?"+isEmpty);
		int position =Stack.search("banana");
		if(position!=-1)
		{
			System.out.println("position of 'banana'from top:"+position);
		}
		else
		{
			System.out.println("banana is not in the stack");
		}
		Stack.clear();
		System.out.println("stack after clearing:"+Stack);
		}
		
		
		
		
		

	}
