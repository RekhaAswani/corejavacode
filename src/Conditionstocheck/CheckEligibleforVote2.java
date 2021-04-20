package Conditionstocheck;

public class CheckEligibleforVote2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int age =19;
         boolean condition = true;
         
         if( age>=18 && condition) {
       
        System.out.println("Person eligible for vote");
       
         }
         else if (age<18 && age >=1  && condition) {
        System.out.println("Person not eligible for vote");
         }
         
         else  {
        System.out.println("person does not exist");
         }
		
	}

}
