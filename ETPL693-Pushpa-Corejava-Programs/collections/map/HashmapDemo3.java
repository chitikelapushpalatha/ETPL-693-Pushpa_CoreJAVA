package com.evergent.corejava.collections.map;

import java.util.HashMap;

public class HashmapDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String>CapitalCities=new HashMap<String,String>();
		CapitalCities.put("India","Delhi");
		CapitalCities.put("USA","Washington Dc");
		CapitalCities.put("Germany","Berlin");
		CapitalCities.put("India","Delhi");
		System.out.println(	CapitalCities);
		for(String i:CapitalCities.keySet()) {
			System.out.println(i);
		}
		

	}

}
