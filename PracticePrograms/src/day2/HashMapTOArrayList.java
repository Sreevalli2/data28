package day2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapTOArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    HashMap<String, Integer> map= new HashMap<>();
	    map.put("sr", 1);
	    map.put("see", 2);
	    map.put("sre", 3);
	    map.put("sree", 4);
	 // Finding the Set of keys from
        // the HashMap
        Set<String> keySet = map.keySet();
        ArrayList<String> list= new ArrayList<String>(keySet);
        Collection<Integer> values = map.values();
        ArrayList<Integer> list1=new ArrayList<Integer>(values);

        System.out.println("The Keys of the Map are "
                           + list+"\nThe Values of the Map are"+list1);
    

	}

}
