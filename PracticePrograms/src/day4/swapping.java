package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swapping {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("enter 2 numbers");
		int temp=0;
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		System.out.println("The numbers:"+a+" "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping the numbers:"+a+" "+b);

	}

}
