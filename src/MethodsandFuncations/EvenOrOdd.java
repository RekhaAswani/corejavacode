package MethodsandFuncations;

import java.util.Scanner;
public class EvenOrOdd {
	public void checkevenorOdd(int number)
	{
		if(number%2==0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOrOdd obj1 = new EvenOrOdd();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter numbers to check whether it is even or odd");
		int a = in.nextInt();
		obj1.checkevenorOdd(a);
	}

}
