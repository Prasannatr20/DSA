package linkedList;

public class Ll
{
	Node head =null;
	
	void addFirst(int data)
	{
		Node newNode = new Node(data);
		newNode.next=head;
		head=newNode;
	}
	void addLast(int data)
	{
		if(head==null)
		{
			addFirst(data);
			return;
		}
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		Node newNode= new Node(data);
		temp.next=newNode;
	}
	void add(int index, int data)
	{
		if(index<0)
		{
			System.out.println("Enter a valid index");;
			return;
		}
		int count=0;
		Node temp= head;
		try
		{
			while(count<index-1)
			{
				temp=temp.next;
				count++;
			}
		}
		catch(Exception e)
		{
			System.out.println("Enter a valid index");
		}
		Node newNode= new Node(data);
		newNode.next=temp.next;
		temp.next=newNode;
	}
	void deleteIndex(int index)
	{
		Node temp = head;
		int count=0;
		if(index==0)
		{
			head=head.next;
			return;
		}
		try
		{
			while(count<index-1)
			{
				temp=temp.next;
				count++;
			}
		}
		catch(Exception e)
		{
			System.out.println("Enter a valid index");
		}
		temp.next=temp.next.next;
	}
	void deleteElement(int data)
	{
		Node temp= head;
		while(temp.next!=null && temp.next.data!=data)
		{
			temp=temp.next;
		}
		if(temp.next==null)
		{
			System.out.println("Enter a valid data");
			return;
		}
		temp.next=temp.next.next;
	}
	void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
}
