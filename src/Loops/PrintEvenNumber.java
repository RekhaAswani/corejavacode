package Loops;

public class PrintEvenNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
System.out.println("=====================using  while loop===========================");
	
	int j=1;
	while (j<=10) {
		if(j%2==0){
		System.out.println(j);
		}
		j++;
	}
System.out.println("=====================using do while loop===========================");
	int k=1;
	do {
		if(k%2==0){
			System.out.println(k);
			}
		k++;
	} while (k<=10);
	
	}
     
	
}
