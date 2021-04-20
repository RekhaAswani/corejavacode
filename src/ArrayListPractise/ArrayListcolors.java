package ArrayListPractise;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ArrayListcolors {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al =new ArrayList<String>();
		
		al.add("Red");
		al.add("Blue");
		al.add("Green");
		al.add("Black");
		al.add("Pink");
		al.add("Yellow");
		al.add("white");
		System.out.println("Element of an array are: " +al);
		//adding element in the first position
		al.add(0, "Brown");
		
		System.out.println("size od array: " +al.size());
		//adding element in the last of the array list
		al.add(al.size(), "Purple");
		for (String a : al) {
			
			System.out.println(a);
			
		}
// Retrieve element from an array list
		
		System.out.println("--------------------retrive first from an arraylist---------------");
		System.out.println(al.get(0));
		System.out.println("--------------------retrive all element from an arraylist---------------");

		for (int i = 0; i < al.size(); i++) {
			
			System.out.println(al.get(i));
		}
		
//search an element in an array list
		System.out.println("--------------------Searching an element---------------");
		for (int j = 0; j < al.size(); j++) {
			
			if(al.get(j).contains("Red"))
				
			{
				System.out.println("Element found at " +j);
				break;
			}
			else
			{
				System.out.println("There is no match");
			}
			
		}
		// another way to search
		System.out.println("----------------Another way to search an element------------");	
		if(al.contains("Red"))
			
		{
			System.out.println("Element found");
		}
		
		else 
		{
			System.out.println("Element not found");	
		}
		
		
		//Reverse element in an array list
		System.out.println("----------------Reversing an element of an array------------");		
		for (int i = al.size()-1; i >=0; i--) {
			
			System.out.println(al.get(i));
			
		}
		// another way to reverse
		System.out.println("-------------another way to Reversing an element of an array------------");	
		Collections.reverse(al);
		System.out.println("Reversed array :" +al);
		
		/////Extract a portion of an array list
		System.out.println("----------------Extract a portion of an array list------------");
		
		List <String> sublist =al.subList(0, 3);
		
		System.out.println(sublist);
		
	  /////swap elements of an array list
		System.out.println("---------------swap an element of an array list------------");
		Collections.swap(al, 0, 1);
		System.out.println(al);
		
		//  program to empty an array list
		System.out.println("---------------Removing element from an array-----------");
		al.removeAll(al);
		System.out.println("array list after removing elements " +al);
		System.out.println("size of an array " +al.size());
	}	
	

}
