package linkedList;

public class Main {

	public static void main(String[] args)
	{
		Ll list = new Ll();
		for(int i=5;i>0;i--)
		{
			list.addFirst(i);
		}
		for(int i=6;i<11;i++)
		{
			list.addLast(i);
		}
		list.add(10,11);
		list.display();
	}

}
