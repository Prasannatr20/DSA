package linkedList;

public class Ll
{
	Node head;
	void addFirst(int data)
	{
		Node newNode= new Node(data);
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
	void insert(int index, int data)
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
		int count=0;
		while(temp!=null && count<index-1)
		{
			temp=temp.next;
			count++;
		}
		if(temp==null)
		{
			System.out.println("Enter a valid index");
			return;
		}
		Node newNode = new Node(data);
		newNode.next=temp.next;
		temp.next=newNode;
	}
	void deleteIndex(int index)
	{
		if(index<0|| head==null)
		{
			System.out.println("Enter a valid index");
			return;
		}
		if(index==0)
		{
			head=head.next;
			return;
		}
		Node temp=head;
		int count=0;
		while(temp.next!=null&& count<index-1)
		{
			temp=temp.next;
			count++;
		}
		if(temp.next==null)
		{
			System.out.println("Enter a valid index");
			return;
		}
		temp.next=temp.next.next;
	}
	void deleteElement(int data)
	{
		if(head==null)
		{
			System.out.println("Enter a valid data");
			return;
		}
		if(head.data==data)
		{
			head=head.next;
			return;
		}
		Node temp=head;
		while(temp.next!=null && temp.next.data!=data)
		{
			temp=temp.next;
		}
		if(temp.next==null)
		{
			System.out.println("Enter a valid number");
			return;
		}
		temp.next=temp.next.next;
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
	void search(int data)
	{
		if(head==null)
		{
			System.out.println("Linked List is empty");
			return;
		}
		Node temp=head;
		int count=0;
		while(temp!=null)
		{
			if(temp.data==data)
			{
				System.out.println("Index ->"+ count);
				return;
			}
			temp=temp.next;
			count++;
		}
		System.out.println("Element not found");
	}
	void reverse()
	{
		Node prev=null, next=null, curr=head;
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head=prev;
	}
}
