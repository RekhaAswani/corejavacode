package MethodsandFuncations;
import java.util.ArrayList;
public class PageLinks {

	public int getLinksCount(String PageName)
	{
		int count =0;
		switch (PageName) {
		case "LoginPage":
			count =getPageLinksText(PageName).size();
			break;
		case "HomePage":
			count =getPageLinksText(PageName).size();
		default:
			break;
		}
		return count;
	}
	public ArrayList<String> getPageLinksText(String pageName)
	{
		System.out.println("getting page links text for : " +pageName);
		ArrayList<String>linksList = new ArrayList<String>();
		
		if(pageName.equals("LoginPage"))
		{
			linksList.add("login");
			linksList.add("contact us");
			linksList.add("Privacy policy");
		}   
		else if(pageName.equals("HomePage"))
		{
			linksList.add("logout");
			linksList.add("wishlist");
			linksList.add("business");
		}
		else{
			System.out.println("page is not available.......");
		}
		return linksList;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PageLinks obj1 = new PageLinks();
		int c1 = obj1.getLinksCount("LoginPage");
		System.out.println(c1);
		ArrayList<String> homepageArraylist=obj1.getPageLinksText("HomePage");
		System.out.println(homepageArraylist);
		
	}

}
