package MethodsandFuncations;
import java.util.Scanner;
public class Circumferences 
{
	public double circumference(int r)
	{
		double cir= 2*3.14*r;
		return cir;
	}
	
	public double Area(int r)
	{
		double area= 3.14*r*r;
		return area;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circumferences obj1 = new Circumferences();
		 Scanner in = new Scanner(System.in); 
		 System.out.println("Enter Radius");
		 int R = in.nextInt();
		 double CIR= obj1.circumference(R);
		 double Area= obj1.Area(R);
		System.out.println("circumference is :" +CIR);
		System.out.println("Area is :" +Area);
      
	}

}
