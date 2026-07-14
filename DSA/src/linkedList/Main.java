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
		list.deleteElement(8);
		list.search(6);
		list.display();
	}

}
