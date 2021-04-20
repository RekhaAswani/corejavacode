package Conditionstocheck;
public class CheckEligibleForVote {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Age =19;
		Boolean IsAlive = false ;
		System.out.println("=======================================================");
		
		if(Age>=18)
		{
			if(IsAlive)
			{
				System.out.println("Person is eligible to vote");
			}
			else
			{
				System.out.println("Person does not exits");
			}
		}
		else
		{
			System.out.println("Person is not eligible to vote");
		}
}
}
	