package MethodsandFuncations;
import java.util.Scanner;
public class MaxAmoungThree {
	public int MaximumAmoungThree(int a, int b, int c)
	{
		if (a>b && a>c)
		{
			System.out.println("Greatest is" +a);
			return a;
		}
		 else if(b>c)
			{
				System.out.println("smallest is :" +b);
				return b;
			}
			 else 
			 {
				System.out.println("greatest is :" +c);
				return c;
			 }
	}
	public int MiniimumAmoungThree(int p, int q, int r)
	{
		if (p<q && p<r)
		{
			System.out.println("smallest is" +p);
			return p;
		}
		 else if(q<r)
			{
				System.out.println("smallest is :" +q);
				return q;
			}
			 else 
			 {
				System.out.println("greatest is :" +r);
				return r;
			 }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); 
		System.out.println("Enter numbers to check Max and Min");
	    int i = in.nextInt();
	    int j = in.nextInt();
	    int k = in.nextInt();
	    MaxAmoungThree obj1 = new MaxAmoungThree();
	    int max=obj1.MaximumAmoungThree(i, j, k);
	    System.out.println("Maximum number is : " +max);
	    
	     int l = in.nextInt();
	     int m = in.nextInt();
	     int n = in.nextInt();
	     int min =obj1.MiniimumAmoungThree(l, m, n);
	     System.out.println("Minimum number is :" +min);     
	}
}