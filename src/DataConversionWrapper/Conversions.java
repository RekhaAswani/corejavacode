package DataConversionWrapper;
public class Conversions {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x= "100";
		
		// Concatenation
		System.out.println(x+20);
		
		//  data  conversion(String to integer conversion)
		int i =Integer.parseInt(x);
		
		System.out.println(i+20);
		
		// String to double
		
		String y ="12.33";
		Double d = Double.parseDouble(y);
		
		System.out.println(d+20);
		
		String f = "true";
		
		if(Boolean.parseBoolean(f))
		{
			System.out.println("Hi");
		}
		String t ="100A";
//		int k = Integer.parseInt(t);
//		System.out.println(k+20);
		
		String digit =t.replaceAll("[A-Z]","");
		System.out.println(digit);
		int digits= Integer.parseInt(digit);
		               
		System.out.println(digits+20);
		
		// int to string conversion
		int total = 100;
		String t1 =String.valueOf(total);
		System.out.println(t1+20);
		System.out.println(total +""+20);
		
	}
}
