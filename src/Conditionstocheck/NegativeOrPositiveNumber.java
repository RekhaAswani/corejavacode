package Conditionstocheck;

import java.util.Scanner;

public class NegativeOrPositiveNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int a;
		a=sc.nextInt();
		
		if(a>0)
		{
			System.out.println("Positive number");
		}
		
		else 
		{
			System.out.println("Negative number");
		}
	}
	

}

