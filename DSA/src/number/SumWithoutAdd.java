package number;

public class SumWithoutAdd {

	public static void main(String[] args)
	{
		int a=0, b=0,min=0,max=0;
		 if(a>=b)
		 {
			 max=a;
			 min=b;
		 }
		 else
		 {
			 max=b;
			 min=a;
		 }
		 while(min>0)
		 {
			 max++;
			 min--;
		 }
		 System.out.println(max);
	}

}
