package com.evergent.corejava.collections.map;
import java.util.Map;
import java.util.TreeMap;

public class TreemapDemo4 {
	/*Sortedorder:TreeMap maintains its elements in ascending order of keys.
	 * In this example,Student IDS are sorted,so when we print the TreeMap,IDS are
	 * in ascendingorder
	 */

	public static void main(String[] args) {
		//Creating a TreeMap to store student records
		TreeMap<Integer,String>StudentsRecords=new TreeMap<>();
		//Adding student records to the TreeMap
		StudentsRecords.put(102, "Raju");
		StudentsRecords.put(101, "Bhaul");
		StudentsRecords.put(103, "Ramu");
		StudentsRecords.put(104, "David");
		System.out.println(StudentsRecords);
		//Displaying the TreeMap(sorted by studentID)
		System.out.println("student Records(sorted by ID):");
		for( Map.Entry<Integer,String> entry:StudentsRecords.entrySet()){
			System.out.println("ID:"+entry.getKey()+"Name:"+entry.getValue());
	}
}
}
		
