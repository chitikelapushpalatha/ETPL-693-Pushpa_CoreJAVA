package com.evergent.corejava.arrays;

public class ArraysDemo8 {

	public static void main(String[] args) {
		
		int arr[][] =new int[5][5];
		for(int i=0;i<arr.length;i++) {
			System.out.println(" ");

			for(int j=0;j<arr.length;j++) {
				if(i==0 || j==0 || i==4 || j==4 )
				{
					arr[i][j]=7;
				}
				System.out.print(arr[i][j]);
			}
		}
	}
}