package in.ineuron.ai;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number :: ");
		
		int limit = input.nextInt();
		
		int num1=0 , num2=1;

		System.out.println("Fibonnaci series upto" +limit + ":");
		System.out.print(num1 + " " +num2);
		
		for (int i = 2 ; i <= limit ; i++)
		{
			int nextNum = num1 + num2;
			System.out.print(" " +nextNum);
			
			num1 = num2;
			num2 = nextNum;
		}
		
		input.close();
	}

}
