package other;

import java.util.Scanner;

public class calcengine {

	static double result;
	static double value;
	static String operation;
	static char symbol;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length == 1 && args[0].equals("interactive"))
			start();

	}

	static void start() {
		System.out.println("Enter operation and 2 integer numbers");
		Scanner scan = new Scanner(System.in);
		String userinput = scan.nextLine();
		String[] parts = userinput.split(" ");
		performOperation(parts);
		scan.close();
	}

	private static void performOperation(String[] parts) {
		char opCode = opCodeFromString(parts[0]);
		double leftVal = valueFromWord(parts[1]);
		double rightVal = valueFromWord(parts[2]);
		double result = execute(opCode, leftVal, rightVal);
		System.out.println("by doing "+operation+" on " +parts[1]+ " and "+parts[2]+" is:"+result);
		System.out.println(parts[1]+" "+symbol+" "+parts[2]+" = "+result);
		//String output=String.format("%.3f %c %.3f = %.3f", parts[1],symbol,parts[2],result);
		
		//System.out.println(output);

	}

	private static double execute(char opCode, double leftVal, double rightVal) {
		// TODO Auto-generated method stub
		switch (opCode) {
		case 'a':
			operation="addition";
			symbol='+';
			result = leftVal + rightVal;
			break;
		case 's':
			operation="subtraction";
			symbol='-';
			result = leftVal - rightVal;
			break;
		case 'm':
			operation="multiplication";
			symbol='*';
			result = leftVal * rightVal;
			break;
		case 'd':// result= value2!=0 ? value1/value2 :0;
			if (rightVal != 0)
				result = leftVal / rightVal;
			operation="division";
			symbol='/';
			break;
		default:
			System.out.println("Invalid opcode");
			operation="invalid operation";
			result = 0;
			symbol='_';
			break;
		}
		return result;

	}

	static char opCodeFromString(String operationName) {
		char opcode = operationName.charAt(0);

		return opcode;
	}

	static double valueFromWord(String word) {
		String[] numberWords = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"}; 
		String[] numbers={"0","1","2","3","4","5","6","7","8","9"};
		for (int i = 0; i < numberWords.length;i++) {
			if (word.equalsIgnoreCase(numberWords[i])||word.equals(numbers[i]))
				value = i;
		}
		return value;
	}

}
