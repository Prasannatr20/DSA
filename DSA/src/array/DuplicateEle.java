package array;

import java.util.HashSet;

public class DuplicateEle {

	public static void main(String[] args)
	{
		int[] arr= {6,2,3,4,6,5};
		System.out.println(DuplicateEle.duplicate(arr));
	}
	static boolean duplicate(int[] arr)
	{
		HashSet<Integer> map= new HashSet<>();
		for(int i: arr)
		{
			if(map.contains(i)) return true;
			map.add(i);
		}
		return false;
	}

}
