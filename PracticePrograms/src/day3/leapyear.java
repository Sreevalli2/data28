package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class leapyear {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("enter an year");

		InputStreamReader read=new InputStreamReader(System.in);  
	    BufferedReader in=new BufferedReader(read);
	    int x=Integer.parseInt(in.readLine());
		if((x%4)==0)
			System.out.println(x+" is a leap Year");
			else
				System.out.println(x+" is not a leap year");
		}

	

}
