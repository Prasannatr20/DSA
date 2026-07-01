package array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args)
	{
		int[] arr= {2,3,21,34,76};
		int tar= 55;
		int[] result= TwoSum.twoSum(arr, tar);
		for(int i:result)
		{
			System.out.println(i);
		}
	}
	static int[] twoSum(int[] arr, int tar)
	{
		Map<Integer, Integer> map= new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			int comp = tar-arr[i];
			if(map.containsKey(comp)) return new int[] {map.get(comp),i};
			else map.put(arr[i],i);
		}
		return null;
	}

}
