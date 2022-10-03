package org.Test.Second;
import java.util.*;

class RegularMember {
	int membershipFee=0;
	int enrollmentFee=0;
	int goldServices=20000;
	int months;

	public RegularMember(int months) {
		super();
		this.months=months;
	}

	public double CalculateBill() {
		int charges = this.months*this.goldServices+this.membershipFee+this.enrollmentFee;
		return charges;
	}

}


class GoldMember extends RegularMember{

	int membershipFee=90000;
	int enrollmentFee=10000; 
	int goldServices=10000;

	public GoldMember(int months) {
		super(months);
	}

	@Override
	public double CalculateBill() {
		int charges = 0;
		if(months<=6) {
			charges = this.membershipFee+this.enrollmentFee;

		}

		if(months>6)
		{    
			charges= this.membershipFee+this.enrollmentFee+((this.months-6)*this.goldServices);
		}
		return charges;
	}

}


class SilverMember extends RegularMember{


	int membershipFee=15000;
	int enrollmentFee=5000;
	int goldServices=20000;


	public SilverMember(int months) {
		super(months);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double CalculateBill() {
		int charges =0;
		if(months<=6) {
			charges=+this.membershipFee+this.enrollmentFee;
		}


		if(months>6)
		{
			charges=this.membershipFee+this.enrollmentFee+((this.months-6)*this.goldServices);
		}
		return charges;
	}  

}

public class BillAmount {

	public static void main(String[] args) {
		System.out.println("Enroll your self");
		Scanner sc = new Scanner(System.in);

		System.out.println("Choose 1 for regular or 2 for gold or 3 for silver: ");
		int membership=sc.nextInt();
		System.out.println("Enter the number of months : ");
		int months=sc.nextInt();

		RegularMember r ;
		double amt=0;
		switch (membership) {

		case 1:
			r= new RegularMember(months);
			amt = r.CalculateBill();
			System.out.println("Total Amount: "+amt);
			break;

		case 2:
			r = new GoldMember(months);
			amt = r.CalculateBill();
			System.out.println("Total Amount: "+amt);
			break;

		case 3:
			r = new SilverMember(months);
			amt = r.CalculateBill();
			System.out.println("Total Amount: "+amt);
			break;

		default:
			System.out.println("Enter the valid input");
			break;
		}

		sc.close();   
	}

}