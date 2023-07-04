package in.ineuron.ai;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first number :: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter the second number :: ");
		int num2 = input.nextInt();
		
		System.out.print("Enter the third number :: ");
		int num3 = input.nextInt();
		
		int largest;
		if(num1 > num2)
		{
			if(num1 > num3)
			{
				largest = num1;
			}else {
				largest = num3;
			}
		}else { 
			if(num2 > num3)
			{
				largest =num2;
			}else {
				largest = num3;
			}
			
		}
		
		System.out.println("The Largest number is ::"  +largest);
		
		input.close();

	}

}
