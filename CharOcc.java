import java.util.*;
public class CharOcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashMap <Character,Integer> charOcc= new HashMap<>();
    String str= "Rahul Shetty";
    for(char c:str.toCharArray())
    {
    	if(charOcc.containsKey(c))
    	{
    		int oc=charOcc.get(c)+1;
    		charOcc.put(c, oc);
    		
    	}
    	else
    	{
    		charOcc.put(c, 1);
    	}
    }
    charOcc.forEach((c,oc)->System.out.println(c+"  ->"+oc));
	}

}
