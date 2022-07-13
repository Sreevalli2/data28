package other;

public class inheritanc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parented a1=new parented();
		a1.me1();
		System.out.println(a1.toString());
		parented a=new childing();
		a.me1();
		childing b=new childing();
		b.me1();
	}
}
class parented{
	int credit=10;
	int debit=15;
	public parented() {
		int a=10;
		System.out.println(a);
	}	
	public void me1() {
		// TODO Auto-generated method stub
		System.out.println("neww");		
	}
	public String toString() {
		return "credited:"+ credit +" debited:"+debit;
	}	
}
class childing extends parented{
	@Override
	public void me1() {
		System.out.println("Hello");
	}
}



