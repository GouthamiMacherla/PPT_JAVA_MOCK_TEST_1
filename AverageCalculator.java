package in.ineuron.ai;

import java.util.Scanner;

public class AverageCalculator {
     private static int n;

	public static void main(String[] args)
     {
    	 Scanner input = new Scanner(System.in);
    	 
    	 System.out.print("Enter the number of elements : ");
    	 n = input.nextInt();
    	 
    	 int sum = 0; 
    	 int count = 0;
    	 int number;
    	 
    	 
    	 do {
    		 System.out.print("Enter a number (or 0 to stop): ");
    		 number = input.nextInt();
    		 
    		 if(number != 0)
    		 {
    			 sum += number;
    			 count++;
    		 }
    	 }while(number != 0);
    	 
    	 double average = (double)sum / count;
    	 System.out.println("The average of the numbers is :: " +average);
    	 
    	 input.close();
     }
}
