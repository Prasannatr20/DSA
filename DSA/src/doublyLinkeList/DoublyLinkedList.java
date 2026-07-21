package doublyLinkeList;

public class DoublyLinkedList
{
	Node head=null;
	Node tail=null;
	int size=0;
	void addFirst(int data)
	{
		Node newNode = new Node(data);
		if(head==null)
		{
			head=tail=newNode;
			return;
		}
		newNode.next=head;
		head.prev=newNode;
		head=newNode;
	}
	void addLast(int data)
	{
		if(tail==null)
		{
			addFirst(data);
			return;
		}
		Node newNode= new Node(data);
		newNode.prev=tail;
		tail.next=newNode;
		tail=newNode;
	}
	void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"-> ");
			temp=temp.next;
		}
		System.out.println("null");
	}
}
