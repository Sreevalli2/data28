package day3;

public class vowelconsonents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hi Sreevalli";
		int v=0,c=0,k=0;
		s.toLowerCase();
		  char Ch[]=s.toCharArray();
		  for(int i=0;i<s.length();i++)
		  {	  System.out.print(Ch[i]+" ");
		
			  if(Ch[i]=='a' ||Ch[i]=='e' || Ch[i]=='i' ||Ch[i]=='o' || Ch[i]=='u')
                   v++;
		     else
			   if(Ch[i]==' ')
				  k++;
			    else
			      c++;
			  }
		  System.out.println("\nThe vowels:"+v+"\nThe consonents:"+c+"\nThe spaces:"+k);	
}
}
