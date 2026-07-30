package recursionn;

public class StackHeight {

	//Height of stack in x^n. Stack height = n
	public static void main(String[] args)
	{
		System.out.println(height(3, 8));
	}
	static int height(int x, int n)
	{
		if(x==0 || x==1) return 1;
		if(n==0) return 1;
		int a= height(x, n-1);
		a=x*a;
		return a;
	}

}
