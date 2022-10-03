package org.Test.Third;

import java.util.Scanner;

public class ToothpasteType {
	int age;
	String name;
	int toothpasteType;
	String toothpasteTypes,memberType;
	static int countColgate,countPepso,countDabur,countPatanjali;
	 static int maximum;
	 static String max;

	Scanner sc = new Scanner(System.in);

	public ToothpasteType() {
		System.out.println("Enter your age: ");
		age = sc.nextInt();
		System.out.println("Enter your name: ");
		name = sc.next();
		System.out.println("Enter member type (Men, Women or Child): ");
		memberType = sc.next();

		System.out.println("Type 1 for colgate or 2 for pepsodent or 3 for patanjali or 4 for dabur red: "); 
		this.toothpasteType=sc.nextInt();
		switch(toothpasteType) {
		case 1:{
			this.toothpasteTypes="Colgate";
			countColgate++;
			break;
		}
		case 2:{
			this.toothpasteTypes="Pepsodent";
			countPepso++;
			break;
		}
		case 3:{
			this.toothpasteTypes="Patanjali";
			countPatanjali++;
			break;
		}
		case 4:{
			this.toothpasteTypes="Dabour Red";
			countDabur++;
			break;
		}
		default:{
			System.out.println("Enter correct input");
			break;
		}
		}
		 maximum = Math.max(Math.max(countColgate,countPepso),Math.max(countPatanjali,countDabur));
	}

	public static String countPastes() {

		System.out.println("Number of Colgate: "+countColgate+"\nNumber of Pepsodent: "+countPepso+"\nNumber of Patanjali: "+countPatanjali+"\nNumber of Dabur Red: "+countDabur);
		if(maximum==countColgate) {
			max="Colgate";
			System.out.println("Maximum: "+ max);
		}
		if(maximum==countPepso) {
			max="Pepsodent";
			System.out.println("Maximum: "+ max);
		}
		if(maximum==countPatanjali) {
			max="Patanjali";
			System.out.println("Maximum: "+ max);
		}
		if(maximum==countDabur) {
			max="Dabur Red";
			System.out.println("Maximum: "+ max);
		}
		return " ";
	}   

}
