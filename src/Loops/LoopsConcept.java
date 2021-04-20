package Loops;
public class LoopsConcept {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while loop
		// it will run an infinite loop if you dont write condition
		int i=1;
		while(i<=100)
		{
			System.out.println(i);//1 2 3 4 56.....10
			i++; //0r ++i or i=i+1;
		}
		
		System.out.println("====================================");
		// another concept
		int j=1;
		while(j<=10)
		{
			j++;
			System.out.println(j);
		}
		System.out.println("==========================================================");
		
		int n=1;
		while(n<=50)
		{
			System.out.println(n);
			if(n%5==0)
			{
				System.out.println("Hi.......");
				
			}
			n++;
		}
		
System.out.println("=======================do while loop============================================");

		int p=1;
		 do {
			System.out.println(p);
			p++;
		} while (p<=10);
			
		
	}
}
