package day4;

import java.util.Scanner;

public class fre {
 
  public static void main(String args[]) 
  {    
	    char a,search; // Character to search is 'a'.
	    int result ;
		System.out.println("Enter a String");
		Scanner scan=new Scanner(System.in);	
		String s=scan.nextLine();	
		System.out.println("enter a letter to search from the "+s);
		search=scan.next().charAt(0);   
		scan.close();
		result = findOccurrences(s,search,0); //start index 0 for start of string.
        System.out.println("The Character '"+search+"' appears "+result+" times.");
  }
  static int findOccurrences(String str, char search, int index)
  { 
	  int count=0;
      if(index >= str.length())
      return 0;       
      if(str.charAt(index) == search)
      count++;   
      return count + findOccurrences(str,search,index+1);
  }   
}


