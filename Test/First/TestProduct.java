package org.Test.First;

import java.io.*;
import java.util.*;

public class TestProduct {

	public static void main(String[] args) throws Exception{

		ProductLoader.loadProduct();
		Scanner sc=new Scanner(System.in);
		ArrayList<Product> arr = new ArrayList<>();
		arr=ProductLoader.getProductList();
		System.out.println(arr);
		System.out.println("Enter the product id to be searched");
		String search=sc.next();
		if(ProductLoader.searchProduct(search) != null)
			System.out.println(ProductLoader.searchProduct(search));
		else {
			System.out.println("ProductId does not exist, give the following details to insert: ");
			System.out.println("Enter the product name : ");
			String productName=sc.next();
			System.out.println("Enter price : ");
			int price=sc.nextInt();
			System.out.println("Enter quantity : ");
			int quantity=sc.nextInt();
			Product p = new Product(search, productName,price,quantity);
			arr.add(p);
			System.out.println(arr);
			FileWriter writer = null;
			try {
				writer = new FileWriter("product.txt"); 
				for(Product str: arr) {
					writer.write(str + System.lineSeparator());
				}
				writer.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Size of ArrayList: "+arr.size());
		}
		sc.close();
	}
}
