package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pyramid {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter a no.of rows for the piramid");
		InputStreamReader read=new InputStreamReader(System.in);  
	    BufferedReader in=new BufferedReader(read);
		int x=Integer.parseInt(in.readLine());
		 for (int i = 0; i < x; i++) {
	            for (int j = 0; j < x - i; j++) {
	                System.out.print(" ");
	            }
	            for (int k = 0; k <= i; k++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }

	}

}
