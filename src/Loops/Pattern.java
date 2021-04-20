package Loops;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	for(int i=0;i<4;i++)
	{
		for(int j= 0; j<10;j++)
		{
			System.out.print(""+i+j+" ");
		}
		System.out.println();
	}
 System.out.println("-------------------- using 2D array--------------------------------");
      
	   int dd[][]= new int[4][10];
	   
	   for(int x=0;x<dd.length;x++)
	   {
		   for(int y=0;y<dd[0].length;y++)
		   {
			   System.out.print(x+""+y+" ");
		   }
		   System.out.println();
	   }
	
	
	}

}
