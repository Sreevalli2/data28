package day4;

import java.util.Scanner;

public class frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a String");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		char a;
		scan.close();
		s.toLowerCase();
		int l = s.length();
		String s1 = ""+ "&%";
		s = s.concat(s1);
		System.out.println(s + " " + s.length());
		char[] Ch = s.toCharArray();
		System.out.println(Ch + " " + Ch.length);
		for (int i = 0; i < Ch.length; i++) {
			if (Ch[i] == Ch[i + 1]) {
				a = Ch[i];
				freq(a, s);
			}
		}
	}

	private static void freq(char a, String s) {
		// TODO Auto-generated method stub
		String s1 = s;
		int lenght = s1.length();
		char ch2 = a;
		String s2 = s1 + a;
		int rlenght = s2.length();
		int count = rlenght - lenght;
		System.out.println(
				"the repeated letter: " + ch2 + "\nthe letter'" + ch2 + "'repeated by:  " + (count + 1) + " times\n");
	}
}
