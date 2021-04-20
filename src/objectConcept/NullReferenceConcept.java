package objectConcept;

public class NullReferenceConcept {

	 String name;
	 int age;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NullReferenceConcept obj = new NullReferenceConcept();
		
		obj.name="Tom";
		obj.age=25;
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		obj = null;
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		
	}

}
