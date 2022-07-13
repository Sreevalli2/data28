package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prime2 {

	public static void main(String args[])  throws NumberFormatException, IOException{
		// TODO Auto-generated method stub

			InputStreamReader read=new InputStreamReader(System.in);  
		    BufferedReader in=new BufferedReader(read);
		    System.out.println("Enter the number");
			int x=Integer.parseInt(in.readLine());
          int flag=0,m;
          m=x/2;
          if((x==0)||(x==1))
        	  System.out.println("not prime");
          else 
        	  {
        	  for(int i=2;i<m;i++)
        	  
        	  { if((x%i==0)) 
        			  {
        		  System.out.println("not prime");
        		  flag=1;    
     		     break; 
        			  }		  	  
        	  }
        		  if(flag==0)
        			  System.out.println("prime");
        	  }
        	  
	}

}
