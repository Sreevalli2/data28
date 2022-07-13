package day2;

public class charString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="sree";
    	  char Char[]=s.toCharArray();
    	  for(int i=0;i<s.length();i++)
          {
            System.out.print(Char[i]+" ");
	      }
    	   System.out.println();
    	   char[] ch= {'a','i','s','h','u'};
           String s1=null;
           s1=new String(ch);
           System.out.println(s1);
}
}

