package array;

public class SecondHighest {

	public static void main(String[] args)
	{
		int[] arr= {2,3,24,55,322,3,98,32,87};
		int fmax=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		if(arr.length<2)
		{
			System.out.println("NO sec ");
			return;
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>fmax)
			{
				smax= fmax;
				fmax=arr[i];
			}
			else if(arr[i]>smax&& arr[i]!=fmax)
			{
				smax=arr[i];
			}
		}
		if(Integer.MIN_VALUE==smax) System.out.println("no");
		else System.out.println(smax);
	}
}
