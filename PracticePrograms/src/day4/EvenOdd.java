package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOdd {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("enter a number");
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		int a=Integer.parseInt(br.readLine());
		int b=a;
		if(a==0)
			System.out.println("U entered '0'");
		else
		if(a%2==0)
			{System.out.print("U entered EVEN ");
			if(b>0)
				System.out.print("positive Number");
			else
				System.out.print("negative Number");
			
				}
		else
			{System.out.print("U entered ODD ");
		if(b>0)
			System.out.print("positive Number");
		else
			System.out.print("negative Number");}
		
	}

}
