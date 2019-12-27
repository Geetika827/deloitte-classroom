package arrays;
import java.util.Scanner;
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner in=new Scanner(System.in);
     int n;
//     System.out.println("Enter the size of the array: ");
//     n=in.nextInt();
     int []nums= {5,6,7,55,9}; 
     int max=nums[0];
     int min=nums[0];
//     for(int i=0;i<nums.length;i++)
//     {
//    	 System.out.println(nums[i]+"\t");
//     }
     for(int i:nums)
     {
    	 if(i>max)
    	 {
    		 max=i;
    	 }
    	 if(i<min)
    	 {
    		 min=i;
    	 }
    	 
     }
     System.out.println("largest is "+max);
     System.out.println("Smallest is "+min);
     
	}

}
