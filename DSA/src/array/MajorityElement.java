package array;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args)
	{
		int [] nums= {1,2,3,2,2,2,2,2};
		System.out.println(majorityElements(nums));
	}
	public static int majorityElements(int[] nums)
	{
		Map<Integer,Integer> map= new HashMap<>();
		for(int i: nums)
		{
			if(!map.containsKey(i)) map.put(i, 1);
			else map.put(i, map.get(i)+1);
		}
		return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
	}

}
