package Constructors;

import java.util.ArrayList;
public class TestUniversity {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al =new ArrayList<String>();
		
		al.add("BE");
		al.add("BSC");
		al.add("BETECH");
		al.add("Medical");
		al.add("CA");
		al.add("ART");
		
     University c1 = new University("RGPV", "India");
	    System.out.println(c1.name);	
	    System.out.println(c1.country);
	    
	    University c2 = new University("MP Board","India","11-sep-1970",al);
	    System.out.println(c2.name);
	    System.out.println(c2.country);
	    System.out.println(c2.stablishedDate);
	    System.out.println(c2.course);
	    
	    University c3 = new University("CBSC", "US", "11-sep-1960");
	    System.out.println(c3.name);
	    System.out.println(c3.country);
	    System.out.println(c3.stablishedDate);
	   
	    //calling builder pattern
	    University c4 = new University();
	    c4.getuniversity("MUMBAI UNIVERSITY").getcountry("INDIA").
	    getestablishedDate("23-AUG-1987").getcourseprovided(al); 
	    
	}

}
