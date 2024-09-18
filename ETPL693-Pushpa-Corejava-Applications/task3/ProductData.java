package com.evergent.corejava.collections.pushpa.task3;
	import java.util.ArrayList;
	import java.util.HashSet;
	import java.util.Iterator;
	import java.util.List;
	import java.util.ListIterator;
	import java.util.Scanner;
	import java.util.Set;
	 
	public class ProductData {
		public static void main(String[] args) {
			List<Product> list=new ArrayList<Product>();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Product details");
			for(int i=0;i<3;i++){
				Product obj=new Product();
				System.out.println("Enter the Product Id");
				obj.setProductId(sc.nextInt());
				System.out.println("Enter the Product name");
				obj.setProductName(sc.next());
				System.out.println("Enter the Product price");
				obj.setProductPrice(sc.nextDouble());
				list.add(obj); 		}		 
		
			Iterator<Product> obj=list.iterator();
			while(obj.hasNext()){
				System.out.println("Iterator order");
				Product ob=obj.next();
				System.out.println(ob.getProductId()+ " "+ ob.getProductName()+ " "+ob.getProductPrice());
			} 	
		}

	}
