package other;
class mammal {
	public void walk() {
		System.out.println(" mammal walk");
	}
	public void eatMeat() {
		System.out.println("Eats meat mammal");
	}
}
interface animal {
	public static void walk() {
		System.out.println("animal walk called");
	}
}
interface Carnivore {
	public default void eatMeat() {
		System.out.println("carnivore eat meat called");
	}
	void walk();
}
class dog extends mammal implements animal, Carnivore {
	int credit = 10;
	int debit = 15;
	@Override
	public void walk() {
		System.out.println("dog mammal");
	}
	@Override
	public void eatMeat() {
		System.out.println("Eats meat Carnivore");
	}
	public String toString() {
		return "credit:" + credit + ",debit:" + debit;
	}
	public String stringss() {
		return String.format("credit:%d, Debit %d", credit, debit);
	}
}
public class interfacing {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mammal m = new mammal();
		m.eatMeat();
		mammal n = new dog();
		n.eatMeat();
		n.walk();
		dog d = new dog();
		d.walk();
		d.eatMeat();
		System.out.println(d.toString());
		System.out.println(d.stringss());
	}
}
