package doublyLinkeList;

public class Main {

	public static void main(String[] args)
	{
		DoublyLinkedList list= new DoublyLinkedList(); 
		list.addFirst(5);
		list.addFirst(4);
		list.addFirst(3);
		list.addFirst(2);
		list.addFirst(1);
		list.addLast(6);
		list.addLast(7);
		list.addLast(8);
		list.addLast(9);
		list.addLast(10);
//		list.insertIndex(10, 50);
// 		System.out.println(list.size());
		list.display();
	}

}
