package recursionn;

public class PrintSomethingNTimes {

	public static void main(String[] args)
	{
		hi(5);
	}
	static void hi(int count)
	{
		System.out.println("Hi!");
		if(count<=1) return;
		hi(count-1);
	}
}
