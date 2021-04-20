package Constructors;
import java.util.ArrayList;
public class Browser {

   String browsername;
   String vendorname;
   String currentversion;
   ArrayList <String>plugins;
   
   public Browser()
   {
	   System.out.println("default constructor");
   }
  public Browser(String browsername) {
	this.browsername = browsername;
  }

public Browser(String browsername, String vendorname) {
	this.browsername = browsername;
	this.vendorname = vendorname;
}

public Browser(String browsername, String vendorname, String currentversion) {

	this.browsername = browsername;
	this.vendorname = vendorname;
	this.currentversion = currentversion;
}

public Browser(String browsername, String vendorname, String currentversion,
		ArrayList<String> plugins) {
	
	this.browsername = browsername;
	this.vendorname = vendorname;
	this.currentversion = currentversion;
	this.plugins = plugins;
}
 /// builder pattern
   public Browser getBrowserName(String browsername)
   {
	   System.out.println("browser name is" +browsername);
	   return this;
   }
   
   public Browser getvendorname(String vendorname)
   {
	   System.out.println("vendor name is" +vendorname);
	   return this;
   }

   public Browser getcurrentversion(String currentversion)
   {
	   System.out.println("current version is" +currentversion);
	   return this;
   }
   
   public Browser getplugin(ArrayList<String> plugin)
   {
	   System.out.println("current version is" +plugin);
	   return this;
   }
   
}


