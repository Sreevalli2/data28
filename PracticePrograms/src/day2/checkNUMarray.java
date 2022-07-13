package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class checkNUMarray {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        System.out.println("Enter numbers for array");
        int[] arr=new int[5];
        String a;
        int n,flag=0,k=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<arr.length;i++)
        	{a=br.readLine();
        arr[i]=Integer.parseInt(a);}
        System.out.print("The Array is :");
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
        System.out.println("\nEnter a Number:");
        String s1=br.readLine();
       n=Integer.parseInt(s1);
        for(int i=0;i<arr.length;i++)
        	
        	if(arr[i]==n)
             {
        	  flag=1;
        	  k=i;
        		}
        if(flag==1)
        	System.out.println("The number: "+n+" is present at: "+(k+1)+" place");
        else
        	System.out.println("the number is not there");
        		}
	
}


