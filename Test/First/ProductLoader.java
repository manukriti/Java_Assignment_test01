package org.Test.First;
import java.io.*;
import java.util.*;

public class ProductLoader {
	private static ArrayList<Product> ar = new ArrayList<>();

	public static void loadProduct() throws Exception {

		BufferedReader br = new BufferedReader(new FileReader(new File("product.txt")));
		String products;
		while((products=br.readLine())!=null)
		{
			String arr[] = products.split(",");
			Product p = new Product(arr[0],arr[1],Integer.parseInt(arr[2]),Integer.parseInt(arr[3]));
			ar.add(p);
		}
		br.close();
	}
	public static ArrayList<Product> getProductList(){

		return ar;
	}

	public static Product searchProduct(String productId)
	{
		ArrayList <Product> temp = getProductList();
		for(Product p : temp)
		{
			if(p.productId.equals(productId) )
			{
				return p;
			}
		}
		return null;
	}
}
