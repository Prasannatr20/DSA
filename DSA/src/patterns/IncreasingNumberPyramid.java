package patterns;

public class IncreasingNumberPyramid {

	public static void main(String[] args)
	{
		int n=5,m=9;
		for(int i=1,p=1;i<=n;i++,p++)
		{
			for(int j=1;j<=m;j++)
			{
				if(i+j>=n+1 && j-i<=n-1) System.out.print(p+" ");
				else System.out.print("  ");
			}
			System.out.println();
		}
	}

}
