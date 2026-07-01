package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

	public static void main(String[] args)
	{
		/*
		 Given an string of arrays and we have to group all the anagrams in one list.
		 If string is empty return empty string
		 */
		System.out.println(GroupAnagram.groupAnagrams(new String[] {"eat","tea","tan","ate","nat","bat"}));
	}
	public static List<List<String>> groupAnagrams(String[] strs)
	{
		if(strs.length==0) return new ArrayList();
		
		Map<String, List> map = new HashMap<>();
		int[] arr = new int[26];
		for(String s:strs)
		{
			Arrays.fill(arr, 0);
			for(char c:s.toCharArray())
			{
				arr[c-'a']++;
			}
			StringBuilder sb= new StringBuilder("");
			for(int i=0;i<arr.length;i++)
			{
				sb.append("#");
				sb.append(arr[i]);
			}
			String key = sb.toString();
			if(!map.containsKey(key)) map.put(key, new ArrayList());
			map.get(key).add(s);
		}
		return new ArrayList(map.values());
	}

}
