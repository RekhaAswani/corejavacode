package Conditionstocheck;

import java.util.Scanner;
public class LargestAmongThree {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Numbers");
		Scanner sc = new Scanner(System.in);
		int x,y,z;
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		
  if (x>y && x>z)
	  {
		System.out.println("greatest is :" +x);
	  }
	 else if(y>z)
		{
			System.out.println("greatest is :" +y);
		}
		 else 
		 {
			System.out.println("greatest is :" +z);
		 }
	}
}
