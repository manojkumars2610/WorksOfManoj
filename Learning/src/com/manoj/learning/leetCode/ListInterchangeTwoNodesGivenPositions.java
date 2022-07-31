package com.manoj.learning.leetCode;


import com.manoj.learning.datastructures.linkedlist.ListNode;
import com.manoj.learning.datastructures.linkedlist.MyLinkedList;

public class ListInterchangeTwoNodesGivenPositions {

    public void interChangeNodes(ListNode head, int left, int right){
    ListNode current=head;
    ListNode lptr=head, rptr=head;
    int count=1;
    while(current !=null){
        System.out.println("current = "+current.val);
        if (count == left-1){
            lptr=current;
        }
        if (count == right - 1) {
            rptr = current;
            break;
        }
        count++;
        current = current.next;
    }

        ListNode leftAdj = lptr.next;
        ListNode rightAdj = rptr.next;
        ListNode leftAft = leftAdj.next;
        ListNode rightAft = rightAdj.next;

        System.out.println("Left val=" + lptr.val + " Left adj = " + lptr.next.val);
        System.out.println("Right val=" + rptr.val + " Right adj = " + rptr.next.val);

        lptr.next = rightAdj;
        lptr = lptr.next;
        lptr.next = leftAft;

        rptr.next = leftAdj;
        rptr = rptr.next;
        rptr.next = rightAft;

    }
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ListInterchangeTwoNodesGivenPositions myObj = new ListInterchangeTwoNodesGivenPositions();
        ll.add(1);
        ll.add(5);
        ll.add(3);
        ll.add(4);
        ll.add(2);
        ll.add(6);

        myObj.interChangeNodes(ll.head, 2, 5);

        ll.printListFromHead(ll.head);
    }
}
