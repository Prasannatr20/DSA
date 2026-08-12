package hashSet;

import java.util.HashSet;

public class HashSetDemo
{
	public static void main(String[] args)
	{
		HashSet set1= new HashSet(); //Generic hashSet, initial -16, load factor=0.75
		HashSet set2 = new HashSet(100); //Generic, initial -100, load factor=0.75
		HashSet set3 = new HashSet(100, (float)0.80); //initial 100, load factor=0.80
		HashSet<Integer> set4 = new HashSet<>(); //initial 16, load factor=0.75, Integer(Not generic)
		set4.add(1);
		set4.add(2);
		set4.add(3);
		set4.add(4);
		set4.add(4);
		System.out.println(set4);
		if(set4.contains(4))
			System.out.println("Contains");
		else System.out.println("No");
		System.out.println(set4.size()+" Set 4");
		System.out.println(set3.size()+" Set 3");
		System.out.println(set4.isEmpty());
		set4.remove(4);
		set4.removeAll(set4);
		System.out.println(set4.isEmpty());
	}
}
