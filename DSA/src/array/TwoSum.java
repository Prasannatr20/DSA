package array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args)
	{
		int[] arr= {2,3,21,34,76};
		int[] result= TwoSum.twoSum(arr);
		for(int i:result)
		{
			System.out.println(i);
		}
	}
	static int[] twoSum(int[] arr)
	{
		Map<Integer, Integer> map= new HashMap<>();
		int target=55;
		for(int i=0;i<arr.length;i++)
		{
				int n=target- arr[i];
				if(!map.containsKey(n))
				{
					map.put(arr[i], i);
				}
				else
				{
					return new int[] {map.get(n), i};
				}
		}
		return null;
	}

}
