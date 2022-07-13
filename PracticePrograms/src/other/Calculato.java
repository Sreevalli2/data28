package other;
/*
 * in a Calculator class include a method add with following syntax
 * public String add(double a,double b)
 * return the O/p with two decimal points Like--> addition of 3.1434+2.4321=5.57
 */	
/*
 * public Calculato(){ super(); this.a=a; this.b=b; }
 */
public class Calculato{
	
	public static void main(String[] args) {
		double a=3.1434,b=2.4321;
		System.out.println(add(a,b));	
		}
	 public static  String add(double a,double b) {
			double sum=a+b;
			Math.round(sum);
			 return  a +" + "+ b +" = "+ sum;		 
		 }
	}


