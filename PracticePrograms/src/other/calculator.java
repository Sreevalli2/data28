package other;

//import java.time.LocalDate;
import java.util.Scanner;

public class calculator {
 static double z ;

	public static void main(String[] args) {
		System.out.println("Enter calcualtion method");
		Scanner s=new Scanner(System.in);
		String op=s.nextLine();
		char[] k=op.toCharArray();
		System.out.println("Enter two numbers");
		double a=s.nextDouble();
		double b=s.nextDouble();

		char opt=k[0];
		if(opt=='w')
			handleWhen(a,b);
		else {
		symbolFromOpCode(opt);
		System.out.println(a+","+b+","+op+","+opt+","+symbolFromOpCode(opt));
		double c=calc(a,b,symbolFromOpCode(opt));
		display(opt,a,b,c);
		}
		s.close();

	}
	private static void handleWhen(double a, double b) {
		// TODO Auto-generated method stub
		//LocalDate startDate = null;
		System.out.println((a+b));
		
	}
	private static double calc(double x, double y, char symbolFromOpCode) {
		char op=symbolFromOpCode;
		if(op=='+')	
		   z= x+y;
		else
			if(op=='-')
				z= x-y;
			else
				if(op=='*')
					z=x*y;
				else
					if(op=='/')
						if(y!=0)
				z=x/y;
					else
						if(op=='%')
					z=x%y;
		return z;
	}
	private static void display(char opCode,double leftval,double rightval,double result)
	{
		char symbol =symbolFromOpCode(opCode);
		String output=String.format("%.3f %c %.3f = %.3f",leftval,symbol,rightval,result);
	    System.out.println(output);
	}
	private static char symbolFromOpCode(char opt) {
		char[] opcodes= {'a','s','m','d','p'};
		char[] symbols= {'+','-','*','/','%'};
		for(int i=0;i<opcodes.length;i++)
			if(opt==opcodes[i]) {
				return symbols[i];
			}
		return opt;	
	}
}
