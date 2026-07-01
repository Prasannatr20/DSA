package array;

import java.util.HashSet;

public class Duplicate2 {

	public static void main(String[] args)
	{
		/*Leetcode - 219. Given an int array,
		 * return true if two values are same and the 
		 * difference between index of both the numbers(dulicates should be less than or equal to k*/
		//bruteforce
		int[] arr= {1,2,3,1};
		int k=2;
		System.out.println(Duplicate2.duplicate(arr, k));
	}
//	static boolean duplicate(int[] arr, int k)
//	{
//		for(int i=0;i<arr.length-1;i++)
//		{
//			for(int j=i+1;j<arr.length;j++)
//			{
//				if(arr[i]==arr[j] && j-i<=k) return true;
//			}
//		}
//		return false;
//	}
	
	static boolean duplicate(int[] arr, int k)
	{
		HashSet<Integer> set = new HashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			if(set.contains(arr[i])) return true;
			set.add(arr[i]);
			if(set.size()>k) set.remove(arr[i-k]);
		}
		return false;
	}

}
