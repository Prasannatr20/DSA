package array;

public class Min {

	public static void main(String[] args)
	{
		int[] arr= {32,43,3,2,-2,87,13,133};
		int min=arr[0];
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println(min);
	}

}
