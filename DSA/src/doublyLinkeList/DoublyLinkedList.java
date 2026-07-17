package doublyLinkeList;

public class DoublyLinkedList
{
	Node head=null;
	void addFirst(int data)
	{
		Node newNode = new Node(data);
		if(head==null)
		{
			head=newNode;
			return;
		}
		newNode.next=head;
		head.prev=newNode;
		head=newNode;
	}
	void addLast(int data)
	{
		if(head==null)
		{
			addFirst(data);
			return;
		}
		Node newNode= new Node(data);
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=newNode;
		newNode.prev=temp;
	}
	void insertIndex(int index, int data)
	{
		if(index<0)
		{
			System.out.println("Enter a valid index");
			return;
		}
		if(index==0)
		{
			addFirst(data);
			return;
		}
		Node newNode = new Node(data);
		Node temp=head;
		int count=0;
		while(temp.next!=null && count<index)
		{
			count++;
			temp=temp.next;
		}
		if(temp.next==null)
		{
			System.out.println("Enter a valid index");
			return;
		}
		newNode.prev=temp;
		temp.next=newNode;
		newNode.next=temp.next.next;
		temp.next.prev=temp.next;
	}
	void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"-> ");
			temp=temp.next;
		}
		System.out.print("null");
	}
}
