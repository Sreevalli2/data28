package other;
 class newss{
	int a,b;
	public String toString() {
		
		return "int are"+a+","+b;
	}
}
public class stringss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20,c=30;
		String s="the integers are: "+a+", "+b+", "+c;
		System.out.println(s);
		String s1=String.format("integers are %d, %d, %d", a,b,c);
		System.out.println(s1);
		newss n=new newss();
		n.a=20;
		n.b=30;
		System.out.println(n.toString());
		
		

	}

}
