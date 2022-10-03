package org.Test.Third;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class ToothpasteBrand {
	public static void main(String[] args) 
	{
		// ToothpasteType ob;    	
		Scanner sc = new Scanner(System.in);

		Map<Integer,ToothpasteType> mapValue = new HashMap<Integer,ToothpasteType>();

		System.out.println("Enter the Number of members: ");
		int num = sc.nextInt();

		for(int i=1; i<=num; i++) 
		{
			mapValue.put(i, new ToothpasteType());
		}	        

		for(Map.Entry<Integer, ToothpasteType> entry:mapValue.entrySet()){    
			int key=entry.getKey();  
			ToothpasteType b=entry.getValue();  
			System.out.println(key+" Data:");  
			System.out.println("Name: " + b.name + "\nAge: " + b.age +"\nMember Type: " + b.memberType+"\nToothpaste Type: " + b.toothpasteTypes);    
		} 

		System.out.println(ToothpasteType.countPastes());
		sc.close();
	}
}
