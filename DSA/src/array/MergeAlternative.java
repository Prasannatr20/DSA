package array;

public class MergeAlternative {

	public static void main(String[] args)
	{
		int[] arr1= {1,3,5};
		int[] arr2= {2,4,6};
		int[] arr = new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++)
		{
			arr[2*i]=arr1[i];
			arr[2*i+1]=arr2[i];
		}
		for(int i: arr)
		{
			System.out.println(i);
		}
	}

}
