package dataStructers;

import java.util.Scanner;

public class Array {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int[] arr1 = new int[5];
		int[] arr2 = {2,1,3,4,5,};
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		for(int i: arr2)
		{
			System.out.println(i);
		}
		for(int i: arr1)
		{
			System.out.println(i);
		}
	}

}
