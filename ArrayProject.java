import java.util.*;
public class ArrayProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String []arr= {"albert.einstein@gmail.com","leonardo_da_vinci@hotmail.com","jagadish_chandra_bose@yahoo.com",
    	"alan_turing@yahoo.com","srinivasaramanujan@gmail.com","bjarne_stroustrup@yahoo.com",
    	"richard.stallman@inbox.com","cv_raman@yahoo.com","jamesgosling@shortmail.com"};
    ArrayList myArrayList=new ArrayList();
    ArrayList myArrayList1=new ArrayList();
    ArrayList myArrayList2=new ArrayList();
    ArrayList myArrayList3=new ArrayList();
    
    
    
    for(int i=0;i<arr.length;i++)
    {
    	if(arr[i].contains("gmail.com"))
    	{
    	myArrayList.add(arr[i]);	
    	}
    	else if(arr[i].contains("yahoo.com"))
    	{
    	myArrayList1.add(arr[i]);	
    	}
    	else if(arr[i].contains("hotmail.com"))
    	{
    		myArrayList2.add(arr[i]);		
    	}
    	else
    	{
    		myArrayList3.add(arr[i]);		
    	}
    }
    System.out.println(myArrayList);
    System.out.println(myArrayList1);
	System.out.println(myArrayList2);
    System.out.println(myArrayList3);}

}
