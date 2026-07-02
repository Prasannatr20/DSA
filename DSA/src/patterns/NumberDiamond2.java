package patterns;

public class NumberDiamond2 {

	public static void main(String[] args)
	{
		int n=9,count=0;
		for(int i=1,p=1;i<=n;i++,p++)
		{
			for(int j=1;j<=n;j++)
			{
				if(p==5 && count==0)
				{
					count++;
					p=1;
				}
				if(i+j>=6 && j-i<=4 && i-j<=4 && i+j<=14) System.out.print(p+" ");
				else System.out.print("  ");
			}
			System.out.println();
		}
	}

}
