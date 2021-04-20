package ArrayListPractise;

import java.util.ArrayList;

public class TrimArralist {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> ar = new ArrayList<Integer>(9);
		System.out.println("Size of arraylist is before adding element " +ar.size());
		ar.add(5);
		ar.add(10);
		ar.add(15);
		ar.add(20);
		ar.add(25);
		
		System.out.println("Size of arraylist is after adding elements :" +ar.size());
		
		ar.trimToSize();
		
		// if write numbers in the beginning it will create only that number of VC(virtual capacity)
		// Press f8 to reach to next debugger point
		ArrayList<String> LinksList = new ArrayList<String>(5);
		
		LinksList.add("Home");
		LinksList.add("Login");
		LinksList.add("contct us");
		System.out.println(LinksList);
		LinksList.add("Bye");
		LinksList.add("See you");
		LinksList.add("Learn java");
		
		
		
	}

}
