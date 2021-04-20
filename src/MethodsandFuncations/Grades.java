package MethodsandFuncations;

import java.util.Scanner;

public class Grades {

	public  void getgrades(int Marks){
		
		if(Marks<=40)
		{
			System.out.println("fail");
		}
		else if(Marks>40 && Marks<50)
		{
			System.out.println("DD grade");
		}
		else if(Marks>50 && Marks<60)
		{
			System.out.println("CD grade");
		}
		else if(Marks>60 && Marks<70)
		{
			System.out.println("BC grade");
		}
		else if(Marks>70 && Marks<80)
		{
			System.out.println("BB grade");
		}
		else if(Marks>80 && Marks<90)
		{
			System.out.println("AB grade");
		}
		else if(Marks>90 && Marks<100)
		{
			System.out.println("AA grade");
		}
		else{
			System.out.println("Invalid");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grades obj1 = new Grades();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter marks");
		int numbers = sc.nextInt();
		obj1.getgrades(numbers);
	}

}
