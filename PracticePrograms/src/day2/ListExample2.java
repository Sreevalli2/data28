package day2;
import java.util.*;  
public class ListExample2{  
 public static void main(String args[]){  
 //Creating a List  
 List<String> list=new ArrayList<String>();  
 //Adding elements in the List  
 list.add("Mango");  
 list.add("Apple");  
 list.add("Banana");  
 list.add("Grapes");  
 System.out.println("the list of fruits is");
 for(String f:list)
	 System.out.print(f+"\t");
 //accessing the element    
 System.out.println("\nReturning element at 2nd item: "+list.get(1));//it will return the 2nd element, because index starts from 0  
 //changing the element  
 System.out.println("the changed list of fruits is at "+list.get(1)+" with dates is");
 
 list.set(1,"Dates");  
 //Iterating the List element using for-each loop  
 for(String fruit:list)  
  System.out.println(fruit);  
  
 }  
}  