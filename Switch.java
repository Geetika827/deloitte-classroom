package com.deloitte;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner in=new Scanner(System.in);
    float inr,usd;
    int choice;
    
    System.out.println("Enter your choice->");
    choice=in.nextInt();
    System.out.println("1 - INR -> USD");
    System.out.println("2 - USD -> INR");
    switch(choice)
    {
    case 1:
    	System.out.println("Enter amount (RS.)");
    	inr=in.nextFloat();
    	usd=inr*(1.0f/71.0f);
    	System.out.println("Rs. "+inr+" = $ "+usd);
    	break;
    case 2:
    	System.out.println("Enter amount (RS.)");
    	usd=in.nextFloat();
    	inr=usd*71.0f;
    	System.out.println("Rs. "+usd+" = $ "+inr);
    	break;
    	default:
    		System.out.println("Invalid choice....");
    }
	}

}
