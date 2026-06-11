package array;
import java.util.HashSet;

public class Duplicate {

	public static void main(String[] args)
	{
		int[] arr= {3,4,2,3,1,4,5446,86,45,6,4};
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					set.add(arr[i]);
				}
			}
		}
		for(int i:set)
		{
			System.out.println(i);
		}
	}

}
