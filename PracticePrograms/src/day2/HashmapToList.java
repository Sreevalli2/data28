package day2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
public class HashmapToList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<String, Integer> map= new HashMap<>();
		    map.put("a",1);
		    map.put("b",2);
		    map.put("z",3);
		    map.put("d",4);
		    System.out.println("The HashMap are: "+map);
	       
		    Set<String> keySet = map.keySet();
	        List<String> list= new ArrayList<String>(keySet);
	        System.out.println("The Keys of the Map are " + list);
	        
	        Collection<Integer> values = map.values();
	        List<Integer> list1=new ArrayList<Integer>(values);
	        System.out.println("\nThe Values of the Map are"+list1);
	        
	        
	        List<String> keyList = Collections.list(Collections.enumeration(map.keySet()));
	        System.out.println("\nThe Keys of the Map are " + keyList);
	        
	        List<Integer> valueList = Collections.list(Collections.enumeration(map.values()));
	        System.out.println("\nThe Values of the Map are"+ valueList);
	}

}
