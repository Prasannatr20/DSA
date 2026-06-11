package insertionSort;

public class InsertionSort {

	public static void main(String[] args) 
	{
		//TimeComplexity=O(n^2)
		int []nums= {5,4,3,2,1};
		
		
		for(int i=1;i<nums.length;i++)
		{
			int key=nums[i];
			int j=i-1;
			while(j>=0 && nums[j]>key)
			{
				nums[j+1]=nums[j];
				j--;
			}
			nums[j+1]=key;
		}
		for (int i : nums) 
		{
			System.out.print(i+" ");
		}
	}

}
