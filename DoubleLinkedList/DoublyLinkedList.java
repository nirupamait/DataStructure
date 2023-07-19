package com.ds.DoublyList;

public class DoublyLinkedList {
	
	public DoublyNode head;
	public DoublyNode tail;
	
	public int size;
	
	public DoublyNode createDoublyLL(int nodeValue)
	{
		//head=new DoublyNode();
		DoublyNode node=new DoublyNode();
		node.value=nodeValue;
		node.next=null;
		node.prev=null;
		head=node;
		tail=node;
		size=1;
		return head;
		
	}
	
	public void insertDLL(int nodeValue,int location)
	{
		DoublyNode node=new DoublyNode();
		node.value=nodeValue;
		if(head==null)
		{
			createDoublyLL(8);
			return;
			
		}
		else if(location==0)
		{
			node.next=head;
			node.prev=null;
			head.prev=node;
			head=node;
	
		}
		else if(location>=size)
		{
			node.next=null;
			
			tail.next=node;
			node.prev=tail;
			tail=node;
		}
		else {
			DoublyNode nodeTemp=head;
			int index = 0;
		      while (index < location-1) {
		    	  nodeTemp = nodeTemp.next;
		        index++;
		      }
			node.next=nodeTemp.next;
			node.prev=nodeTemp;
			nodeTemp.next=node;
			node.next.prev=node;
			
			
		}
		size++;
		
		
	}
	
	
	//Traverse Doubly Linked List
	public void traverseDLL()
	{
		if(head!=null)
		{
		DoublyNode tempNode=head;
	
		for(int i=0;i<size;i++)
		{
			System.out.print(tempNode.value);
			if(i!=size-1)
			{
				System.out.print("--->>--");
			}
			tempNode=tempNode.next;
		}
		System.out.println("\n");
		} else {
		System.out.println("DLL does not exist");
		
		}
		
	}
	
	public void reverseDLL()
	{
		if(head!=null)
		{
		DoublyNode tempNode=tail;
		//System.out.println(tail.value);
		for(int i=0;i<size;i++)
		{
			System.out.print(tempNode.value);
			if(i!=size-1)
			{
				System.out.print("---<<--");
			}
			tempNode=tempNode.prev;
		}
		}
		 else {
				System.out.println("DLL does not exist");
				
				}
		
	}
	
	//Search Node
	public boolean searchNode(int nodeValue)
	{
		DoublyNode tempNode=head;
		if(head!=null)
		{
		for(int i=0;i<size;i++)
		{
			if(tempNode.value==nodeValue)
			{
				System.out.println("Node found at location :"+i);
				return true;
			}
			tempNode=tempNode.next;
			
		}
	
		}
		else {
			System.out.println("DLL Does not exist ");
		}
		
		return false;
	}
	
	//Delete Node
	public void deleteNode(int location)
	{
		if(head==null)
		{
			System.out.println("DLL does not exist");
			return;
		}
		else if(location==0)
		{
			if(size==0)
			{
				head=null;
				tail=null;
				size--;
				return;
			}
			else {
				head=head.next;
				head.prev=null;
				size--;
			}
		}
		else if(location>=size)
		{
			DoublyNode tempNode=tail.prev;
			if(size==1)
			{
				head=null;
				tail=null;
				size--;
				return;
			}
			else {
				tempNode.next=null;
				tail=tempNode;
				size--;
				return;
			}
		
		}
		else {
			DoublyNode tempNode=head;
			for(int i=0;i<location-1;i++)
			{
				tempNode=tempNode.next;
			}
			tempNode.next=tempNode.next.next;
			tempNode.next.prev=tempNode;
			size--;
		}
	}
	
	public void deleteDLL()
	{
		DoublyNode tempNode=head;
		for(int i=0;i<size;i++)
		{
			tempNode.prev=null;
			tempNode=tempNode.next;
		}
		head=null;
		tail=null;
		System.out.println("DLL Does not exist");
		
	}

}
