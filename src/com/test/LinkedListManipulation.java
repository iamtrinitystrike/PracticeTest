package com.test;

public class LinkedListManipulation {
	

}
class Node
{
	
	Node next;
	int data;
	
	Node(int d)
	{
		this.data=d;
		next=null;
	}
	
	void appednTotail(int d)
	{
		Node end=new Node(d);
		Node n=this;
		while(n.next!=null)
		{n=n.next;}
		n.next=end;
	}
	
	
	

Node deleteNode(Node head,int d)
{
	Node n=head;
	if(n.data==d)
	{
		return head.next;
	}
	
	while(n.next!=null)
	{
		if(n.next.data==d)
		{
			n.next=n.next.next;
			return head;
		}
		n=n.next;
	}
	return n;
}
}
