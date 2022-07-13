package day1;

import java.util.Scanner;

public class stringpalindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=s.nextLine();
		System.out.println("the given string is: "+str);
		String rev="";
		int l=str.length();
        for(int i = l- 1; i >= 0; i--)
        {		
            rev=rev+str.charAt(i);
         }
	      if (str.equals(rev))
	      { str=str.toUpperCase();
	         System.out.println(str+" is a palindrome");
	}
	      else {
	    	  str=str.toUpperCase();
	         System.out.println("'"+str+"'"+" is not a palindrome");
	      }
	}
}
