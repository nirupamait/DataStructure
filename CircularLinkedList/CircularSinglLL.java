package com.ds.CircularList;

public class CircularSinglLL {
	
	public Node head;
	public Node tail;
	
	public int size;
	
	public Node createSingleLL(int nodeValue)
	{
		Node node=new Node();
		node.value=nodeValue;
		node.next=node;
		head=node;
		tail=node;
		size=1;
		return node;
		
		
	}
	
	public void insertCSLL(int nodeValue, int location)
	{
		Node node=new Node();
		node.value=nodeValue;
		
		if(head==null)
		{
			createSingleLL(nodeValue);
			return ;
		}
		else if(location==0)
		{
			node.next=head;
			head=node;
			tail.next=head;	
			
		}
		else if(location>=size)
		{
			tail.next=node;
			tail=node;
			node.next=head;
			
		}
		else {
			Node tempNode=head;
			for(int index=0;index<location-1;index++)
			{
				tempNode=head.next;
				index++;
				
			}
			node.next=tempNode.next;
			tempNode.next=node;
		}
		size++;
		
	}
	
	public void traverseCLL()
	{
		if(head!=null)
		{
			Node tempNode=head;
			for(int i=0;i<size;i++)
			{
				System.out.print(tempNode.value);
				if(i!=size-1)
				{
					System.out.print("-->");
				}
				tempNode=tempNode.next;
			}
			System.out.println("\n");
			
		}
		else {
			System.out.println("CLL Doesnot exist");
		}
	}
	
	public boolean searchNode(int nodeValue)
	{
		if(head!=null)
		{
		Node tempNode=head;
		for(int i=0;i<size;i++)
		{
			if(tempNode.value==nodeValue){
				System.out.println("Value found at location "+ i);
				return true;
			}
			tempNode=tempNode.next;
		}
		
		
		}
		System.out.println("Value not found");
		return false;
	}
	
	public void deleteNode(int loc)
	{
		if(head==null)
		{
			System.out.println("The Circular LL does not exist");
		}
		else if(loc==0)
		{
			head=head.next;
			tail.next=head;
			size--;
			if(size==0)
			{
				tail=null;
				head.next=null;
				head=null;
			}
		}
		else if(loc>=size)
		{
			Node temNode=head;
			for(int i=0;i<size-1;i++)
			{
				temNode=head.next;
			}
			if(temNode==head)
			{
				temNode.next=null;
				tail=head=null;
				size--;
			}
			temNode.next=head;
			tail=temNode;
			size--;
		}
		else {
			Node tempNode=head;
			for(int i=0;i<loc-1;i++)
			{
				tempNode=head.next;
			}
			tempNode.next=tempNode.next.next;
			size--;
		}
	}

}
