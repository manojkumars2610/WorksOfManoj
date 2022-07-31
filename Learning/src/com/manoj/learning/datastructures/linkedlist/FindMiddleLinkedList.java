package com.manoj.learning.datastructures.linkedlist;

import java.util.LinkedList;

public class FindMiddleLinkedList {

	 public ListNode middleNode(ListNode head) {
		 ListNode fast=head, slow=head;
		 
		 while(fast!=null && fast.next!=null) {
			 fast=fast.next.next;
			 slow=slow.next;
		 }
		return slow;
	        
	    }
	public static void main(String[] args) {
		LinkedList<Integer> myList = new LinkedList<Integer>();
		
		for(int i=0 ; i <=20; i++) {
			myList.add(i);
		}
		
		

	}

}


