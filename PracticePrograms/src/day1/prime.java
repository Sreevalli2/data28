package day1;
import java.io.*;  
public class prime {

	public static void main(String[] args)throws IOException  {
		// TODO Auto-generated method stub
		
		InputStreamReader read=new InputStreamReader(System.in);  
	    BufferedReader in=new BufferedReader(read);//creating a constructor of the BufferedReader class   
		
	    System.out.println("Enter the number");
		int x=Integer.parseInt(in.readLine());//((BufferedReader.(InputStreamReader(System.in))).readLine())
		
		int m=0,i,flag=0;
		m=x/2;   
		System.out.println(x+"   "+m);
		  if(x==0||x==1){
		   System.out.println(x+" is not prime number");    
		  }else{
		   for(i=2;i<=m;i++){    
		    if(x%i==0){    
		     System.out.println(x+" is not prime number");    
		     flag=1;    
		     break;    
		    }    
		   }    
		   if(flag==0)  { System.out.println(x+" is prime number"); }
		  }//end of else
		}

}
