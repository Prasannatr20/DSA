package array;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args)
	{
		//Leetcode -238
		int[] arr= {1,2,3,4};
		System.out.println(ProductOfArrayExceptSelf.product(arr));
	}
	static int[] product(int[] arr)
	{
		int[] left= new int[arr.length];
		left[0]=1;
		int[] right = new int[arr.length];
		right[arr.length-1]=1;
		for(int i=1;i<arr.length-1;i++)
		{
			left=
		}
		return right;
	}

}
