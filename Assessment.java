package com.deloitte;
import java.util.Scanner;
public class Assessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int sum=0;
    int r;
 
 
    while(num>0)
    {   
   r=num%10;
   if(r%2!=0) {
   sum=sum+r;
   }
   num=num/10; 
    } 
    
    
    System.out.println(sum);
	}

}
