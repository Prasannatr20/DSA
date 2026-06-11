package linearSearch;

public class Demo {

	public static void main(String[] args)
	{
		int [] nums= {2,5,7,9,12};
		int target = 67;
		int result= linearSearch(nums, target);
		if(result!=-1)
			System.out.println("Index :" + result);
		else
			System.out.println("Not found");
	}
	public static int linearSearch(int [] nums, int target)
	{
		for(int i=0; i<nums.length;i++)
		{
			if(nums[i]==target)
				return i;
		}
		return -1;
	}

}
