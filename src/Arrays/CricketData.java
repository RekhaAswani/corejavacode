package Arrays;
public class CricketData {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object ob[] = new Object[7];
		ob[0]="sachin";
		ob[1]=30;
		ob[2]="Mumbai";
		ob[3]="11-97-1990";
		ob[4]='M';
		ob[5]= 35.5;
		ob[6]= true;
		System.out.println("-------------------------using for loop--------------------");
		for(int i=0;i<ob.length;i++)
		{
			System.out.print(" "+ob[i]);
		}
		System.out.println();
		
		
		System.out.println("-------------------------Another player using for loop--------------------");
		Object ob1[] = new Object[7];
		ob1[0]="Rahul";
		ob1[1]=25;
		ob1[2]="Bangalore";
		ob1[3]="11-97-1995";
		ob1[4]='M';
		ob1[5]= 34.5;
		ob1[6]= true;
		for(int i=0;i<ob1.length;i++)
		{
			System.out.print(" "+ob1[i]);
		}
		System.out.println();
	System.out.println("--------------------------Using while loop--------------------");
	int j=0;
	while (j<ob.length) {
		System.out.print(" "+ob[j]);
	    j++;	
	}
		/// How to print isActive or not 

	}
}
