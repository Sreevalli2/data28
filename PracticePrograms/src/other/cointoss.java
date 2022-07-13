package other;

import java.util.Scanner;

public class cointoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number '0' for Head; '1' for Tail");
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
			if (x==0)
			System.out.println("Heads");
			else
			System.out.println("Tails");
			scan.close();
	}
			
	

}
