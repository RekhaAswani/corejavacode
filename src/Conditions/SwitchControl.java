package Conditions;

import java.lang.invoke.SwitchPoint;

public class SwitchControl {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Kunal"; // case sensitive

		// after writing switch it is control space it will type other parts
		switch (name) {
		case "kunal":
			System.out.println(name + "100 marks");
			break;
		case "Naveen":
			System.out.println(name + " 10 marks");
			break;
		case "Raksha":
			System.out.println(name + "90 marks");
			break;
		case "Tom":
			System.out.println(name + "80 marks");
			break;
		case "Peter":
			System.out.println(name + "95 marks");
			break;
		default:
			System.out.println(name + ": is not found.....");
			break;
		}
		// / another example
		String browser = "chrome";

		switch (browser.toUpperCase()) {

		case "CHROME":
			System.out.println("lunch chrome");
			break;
		case "firefox":
			System.out.println("lunch ff");
		case "safari":
			System.out.println("lunch safari");
		case "opera":
			System.out.println("lunch opera");

		default:
			System.out.println("please pass correct browser name...");
			break;
		}

		// / another concept for switch case
		String country = "Russia";
		String capital = null;

		switch (country) {
		case "India":
			capital = "New Delhi";
			break;
		case "UK":
			capital = "London";
			break;
		case "US":
			capital = "DC";
			break;
		case "Germany":
			capital = "Munich";
			break;
		default:
			System.out.println("Country is not found......");
			break;
		}
		System.out
				.println("Country is :" + country + " capital is: " + capital);

		// another example

		int marks = 100;
		String grade = null;
		switch (marks) {
		case 100:
			grade = "GRADE A";
			break;
		case 80:
			grade = "GRADE B";
			break;
		case 50:
			grade = "GRADE C";
			break;
		case 30:
			grade = "FAIL";
			break;

		default:
			break;
		}
		System.out.println("marks: " + marks + " Grade is : " + grade);

		// WAP to find out highest number (where three numbers are there and all
		// are different)
		// Short circuit operator
		int x = 500;
		int y = 600;
		int z = 300;

		if (x > y && x > z) {
			System.out.println(" x is the greatest");
		} else if (y > z) {
			System.out.println(" y is the greatest");
		} else {
			System.out.println(" z is the greatest");
		}
	}
}
