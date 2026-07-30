package recursionn;

public class StackHeightLog {

	//Height=log n 
	public static void main(String[] args)
	{
		System.out.println(stackHeight(2, 5));
	}
	static int stackHeight(int x, int n)
	{
		if(x==0||x==1) return 1;
		if(n==0) return 1;
		if(n%2==0) return stackHeight(x,n/2)* stackHeight(x,n/2);
		else return stackHeight(x, n/2)* stackHeight(x, n/2)*x;
	}

}
