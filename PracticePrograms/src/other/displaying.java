package other;
class qwerty{
	void first() {
		System.out.println("first method");
	}void second(){
		System.out.println("second method");
	}
	void third() {
		System.out.println("third method");
	}
}
class asdfg extends qwerty{
	int x=40;
	void first() {
		System.out.println("first methods");
	}
	void second(int x){
		System.out.println("second methods"+this.x);
	}
	void second1(int x){
		System.out.println("second method"+x);
	}
	@Override
	void third() {
		System.out.println("third methodedede");
	}
}
public class displaying {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		qwerty q=new qwerty();
		q.first();
		q.second();
		q.third();
		qwerty p=new asdfg();
		p.first();
		p.third();
		asdfg z=new asdfg();
		z.second(10);
		z.second1(25);
		z.third();
	}

}
