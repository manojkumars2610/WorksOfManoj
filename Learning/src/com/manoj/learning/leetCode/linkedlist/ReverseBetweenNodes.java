package com.manoj.learning.leetCode.linkedlist;

public class ReverseBetweenNodes {
	 public ListNode reverseBetween(ListNode head, int left, int right) {
		 
 ListNode point=head, slow=head;
		 
 		int n=(left+right)/2, count=0;
		 while(point!=null && point.next!=null) {
//			 point=fast.next.next;
			 if(count==left) {
				 ListNode temp = point;
				 ListNode jump = point.next.next;
				 point.next=point.next.next;

			 
			 }
			 
			 count++;
			 
			 point=point.next;
			 
		 }
		return slow;
	    }

	public static void main(String[] args) {
		
		MyLinkedList ll = MyLinkedList.createList()	;	
		
		ll.printList();
		
		ReverseBetweenNodes myObj = new ReverseBetweenNodes();
		myObj.reverseBetween(ll.head, 2, 4);
	}

}
