package OOP_Inheritance;

public class TestUniversity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      MPUniveristy m = new MPUniveristy();
      m.universityname(); //overridden method(in child)
      m.exames();         // inherited from parent
      m.universityrules(); // inherited from parent
      m.mpuniversitygradesystem(); //independent method
      m.marks();// granparent method
      System.out.println(m.name);
      
      PuneUniversity P1 = new PuneUniversity ();
      P1.universityname();
      
      University u = new University();
      u.universityname();
      u.universityrules();
      u.exames();
      m.marks();
      
      
      // Top casting
      University a1= new MPUniveristy();
      a1.universityname();
      a1.universityrules();
      a1.exames();
      
      // top casting with grandparent
       CentralUniversity C =new MPUniveristy(); //generally we dont do
       C.marks();
       
      // down casting not possible at run time
     
      MPUniveristy m1= (MPUniveristy)new University(); // classCastException
      
      MumbaiUniversity M = new MumbaiUniversity();
      M.universityname();
      M.exames();
      M.universityrules();
      M.extraclasses();
	}

}
