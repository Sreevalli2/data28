package day4;
import java.util.Scanner;
public class recursion {
	public static void main(String[] args) {
		//TODO Auto-generated method stub
	   //Java Program to Reverse a Sentence Using Recursion
		System.out.print("Enter a string ::");
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
		System.out.println("the String is: "+str);
		System.out.println("the reverse string is: "+rev(str));
		System.out.println("sreevalli");
		sc.close();
	}
	static String rev(String str) {
		String newString="";
		char[] ch=str.toCharArray();	
		for(var i=str.length()-1;i>=0;i--)
			newString=newString+ ch[i];
		return newString;
	}

}
