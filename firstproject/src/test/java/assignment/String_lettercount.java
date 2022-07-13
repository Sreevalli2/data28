package assignment;

public class String_lettercount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcedefghalkdsnacn21e12ed";
		char c[] = s.toCharArray();
		for(char m:c)
		System.out.print(m+" ");
		System.out.println();
		int count = 0, len = 0;
		do {
			try {
				char ch[] = s.toCharArray();				
				len = ch.length;
				count = 0;
				for (int j = 0; j < len; j++) {
					if ((ch[0] == ch[j]) && ((ch[0] >= 65 && ch[0] <= 91) || (ch[0] >= 97 && ch[0] <= 123)))
						count++;					
				}
				if (count != 0)
					System.out.println(ch[0] + " " + count + " Times");
				s = s.replace("" + ch[0], "");
			} catch (Exception ex) {
			}
		} while (len != 1);
	}
}