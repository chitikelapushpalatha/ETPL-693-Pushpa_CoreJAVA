package com.evergent.corejava.Strings1;

public class SplitDemo2 {

	public static void main(String[] args) {
		String str="Java is a powerful programming";
		String[] words = str.split(" ");
		for(String w:words)
			System.out.println(w);
		// TODO Auto-generated method stub

	}

}
