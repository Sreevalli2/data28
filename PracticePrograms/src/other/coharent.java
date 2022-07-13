package other;
//called a covareient return type, not for primitive type
//public protected default private
class A{
	public String toString() {
		return "sreevalli";
		
	}
}
class B extends A{}//B is a type of A
class C extends B{}//c is a type of A
class parent{
	A dispaly() {//A type ,returns A type of object
		System.out.println("dispaly of parent");
		return new A();
	}
}
class child extends parent{
	@Override
	public B dispaly(){
		System.out.println("display of childt");
		return new B();
	}
}

public class coharent {

	public static void main(String[] args) {
		child ch=new child();
		ch.dispaly();
		parent p=new parent();
		p.dispaly();
		A a=new A();
		a.toString();
		
	}

}

