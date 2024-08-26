package com.evergent.corejava.arrays;

public class ArraysDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] =new int[5][5];
		for(int i=1;i<arr.length;i++) {
			System.out.println(" ");

			for(int j=1;j<arr.length;j++) {
				if(arr[i]==arr[j])
				{
					arr[i][j]=7;
				}
				System.out.print(arr[i][j]);
			}
		}
	}
	}
