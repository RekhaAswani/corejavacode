package StringManupulation;

public class Split {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="JAVA_PYTHON_RUBY_JAVASCRIPT";
		 String rev=" ";
		String str[] = s.split("_");
		
		for(int i=0;i<str.length;i++)
		{
			for(int j=str[i].length()-1;j>=0;j--)
			{
				rev= rev +str[i].charAt(j);
			}
			rev=rev+"_";
		}
		System.out.println(rev);
	}

}
