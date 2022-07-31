package com.manoj.learning.datastructures.linkedlist;

import java.util.LinkedList;

public class FindMiddleLinkedList {

	 public static ListNode findMiddleNode(ListNode head) {
		 ListNode fast=head, slow=head;
		 
		 while(fast!=null && fast.next!=null) {
			 fast=fast.next.next;
			 slow=slow.next;
		 }
		return slow;
	        
	    }
	public static void main(String[] args) {
		MyLinkedList myList = new MyLinkedList();
		
		for(int i=0 ; i <=9; i++) {
			myList.add(i);
		}

		myList.printListFromHead(myList.head);

		ListNode middleNode = findMiddleNode(myList.head);

		myList.printListFromHead(middleNode);



	}

}


