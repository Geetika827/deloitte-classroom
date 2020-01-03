import java.util.*;
import java.util.stream.Collectors;
public class Map {

	public static void main(String[] args) {
//		List<Integer> years=Arrays.asList(2012,1999,2000,2020,1900,2013);
//		years.stream().filter(s->(s%4==0 && s%100!=0)|| s%400==0).forEach(s->System.out.println(s));
	
		
    HashMap<String,String> trainees= new HashMap<>();
	trainees.put("Hasir","Jamshedpur");
	trainees.put("Geetika","Rohtak");
	trainees.put("Rohan","Jamshedpur");
//	System.out.println("Enter a name: ");
//	String name=new Scanner(System.in).nextLine();
//	System.out.println("location= "+trainees.get(name));
	
	for(String key:trainees.keySet())
	{
		System.out.println("Name : "+key+"\tLocation : "+trainees.get(key));
	}
	}

}
