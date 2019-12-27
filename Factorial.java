package loops;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner in=new Scanner(System.in);	
     int n,f=1;
     System.out.println("Enter a no");
     n=in.nextInt();
     while(n>0)
     {
    	 f*=n;
    	 n--;
     }
     System.out.println("Factorial="+f);
	}

}
