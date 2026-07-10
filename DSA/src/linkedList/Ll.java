package linkedList;

public class Ll
{
	Node head= null;
	void addFirst(int data)
	{
		Node newNode= new Node(data);
		newNode.next= head;
		head=newNode;
	}
	void addLast(int data)
	{
		if(head==null)
		{
			addFirst(data);
			return;
		}
		Node newNode = new Node(data);
		Node temp= head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=newNode;
	}
	void add(int index, int data)
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
		Node temp=head;
		for(int i=0;i<index-1;i++)
		{
			temp=temp.next;
		}
		Node newNode= new Node(data);
		newNode.next=temp.next;
		temp.next=newNode;	
	}
	void deleteIndex(int index)
	{
		Node temp=head;
		for(int i=0;i<index-2;i++)
		{
			temp=temp.next;
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
		System.out.print("null");
	}
}
