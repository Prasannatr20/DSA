package binarySearch;

public class Demo {

	public static void main(String[] args) 
	{
		int []nums= {2,4,6,7,9,11,14};
		int target=38;
		int result=binarySearch(nums,target);
		if(result!=-1)
			System.out.println("Index : "+result);
		else
			System.out.println("not found");
	}
	public static int binarySearch(int[] nums, int target)
	{
		int left=0;
		int right=nums.length-1;
		while(left<=right)
		{
			int mid=(left+right)/2;
			if(target==nums[mid])
				return mid;
			else if(target>nums[mid])
				left=mid+1;
			else
				right=mid-1;
		}
		return -1;
	}

}
