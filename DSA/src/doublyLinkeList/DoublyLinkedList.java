package doublyLinkeList;

public class DoublyLinkedList
{
	Node head=null;
	Node tail=null;
	int size=0;
	int size()
	{
		return this.size;
	}
	void addFirst(int data)
	{
		Node newNode = new Node(data);
		if(head==null)
		{
			head=tail=newNode;
			size++;
			return;
		}
		newNode.next=head;
		head.prev=newNode;
		head=newNode;
		size++;
	}
	void addLast(int data)
	{
		if(tail==null)
		{
			addFirst(data);
			size++;
			return;
		}
		Node newNode= new Node(data);
		newNode.prev=tail;
		tail.next=newNode;
		tail=newNode;
		size++;
	}
	void insert(int index, int data)
	{
		if(index<0)
		{
			System.out.println("Enter a valid index");
			return;
		}
		if(head==null || index==0)
		{
			addFirst(data);
			return;
		}
		if(index>size())
		{
			System.out.println("Enter a valid data");
			return;
		}
		Node newNode = new Node(data);
		size++;
		Node temp=head;
		int count=0;
		while(temp.next!=null && count<index-1)
		{
			temp=temp.next;
			count++;
		}
		if(temp.next==null)
		{
			addLast(data);
			return;
		}
		newNode.prev=temp;
		newNode.next=temp.next;
		temp.next=temp.next.prev=newNode;
	}
	void deleteFirst()
	{
		if(head==null)
		{
			System.out.println("No nodes to delete");
			return;
		}
		if(head==tail)
		{
			head=tail=null;
			size--;
			return;
		}
		Node temp=head;
		head=head.next;
		head.prev=null;
		temp.next=null;
		size--;
	}
	void deleteLast()
	{
		if(head==null)
		{
			System.out.println("No nodes to delete");
			return;
		}
		if(head==tail)
		{
			head=tail=null;
			size--;
			return;
		}
		Node temp=tail;
		tail=tail.prev;
		temp.prev=null;
		tail.next=null;
		size--;
	}
	void deleteIndex(int index)
	{
		if(index<0 || index>=size())
		{
			System.out.println("Enter a valid index");
			return;
		}
		if(head==null)
		{
			System.out.println("No data to delete");
			size--;
			return;
		}
		if(head==tail)
		{
			head=tail=null;
			size--;
			return;
		}
		if(index==0)
		{
			deleteFirst();
			return;
		}
		int count=0;
		Node temp=head;
		while(temp!=null && count!=index)
		{
			count++;
			temp=temp.next;
		}
		if(temp==tail)
		{
			deleteLast();
			return;
		}
		temp.prev.next=temp.next;
		temp.next.prev=temp.prev;
		temp.prev=null;
		temp.next=null;
		size--;
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
