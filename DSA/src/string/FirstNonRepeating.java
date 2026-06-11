package string;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeating {

	public static void main(String[] args)
	{
		String str="ammazon";
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++)
		{
			char ch= str.charAt(i);
			if(map.get(ch)==null)
			{
				map.put(ch, 1);
			}
			else
			{
				map.put(ch, map.get(ch)+1);
			}
		}
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(map.get(ch)==1)
			{
				System.out.println(i+" "+ ch);
				return;
			}
		}
		System.out.println("no");
	}

}
