package Conditionstocheck;

import java.util.Scanner;

public class LargestAmongFour {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a,b,c,d;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		
		int t1,t2,lar;
		
		t1=(a>b?a:b);
		t2=(c>d?c:d);
		lar=(t1>t2?t1:t2);
		System.out.println("Greatest of Four number : " +lar);
		
		System.out.println("=====================second approach===========================");
		if(a>b)
		{
			if(a>c)
			{
				if(a>d)
				{
					System.out.println("The greatest is "+a);
				}
				else
				{
					System.out.println("The greatest is "+d);
				}
			}
			else
			{
				if(c>d)
				{
					System.out.println("The greatest is "+c);
				}
				else
				{
					System.out.println("The greatest is "+d);
				}
			}
		}
		else
		{
			if(b>c)
			{
				if(b>d)
				{
					System.out.println("The greatest is "+b);
				}
				else
				{
					System.out.println("The greatest is "+d);
				}
			}
			else
			{
				if(c>d)
				{
					System.out.println("The greatest is "+c);
				}
				else
				{
					System.out.println("The greatest is "+d);
				}
			}
		}
		
	}

}
