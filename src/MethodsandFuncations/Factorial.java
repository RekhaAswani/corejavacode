package MethodsandFuncations;
import java.util.Scanner;
public class Factorial {
	public int Factorialfirst(int n)
	{
		if(n==0)
			return 1;
		
		else 
			return n*Factorialfirst(n-1);			
	}
	public int Factorialsecond(int m)
	{
		int fact =1;
		for(int i=1;i<=m;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Factorial obj1 = new Factorial();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int n =sc.nextInt();     
    int factorial1 =obj1.Factorialfirst(n);
    System.out.println("Factorial1 is :" +factorial1);
    
    int factorial2=obj1.Factorialsecond(n);
    System.out.println("Factorial2 is :" +factorial2);
    
	}

}
