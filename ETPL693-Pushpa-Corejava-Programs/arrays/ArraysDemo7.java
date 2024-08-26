package com.evergent.corejava.arrays;

public class ArraysDemo7 {

	public static void main(String[] args) {
		int arr[][] =new int[5][5];
		for(int i=1;i<arr.length;i++) {
			System.out.println(" ");

			for(int j=1;j<arr.length;j++) {
				if(arr[i]==arr[j] || i+j==4)
				{
					arr[i][j]=7;
				}
				System.out.print(arr[i][j]);
			}
		}
	}
}