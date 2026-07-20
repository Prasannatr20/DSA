package doublyLinkeList;

public class DoublyLinkedList
{
	Node head=null;
	int size=0;
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
		int currentSize= size();
		if(index<0|| index>currentSize)
		{
			System.out.println("Enter a valid index");
			return;
		}
		if(index==0|| head ==null)
		{
			addFirst(data);
			return;
		}
		Node newNode = new Node(data);
		Node temp=head;
		int count=0;
		while(temp.next!=null && count<index-1)
		{
			count++;
			temp=temp.next;
		}
		if(temp.next==null)
		{
			temp.next=newNode;
			newNode.prev=temp;
			return;
		}
		newNode.prev=temp;
		newNode.next=temp.next;
		temp.next.prev=newNode;
		temp.next=newNode;
	}
	void delete(int data)
	{
		if(head==null)
		{
			System.out.println("No values to delete");
			return;
		}
		if(head.data==data)
		{
			head=head.next;
			head.prev=null;
			return;
		}
		Node temp=head;
		
		while(temp.next!=null && data!=temp.next.data)
		{
			
			temp=temp.next;
			
		}
		if(temp.next==null)
		{
			System.out.println("Entered value is not present in list");
			return;
		}
		temp.next=temp.next.next;
		temp.next.next.prev=temp;		
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
	int size()
	{
		size=0;
		Node temp=head;
		while(temp!=null)
		{
			size++;
			temp=temp.next;
		}
		return size;
	}
}
