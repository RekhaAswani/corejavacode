package Constructors;
import java.util.ArrayList;

public class University {

	String name;
	String country;
	String stablishedDate;
	ArrayList<String> course =new ArrayList<String>();
	
	public University()
	{
		System.out.println("default constructor");
	}
	
	public University(String name,String country)
	{
		this.name= name;
		this.country=country;
	}
	public University(String name,String country,String stablishedDate)
	{
		this.name= name;
		this.country=country;
		this.stablishedDate=stablishedDate;
	}
	
	public University(String name, String country, String stablishedDate,
			ArrayList<String> course) {
	
		this.name = name;
		this.country = country;
		this.stablishedDate = stablishedDate;
		this.course = course;
	}
 //builder pattern
	public University getuniversity(String univerisy)
	{
		System.out.println("universiyt is :" +univerisy);
		return this;
	}
	
	public University getcountry(String country)
	{
		System.out.println("country is :" +country);
		return this;
	}
	
	public University getestablishedDate(String Date)
	{
		System.out.println("established date is :" +Date);
		return this;
	}
	
	public University getcourseprovided(ArrayList<String> list)
	{
		System.out.println("provided courses are :" +list);
		return this;
	}
}
