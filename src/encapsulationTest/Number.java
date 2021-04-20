package encapsulationTest;
public class Number {
	 private String name;
	 private String type;
	 private int value;
	 
	 public void set(String name)
	 {
		 this.name=name;
	 }
	 
	 public String getname()
	 {
		 return name;
	 }
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	  
}
