package array;

public class MissingNumbers {

	public static void main(String[] args)
	{
		int[] nums= {3,0,1};
		System.out.println(missingNumbers(nums));
	}
	static int missingNumbers(int[] nums)
	{
		int sum=0,sum2=0;
		for(int i=1;i<=nums.length;i++)
		{
			sum+=i;
		}
		for(int i: nums)
		{
			sum2+=i;
		}
		return sum-sum2;
	}

}
