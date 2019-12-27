package pattern;
import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.println("Enter a number:");
    n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
    	for(int j=1;j<=i;j++)
    	{
    		System.out.print((i+j+1)&1);
    	}
    	System.out.println();
    }
	}

}
