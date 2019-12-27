package ifelse;
import java.util.Scanner;
public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a,b,c;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter 3 no's");
     a=sc.nextInt();
     b=sc.nextInt();
     c=sc.nextInt();
     int largest=(a>b?a:b);
     largest=c>largest?c:largest;
     System.out.println("Largest="+largest);
	}

}

