package MethodsandFuncations;
public class Voteelligibility {
	public void getVoteeligibility(int Age)
	{
		if(Age>=18)
		{
			System.out.println("Person is elligible to vote");
		}
		else
		{
			System.out.println("Person is not elligible to vote");
		}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Voteelligibility obj1 = new Voteelligibility();
		obj1.getVoteeligibility(4);
	}
}
