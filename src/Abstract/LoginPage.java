package Abstract;

public class LoginPage extends Page {

	public LoginPage()
	{
		System.out.println("LP --- const...");
	}
	@Override
	public void header() {
		System.out.println("LP --- header...");
	}

	@Override
	public void title() {
		System.out.println("LP --- title...");
	}
}
