import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<String> emails=Arrays.asList("rahul@gmail.com","mahesh@yahoo.com","geetika@gmail.com");
	HashMap<String,List<String>> emailList= new HashMap<>();
    
    for(String email:emails)
    {
    	String domain= email.substring(email.indexOf("@")+1,email.indexOf(".")-1);
    	if(emailList.containsKey(domain))
    	{
    		List <String > em= emailList.get(domain);
    		
    		emailList.get(domain).add(email);
    	}
    	else
    	{
    		emailList.put(domain, Arrays.asList(email));
    	}
    }
    emailList.forEach((d,e)->
    {
    	System.out.println("Domain : "+d);
    	System.out.println("-----------------------");
    	e.forEach((s)->System.out.println(s));
    });
		
	}

}
