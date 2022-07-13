package other;

public class impinterface {
	private int value;

	public impinterface(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public void execute() {
		System.out.println("executing payment of " + value);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		impinterface i = new impinterface(15);
		i.execute();
		i.setValue(20);	
		i.execute();
		System.out.println(i.getClass());
		}

}
