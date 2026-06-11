package array;

public class Sum
{

	public static void main(String[] args)
	{
//		int[] arr = {1,2,3,4,5};
//		int sum=0;
//		for(int i=0;i<=arr.length-1;i++)
//		{
//			sum+=arr[i];
//		}
//		System.out.println(sum);
		
		int a[] = {2,4,5,7, 1, 8, 9};
		int sum = 0;
		for (int i=0; i<a.length-1; i++)
		{
			if (a[i]%2 == 1)
			{
				sum = sum + a[i];
			}
		}

		System.out.print (sum);

		
	}
}


