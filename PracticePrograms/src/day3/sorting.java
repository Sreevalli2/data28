package day3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//implementation of HashMap  
		HashMap<Integer, String> hm=new HashMap<Integer, String>();  
		//addding keys and values to HashMap  
		hm.put(23, "Yash");  
		hm.put(17, "Arun");  
		hm.put(15, "Swarit");  
		hm.put(9, "Neelesh"); 
		System.out.println(hm);
		
		System.out.println("\nBefore Sorting\n"); 
		Iterator <Integer> it = hm.keySet().iterator();   
		while(it.hasNext())  
		{ 
			int key=(int)it.next(); 
			System.out.println("Key:"+key+"\t\tValue: "+hm.get(key)); 
		}
	  	 
		System.out.println("\nAfter Sorting the hash map with key\n");  
		Map<Integer, String> map=new HashMap<Integer, String>(); 
		//using TreeMap constructor to sort the HashMap  
		TreeMap<Integer,String> tm=new  TreeMap<Integer,String> (hm);  
		Iterator itr=tm.keySet().iterator();               
		while(itr.hasNext())    
		{
			int key=(int)itr.next();  
			System.out.println("Key:"+key+"\t\t"+"Value: "+hm.get(key));  
		}    
	}
}
