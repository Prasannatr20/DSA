package number;

public class Div {

	public static void main(String[] args)
	{
		int dividend=22, divisor=6;
		if(divisor==0)
		{
			System.out.println("not valid");
			return;
		}
		boolean negative=(dividend<0 != divisor<0);
		if(dividend<0) dividend = -dividend;
		if(divisor<0) divisor = -divisor;
		int quo=0;
		while(divisor<=dividend)
		{
			dividend=dividend-divisor;
			quo++;
		}
		if(negative) quo=-quo;
		System.out.println(quo+" quo");
		System.out.println(dividend+" rem");
	}

}
