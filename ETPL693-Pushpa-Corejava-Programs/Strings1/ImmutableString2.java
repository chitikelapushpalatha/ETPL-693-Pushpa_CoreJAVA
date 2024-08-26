package com.evergent.corejava.Strings1;
//Overriding toString method and returning the value in immutable string
public class ImmutableString2 {
	private String value;
	public ImmutableString2(String value)
	{
		this.value=value;
	}
	public String toString() {
		return value;
	}
}

	