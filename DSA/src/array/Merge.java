package array;

import java.util.Arrays;

public class Merge {

	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4};
		int[] arr1= {5,6,7};
		int[] res= new int[arr.length+ arr1.length];
		for(int i=0;i<arr.length;i++)
		{
			res[i]=arr[i];
		}
		for(int i=0;i<arr1.length;i++)
		{
			res[i+arr.length]=arr1[i];
		}
		System.out.println(Arrays.toString(res));
	}

}
