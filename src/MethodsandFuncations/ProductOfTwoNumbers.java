package MethodsandFuncations;

import java.util.Scanner;

public class ProductOfTwoNumbers {
	
	public int getproduct(int a, int b)
	{
		int c = a*b;
		return c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductOfTwoNumbers obj1 = new ProductOfTwoNumbers();
	    Scanner in = new Scanner(System.in); 
	    System.out.println("Enter numbers to multiply");
	    int i = in.nextInt();
	    int j = in.nextInt();
		int prod= obj1.getproduct(i, j);
		System.out.println("Product is :" +prod);
	}
}
