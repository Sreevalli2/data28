package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class biggerinArray {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		  String a,b;
		  System.out.println("Enter length for array");
		  int l;
		  b=br.readLine();
		  l=Integer.parseInt(b);
		  System.out.println("Enter "+l+" numbers for array");
	        int[] arr=new int[l];   
	        for(int i=0;i<arr.length;i++)
	           {
	        	a=br.readLine();
	            arr[i]=Integer.parseInt(a);
	            }
	            System.out.print("\nThe Array is : ");
	            for(int i=0;i<arr.length;i++)
	            System.out.print(arr[i]+" ");
	            int largest=arr[0];
	            for(int i=1;i<arr.length;i++)
	            	{if(largest<arr[i])
	            		largest=arr[i];  
	            	}
	            		System.out.println("\nthe bigger is: "+largest);
	}

}
