package day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(211);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		System.out.print("the list: "+list1+"\n");
		 System.out.println("the 1st  list :");
		for(int a:list1)  
			  System.out.print(a+"\t");
		  System.out.println("\nthe 2nd list :");
		List<Integer> list2=new ArrayList<Integer>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(40);
		for(int b:list2)
			System.out.print(b+"\t");
		String[] array={"Java","Python","PHP","C++"};  
		List<String> list=new ArrayList<String>();  
		for(String lang:array){  
		list.add(lang);  
		}  
		System.out.println("\nPrinting List: "+list);  
		System.out.println("\nthe sorted list1 is:");
		  Collections.sort(list1);  
		  for(int a:list1)  
			  System.out.print(a+"\t");
		 List<Integer> newList = new ArrayList<Integer>();
		 newList.addAll(list1);
		 newList.addAll(list2);
		  System.out.print(newList);
		
	}

}

