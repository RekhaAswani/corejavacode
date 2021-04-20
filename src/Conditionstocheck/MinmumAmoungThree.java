package Conditionstocheck;

import java.util.Scanner;

public class MinmumAmoungThree {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Numbers");
		Scanner sc = new Scanner(System.in);
		int x,y,z;
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		
		if (x<y && x<z)
		  {
			System.out.println("smallest is :" +x);
		  }
		 else if(y<z)
			{
				System.out.println("smallest is :" +y);
			}
			 else 
			 {
				System.out.println("greatest is :" +z);
			 }
		}
		
	}
