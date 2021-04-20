package Conditions;
public class Browserswitchcase {
  
	//WAF where we have to pass the browser name(string) and return boolean
	
	public boolean launchBrowser(String browserName)
	{
		System.out.println("lunching browser " +browserName);
		boolean flag = false;
		
		switch (browserName) {
		case "chrome":
			System.out.println("chrome is launched");
			flag = true;
			break;
		case "firefox":
			System.out.println("ff is launched");
			flag = true;
			break;
		case "safari":
			System.out.println("safri is launched");
			flag = true;
			break;

		default:
			System.out.println("Please pass correct browser name "+browserName);
			break;
		}
		return flag;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browserswitchcase obj = new Browserswitchcase();
		Boolean b=obj.launchBrowser("chrome");
        System.out.println(b);
	}

}
