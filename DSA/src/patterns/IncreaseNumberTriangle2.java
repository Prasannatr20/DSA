package patterns;

public class IncreaseNumberTriangle2 {

	public static void main(String[] args)
	{
		int n=4, a=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i+j>=n+1) System.out.print(a+" ");
				else System.out.print("  ");
			}
			a++;
			System.out.println();
		}
	}

}
