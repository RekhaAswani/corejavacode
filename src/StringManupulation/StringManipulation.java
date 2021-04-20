package StringManupulation;
public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st = "HHHHi this is my java code and I am so Happy";
		
		System.out.println(st.length());
		
		System.out.println(st.charAt(0));
		System.out.println(st.charAt(40));
		
		System.out.println(st.indexOf("i")); // first occurrence at 4
		
		System.out.println(st.indexOf("i", st.indexOf("i")+1)); //second occurrence
		
	    System.out.println(st.indexOf("i", st.indexOf("i")+5)); //third occurrence 
		
	  // System.out.println(st.indexOf("i", (st.indexOf("i")+1)+1));
		
	 // System.out.println(st.indexOf("code"));
	 
	 // System.out.println(st.indexOf("Hello"));
		
		
	}

}
