package Conditions;

public class StudentMarksUsingSwitch {

	public void getMyStudentMarks(String studentName)
	{
		switch (studentName) {
		case "Tom":
			System.out.println(studentName +" 90 marks");
			break;
		case "Anu":
			System.out.println(studentName +" 95 marks");
			break;
		case "Raj":
			System.out.println(studentName +" 80 Marks");
			break;		
		default:
			System.out.println(studentName +" is not present");
			break;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentMarksUsingSwitch ob1 = new StudentMarksUsingSwitch();
		ob1.getMyStudentMarks("Naveen");
	}

}
