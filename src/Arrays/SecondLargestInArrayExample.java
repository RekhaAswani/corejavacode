package Arrays;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class SecondLargestInArrayExample {
	public static int SecoundLargestArrayExample(Integer[]a, int total)
	{
		List<Integer>list=Arrays.asList(a);
		Collections.sort(list);
		int element = list.get(total-2);
		return element;
	}
	public static int getSecondLargest(Integer[]a,int total)
	{ int temp;
		for(int i=0;i<total;i++)
		{
			for (int j=i+1;j<total;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[total-2];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] arr ={76,45,12,63,25,36};
		
		System.out.println("length of the array " +arr.length);
		System.out.println("Second largest:" +SecoundLargestArrayExample(arr,6));    
		
		System.out.println("second approach");
		System.out.println("Second approach:" +getSecondLargest(arr,6));
	}

}
