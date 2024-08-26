package com.evergent.corejava.exceptionhandling;
import java.io.*;
import java.util.Scanner;
public class CompileTimeFileDemo15 {

	public static void main(String[] args) {
		try
		{
			File file=new File("C:/mydata1/myinfo1/hello.txt");
			Scanner scanner =new Scanner(file);
			while(scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
			scanner.close();
			
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

	
	}

