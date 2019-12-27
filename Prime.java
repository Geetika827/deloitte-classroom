package arrays;
import java.util.Scanner;
public class Prime {
	public boolean isPrime(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Prime p=new Prime();
		Scanner in=new Scanner(System.in);
		int sum=0;
        int lower,upper;
        System.out.println("Enter the range ");
	    lower=in.nextInt();
	    upper=in.nextInt();
	   
	    	if(lower<3 || upper>999)
	    	{
	    		System.out.println("Invalid range");
	    	}
	    	else {
	    		  for(int i=lower;i<=upper;i++)
	    		    {
	    			  if(p.isPrime(i))
	    		    	sum+=i;
	    		    
	    		    }
	    	}
	    	System.out.println("Sum= "+sum);
	    }
	    
	}


