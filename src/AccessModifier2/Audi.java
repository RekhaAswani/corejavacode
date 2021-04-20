package AccessModifier2;

import AccessModifiers.Car;
public class Audi extends Car{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Car c = new Car();
     c.price=100; //public
     
     Audi a = new Audi();
     a.color="Red";
     a.price=200; //public
     
     
     
	}

}
