package Abstract;

public abstract class Page {
	
	// can not create the object of abstract class
	// but can create the const.. of the abstract class
	// it will be called when you create the object of the child class
	//only abstract methods yes 100% abstraction
	// only non abstract methods are also possible.
	// partial abstraction.
	public Page()
	{
		System.out.println("Page --- const");
	}
	
	public abstract void header();
	public abstract void title();
	
	public void pageLoading()
	{
		System.out.println("Page loading is ......30s");
	}
	
	public static void url()
	{
		System.out.println("App page---url");
	}
	public static void logo()
	{
		System.out.println("Page --- logo");
	}
	
	
	
	
}
