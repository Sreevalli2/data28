package day2;


import java.util.ArrayList;
import java.util.List;

public class joiningList {

 public static void main(String[] args)
 {
     // given list 1
     List<Integer> list1 = new ArrayList<Integer>();
     list1.add(1);
     list1.add(2);
     list1.add(3);
     list1.add(4);
     System.out.println("list1: " + list1);
     // given list 2
     List<Integer> list2 = new ArrayList<Integer>();
     list2.add(5);
     list2.add(6);
     list2.add(7);
     list2.add(8);
     System.out.println("list2: " + list2);
     // creating new empty list
    
     List<Integer> list= new ArrayList<Integer>();
     // using addAll( ) method to concatenate the lists
     list.addAll(list1);
     list.addAll(list2);
     System.out.println("Concatenated list: "+ list);
 }
}