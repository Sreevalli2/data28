package other;

public class stringnext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * in a given String, check if a particular word is coming after a given word.
		 * ex. RamDevAnand check if Anand is coming after Ram
		 */
		String s = "RamDevAnand";
		String sub = s.substring(3);
		String check = "Anand";
		if (sub == check)
			System.out.println("anand is comes right after ram");
		else
			System.out.println("anand is not right after ram");
		String s1 = "RamDevAnand";
		int pos1 = s1.indexOf('R');
		int pos2 = s1.indexOf('A');
		if(pos1 + 3 == pos2)
		System.out.println("Anand is present after ram"+pos1);
		else
			System.out.println("Not Present"+pos2);
		
	}
	

}
