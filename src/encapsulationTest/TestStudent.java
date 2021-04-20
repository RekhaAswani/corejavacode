package encapsulationTest;

public class TestStudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Student s1 = new Student();
     s1.setName("Rekha Aswani");
     s1.setStdId(123);
     s1.setStdRollNo(12345);
     
	System.out.println(s1.getName()+ " " +s1.getStdId() +" "+s1.getStdRollNo());
	}

}
