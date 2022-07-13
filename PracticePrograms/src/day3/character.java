package day3;


import java.io.IOException;

import java.util.Scanner;

public class character {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		//97 to 122 65 to 90
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter any key: ");
	    char c = scan.next().charAt(0);
		if((c>65)&&(c<90))	
			System.out.println("You Entered an alphabet");
		else
			if((c>97)&&(c<122))
			System.out.println("You Entered an alphabet");
			else
				System.out.println("You entered not an alphabet");
		
		
		
	}

}
