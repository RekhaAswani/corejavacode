package encapsulationTest;
public class Student {
	
	private String stdName;
	private int stdRollNo;
	private int stdId;
	
	public void setName(String stdName)
	{
		this.stdName=stdName;
	}

	public String getName()
	{
		return stdName;
	}

	public int getStdRollNo() {
		return stdRollNo;
	}

	public void setStdRollNo(int stdRollNo) {
		this.stdRollNo = stdRollNo;
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
}
