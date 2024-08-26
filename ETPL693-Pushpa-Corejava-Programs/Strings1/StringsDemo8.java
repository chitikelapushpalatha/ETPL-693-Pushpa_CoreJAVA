package com.evergent.corejava.Strings1;

import java.util.Arrays;

public class StringsDemo8 {

	public static void main(String[] args) {
		String name="JavaTechnologies";
		System.out.println(Arrays.toString(name.toCharArray()));
		System.out.println(name.indexOf('T'));
		System.out.println("JAVA ".strip());
		
	}
}
