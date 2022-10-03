package org.Test.Third;
import java.util.*;

public class CruiseHashMap {
	 public static void main(String[] args) 
	    { 	
	    	Scanner sc = new Scanner(System.in);
	        
	        Map<Integer,MemberType> mapValue = new HashMap<Integer,MemberType>();
	        
	        System.out.println("Enter the Number of Travelers You want On the Cruise");
	        
	        
	        int num = sc.nextInt();
	        
	        for(int i=1; i<=num; i++) 
	        {
	            mapValue.put(i, new MemberType());
	        }
	        
	        
	        for(Map.Entry<Integer, MemberType> entry:mapValue.entrySet()){    
	            int key=entry.getKey();  
	            MemberType b=entry.getValue();  
	            System.out.println(key+" Data:");  
	            System.out.println("Name: " + b.name + "\nAge: " + b.age + "\nMember Type: " + b.memberTypes+"\nFees: "+b.fee);    
	            } 
	        
	       System.out.println(MemberType.countMembers());
	        sc.close();
	    }
}
