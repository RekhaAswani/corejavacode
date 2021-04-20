package StaticNonStatic;
public class CarStatic {
	String name;
	int price;
	String color;
	static int wheels =4;
	
	// how to call static vars/methods:
	// no need to create the Object of the class
	
	// 2. Should be called by className.
	
	public static void start(){
		System.out.println("car starts");
	}
	public void steetring()
	{
		System.out.println("car --- steering");
	}
	public static void main(String[] args) {
		// 1. can be called directly within the same class
		System.out.println(wheels);
		start();
		// steetring(); cant use
		//2. should be called by className.
		System.out.println(CarStatic.wheels);
		CarStatic.start();
		
		// TODO Auto-generated method stub
		CarStatic c1 = new CarStatic();
		c1.name ="BMW";
		c1.price=70;
		c1.color="Black";
		c1.wheels=4;  // warning
		System.out.println(c1.name);
		c1.steetring();
		c1.start();//warning
		
		CarStatic c2 = new CarStatic();
		c2.name="Audi";
		c2.price =80;
		c2.color="white";
		c2.wheels=4; //warning
		
	}

}
