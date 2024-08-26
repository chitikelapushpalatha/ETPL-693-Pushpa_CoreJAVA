package com.evergent.corejava.Strings1;

public class StringBuilderExample1 {

	public static void main(String[] args) {
		StringBuilder st=new StringBuilder("Hai");
		System.out.println("Initial String:" +st);
		st.append(" World!");
		System.out.println("after append:"+st);
		st.insert(6,"Beautiful");
		System.out.println("After insert:"+st);
		st.replace(0,5,"Hello");
		System.out.println("After replace:"+st);
		st.delete(0,3);
		System.out.println("After delete:"+st);
		st.reverse();
		System.out.println("After reverse:"+st);
		
		// TODO Auto-generated method stub

	}
}

	