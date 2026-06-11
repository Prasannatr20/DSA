package array;

public class EvenIndexSum {

	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,5,6};
		int sum=0;
		for(int i=0;i<arr.length;i+=2)
		{
				sum+=arr[i];
		}
		System.out.println(sum);
	}

}
