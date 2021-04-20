package encapsulationTest;

public class NumberTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Number n1 = new Number();
		n1.set("encapsualtiontest");
		n1.setType("Integer");
		n1.setValue(3);
		
		System.out.println(n1.getname()+ " " +n1.getType()+" "+n1.getValue());
	}

}
