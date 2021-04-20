package BuilderPattern;

public class UberApp {

	public UberApp launchApp(String Appname)
	{
		System.out.println("App is launched" +Appname);
		return this;
	}
	public UberApp doLogin(String un,String pwd)
	{
		System.out.println("Login with" +un+ "" +pwd);
		return this;
	}
	public UberApp selectdroplocation(String location)
	{
		System.out.println("location is " +location);
		return this;
	}
	public UberApp Bookcab(String Cabnumber)
	{
		System.out.println("cab is booked " +Cabnumber);
		return this;
	}
	public UberApp Drop(String droplocation)
	{
		System.out.println("reached drop location" +droplocation);
		return this;
	}
	public UberApp GetOTP(String OTP)
	{
	   System.out.println("OTP received " +OTP);	
	   return this;
	}
	public UberApp makepayment(String amount)
	{
		System.out.println("Amount received" +amount);
		 return this;
	}
}
