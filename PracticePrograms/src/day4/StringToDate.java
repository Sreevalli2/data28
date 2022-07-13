package day4;
import java.util.*;
import java.time.LocalDate;

public class StringToDate{	
		 public static void main(String args[]) throws Exception
		 {
			  Scanner sc = new Scanner(System.in);
		      System.out.println("Enter the year: ");
		      int year = sc.nextInt();
		      System.out.println("Enter the month: ");
		      int month = sc.nextInt();	      
		      System.out.println("Enter the day: ");
		      int day = sc.nextInt();
		      sc.close();
		      //Getting the given date value
		      LocalDate givenDate = LocalDate.of(year, month, day);
		      //Converting given date to String
		      String date = givenDate.toString();
		      System.out.println("Given date :"+date);
		   }
		
}
