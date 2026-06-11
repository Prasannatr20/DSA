package patterns;

public class Star 
{

	public static void main(String[] args) 
	{
		int n=4;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==4||j==1)
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	System.out.println("------------------------------------");
	
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(i==1||j==4)
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
	}
	System.out.println("------------------------------------");

	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(i==1||j==1)
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
	}
	System.out.println("--------------------------");
	
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(i==j)
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
	}
	
	System.out.println("--------------------------");

	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(i+j==5)
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
	}
	
	
	System.out.println("--------------------------");

	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(i>=j)
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
	}
	System.out.println("--------------------------");

	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(i+j<=5)
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
	}
	System.out.println("------------------------------");
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n*2-1;j++)
		{
			if(i>=j||i+j>=n*2)
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
	}
	
	System.out.println("----------------------------");
	
	
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n*2-1;j++)
		{
			if(i+j<=n+1||j-i>=n-1)
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
	}
	
	System.out.println("--------------------");
	System.out.println("----------------------");
	
	for(int i=1;i<=n*2-1;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(i+j>=n+1&&i-j<=n-1)
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
	}
	
	
	System.out.println("--------------------");

	for(int i=1;i<=n*2-1;i++)
	{
		for(int j=1;j<=n*2-1;j++)
		{
			if(i>=j&& i+j<=n*2|| i+j>=n*2&&j-i>=0)
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
	}
	System.out.println("------------------------------");
	
	
	for(int i=1;i<=n*2-1;i++)
	{
		for(int j=1;j<=n*2-1;j++)
		{
			if(i+j<=n+1||j-i>=n-1||i-j>=n-1||i+j>=11)
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
	}
	}
}
