package dataStructers;

import java.util.ArrayList;

public class PractiseArrayList {

	public static void main(String[] args)
	{
		//heterogeneous
		ArrayList a1= new ArrayList();
		a1.add("Apple");
		a1.add(100);
		a1.add("Banana");
		System.out.println(a1);
		a1.add(0, "Fruits");
		a1.set(1, "Mango");
		a1.add(50);
		System.out.println(a1);
		a1.remove("Fruits");
		a1.remove(0);
		System.out.println(a1);
		//Homogeneous
		ArrayList<Integer> a2= new ArrayList<>();
		a2.add(1);
		a2.add(12);
		a2.add(15);
		a2.add(16);
		a2.add(15);
		a2.addAll(a1);
		System.out.println("a1"+ " "+a1);
		System.out.println("a2"+ " "+a2);
	}

}
