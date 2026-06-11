package array;

public class BubbleMaxToMin {

	public static void main(String[] args)
	{
		int[] arr= {8,4,1,2};
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					int tempp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tempp;
				}
			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
