package selectionSort;

public class Selection 
{
	//TimeComplexity=O(n^2)
	public static void main(String[] args)
	{
		int []nums= {12,32,13,4,9};
		int smallIndex=-1;
		for(int i=0;i<nums.length-1;i++)
		{
			smallIndex=i;
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[j]<nums[smallIndex])
				{
					smallIndex=j;
				}
			}
			int temp=nums[smallIndex];
			nums[smallIndex]=nums[i];
			nums[i]=temp;
		}
		for(int i=0;i<nums.length;i++)
		{
			System.out.print(nums[i]+" ");
		}
	}

}
