package ArrayListPractise;
import java.util.ArrayList;
public class Arraylistnumbers {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new  ArrayList<Integer>();
		
		al.add(1);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		al.add(10);
		al.add(11);
		System.out.println(al);
		//updating an element
		
		al.set(1, 20);
		al.set(2, 33);
		System.out.println("----------after updating------------------- ");
		System.out.println(al);
		
		// remove third element from an array
		System.out.println("----------after removing third element------------------- ");
		al.remove(2);
		System.out.println(al);
		

		
		
	////Write a Java program to print all the elements of a ArrayList using the position of the elements
      
		System.out.println("----------Printing elemetn of an array usig position------------ ");
	for (int i = 0; i < al.size(); i++) {
		
		System.out.println("elements of an array list are " +i +": "+ +al.get(i));
		
	}	
     		

		
			}

}
