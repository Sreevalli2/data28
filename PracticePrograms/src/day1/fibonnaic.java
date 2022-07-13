package day1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fibonnaic {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("the fibonnaic series up to  ");
		
		InputStreamReader read=new InputStreamReader(System.in);  
	    BufferedReader in=new BufferedReader(read);
		int n=Integer.parseInt(in.readLine());
		int f1=0,f2=1,f;
		System.out.println("the fibonnaic series : \n"+f1+"\n"+f2);
		
		for(int i=2;i<n;i++) 
		{
			f=f1+f2;
		    f1=f2;
		    f2=f;
		    System.out.println(f);
		}
	}

}
