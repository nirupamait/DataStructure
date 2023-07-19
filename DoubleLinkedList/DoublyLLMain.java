package com.ds.DoublyList;

public class DoublyLLMain {

	public static void main(String[] args) {
		DoublyLinkedList ddLL=new DoublyLinkedList();
		ddLL.createDoublyLL(16);
		
		ddLL.insertDLL(3, 0);
		ddLL.insertDLL(5, 1);
		ddLL.insertDLL(7, 2);
		ddLL.insertDLL(9, 7);
//		

		ddLL.traverseDLL();
		//ddLL.deleteNode(1);
		ddLL.deleteDLL();
		//ddLL.reverseDLL();
		//ddLL.searchNode(9);
		ddLL.traverseDLL();

	}

}
