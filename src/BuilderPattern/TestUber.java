package BuilderPattern;

public class TestUber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		UberApp a1 = new UberApp();
		a1.launchApp("upber").doLogin("Rekha", "Rekha123").
		selectdroplocation("Bhopal").Bookcab("123").Drop("bairagarh").
		GetOTP("2345").makepayment("400");
		
		UberApp a2 = new UberApp();
		a2.launchApp("UBER").selectdroplocation("Kodihali");
 
	}

}
