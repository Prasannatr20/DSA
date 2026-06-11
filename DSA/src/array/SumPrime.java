package array;

public class SumPrime {

	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,5,6};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			boolean prime=true;
			int a= arr[i];
			if(a<=1) prime =false;
			if(a>1)
			{
				for(int j=2;j*j<=a;j++)
				{
					if(a%j==0)
					{
						prime=false;
						break;
					}
					
				}
			}
			if(prime)
			{
				sum+=arr[i];
			}
		}
		System.out.println(sum);
	}
}
