package MethodsandFuncations;

import java.util.Scanner;

public class SumOfTwoNumbers {
	
	public int getSum(int a,int b)
	{
		int c = a+b;
		return c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SumOfTwoNumbers obj1 = new SumOfTwoNumbers();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = obj1.getSum(a, b);
		
		System.out.println("Sum of two numbers :" +sum);
				
	}

}
