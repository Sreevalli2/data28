package other;

import java.util.Scanner;
import java.util.Random;

class randomnumber
{
    public static void main(String[] args) 
    {
        int maxRange;
        Scanner SC = new Scanner(System.in);
        Random rand = new Random();       
        System.out.print("Please Enter Maximum Range: ");
        maxRange=SC.nextInt();
        System.out.println("Loop prints randomly by "+maxRange+" times");       
        for(int loop=1; loop<=maxRange; loop++)
        {
            System.out.print(rand.nextInt(maxRange)+"\t");
        }
        SC.close();
    }
}