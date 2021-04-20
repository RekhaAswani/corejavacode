package ArrayListPractise;

import java.util.ArrayList;

public class ObjectArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //virtual capacity will be added after 10 elements
	 ArrayList<Object> ar = new ArrayList<Object>();
	 System.out.println(ar.size());
	 
	 ar.add(10);
	 ar.add(20);
	 ar.add(30);
	 System.out.println(ar.size());
	 ar.add(40);
	 ar.add(50);
	 
	 System.out.println(ar.size());
	 ar.add("Tom");
	 ar.add(12.33);
	 ar.add(true);
	 ar.add("testing");
	 ar.add('m');
	 
	 System.out.println(ar.size());
	 System.out.println("LI = " +0);
	 System.out.println("Hi = " +(ar.size()-1));
	 ar.add(500);
	 ar.add(600);
	 ar.add(700);
	 ar.add(800);
	 ar.add(900);
	 System.out.println(ar.size());
	 ar.add(400);
	 
	 
	}

}
