package number;

public class Fibonacci {

	public static void main(String[] args)
	{
		int firstNum=0, secondNum=1;
		int nextNum;
		for(int i=0;i<11;i++)
		{
			System.out.print(firstNum);
			if(i<10) System.out.print(", ");
			nextNum=firstNum+secondNum;
			firstNum= secondNum;
			secondNum= nextNum;
		}
	}

}
