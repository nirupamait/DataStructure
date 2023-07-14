package com.ds.CircularList;

public class MainCircularLL {

	public static void main(String[] args) {
		CircularSinglLL csll = new CircularSinglLL();
	    csll.createSingleLL(5);
	    csll.insertCSLL(4, 0);
	    csll.insertCSLL(6, 1);
	    csll.insertCSLL(7, 8);
    csll.traverseCLL();
    csll.searchNode(7);
	    csll.deleteNode(1);
	    csll.traverseCLL();
	    
	   // System.out.println(csll.head.value);

	}

}
