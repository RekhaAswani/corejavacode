package OOP_Inheritance;
public class MPUniveristy extends University{

	//Method Overriding:(Run time :(Dynamic polymorphism) Poly+Morphism
	//when you have a method in parent class and the same method in child class
	//with the same name
	//same number of parameter
	//with same type
	
	@Override
	public void universityname()
    {
    	System.out.println(" MP Univesity---name ");
    }
	
    public void mpuniversitygradesystem()
    {
    	System.out.println("MP university grade system");
    }
}

