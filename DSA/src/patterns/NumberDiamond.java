package patterns;

public class NumberDiamond {

	public static void main(String[] args)
	{
		int n=9;
		for(int i=1,p=1;i<=n;i++,p++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i+j>=6 && j-i<=4 && i-j<=4 && i+j<=14) System.out.print(p+" ");
				else System.out.print("  ");
			}
			System.out.println();
		}
	}

}
