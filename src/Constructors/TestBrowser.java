package Constructors;
import java.util.ArrayList;
public class TestBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Browser b1= new Browser("Chrome");
		System.out.println(b1.browsername);
		
		Browser b2= new Browser("Chrome", "HP");
		System.out.println(b2.browsername);
		System.out.println(b2.vendorname);
		
		Browser b3= new Browser("Chrome", "HP", "34.5");
		System.out.println(b3.browsername);
		System.out.println(b3.vendorname);
		System.out.println(b3.currentversion);
		
		ArrayList<String> plugin1 =new ArrayList<String>();
		plugin1.add("addriod");
		plugin1.add("IOS");
		plugin1.add("test");
		
		Browser b4= new Browser("chrome", "HP", "33.3", plugin1);
		System.out.println(b4.browsername);
		System.out.println(b4.vendorname);
		System.out.println(b4.currentversion);
		System.out.println(b4.plugins);
		System.out.println("Size of list of plugin :" +b4.plugins.size());
		for(int i=0;i<b4.plugins.size();i++)
		{
			System.out.println("plugin are:" +b4.plugins.get(i));
		}
		
		//builder pattern
		
		Browser b5 =new Browser();
		b5.getBrowserName("Chrome").getvendorname("HP").
		getcurrentversion("36.5").getplugin(plugin1);
	}

}
