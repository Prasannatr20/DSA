package patterns;

public class DecreasingNumberTriangle {

	public static void main(String[] args)
	{
		int n=4, a=4;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i>=j) System.out.print(a+" ");
				else System.out.print("  ");
			}
			a--;
			System.out.println();
		}
	}

}
