package linkedList;

import java.util.LinkedList;

public class Demo {

	public static void main(String[] args) 
	{
		int count=0;
		String str= "abhaaabbhaaki";
		for(int i=0;i<10;i++)
		{
			if(str.charAt(i)=='a')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
