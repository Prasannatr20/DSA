package array;

import java.util.Arrays;

public class Zigzag {

	public static void main(String[] args)
	{
		int[] a= {1,3,5};
		int[] b= {2,4,6};
		int[] res=Zigzag.zigzag(a, b);
		System.out.println(Arrays.toString(res));
	}
	public static int[] zigzag(int[] a, int[] b)
	{
		int[] c=new int[a.length+b.length];
		int m=0, n=0;
		for(int i=0;i<c.length;i++)
		{
			if(i%2==0) c[i]=a[m++];
			else c[i]=b[n++];
		}
		return c;
	}

}
