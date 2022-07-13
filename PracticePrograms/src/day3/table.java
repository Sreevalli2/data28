package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class table {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
	
		InputStreamReader read=new InputStreamReader(System.in);  
	    BufferedReader in=new BufferedReader(read);
		
	    System.out.println("Enter the number for the table");
		int x=Integer.parseInt(in.readLine());
		
	    System.out.println("Enter the range for the table");
		int y=Integer.parseInt(in.readLine());
	    System.out.println("the table");
		int s=0;

		for(int i=1;i<=y;i++)
			{
			s=x*i;
			System.out.println(x+"*"+i+"="+s);
			}

	}

}
