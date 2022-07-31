package com.manoj.learning.leetCode;


import com.manoj.learning.datastructures.linkedlist.ListNode;
import com.manoj.learning.datastructures.linkedlist.MyLinkedList;

public class LinkedListReversalNodes {

    public void reverseNodes(ListNode head, int left, int right, MyLinkedList ll){
    ListNode current=head;
    ListNode lptr=head, rptr=head;
    int count=1;
    while(current !=null){
        System.out.println("current = "+current.val);
        if (count <left-1){
            lptr=lptr.next;

        }
        if (count <right-1){
            rptr=rptr.next;

        }
        count++;
        current=current.next;

    }
        System.out.println("Left val="+lptr.val + " Left adj = "+ lptr.next.val);
        System.out.println("Right val="+rptr.val + " Right adj = "+ rptr.next.val);
        current = lptr;
        lptr.next=rptr.next;
//        rptr.next=current.next;

    }
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        LinkedListReversalNodes myObj = new LinkedListReversalNodes();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        myObj.reverseNodes(ll.head, 2, 4, ll);

        ll.printListFromHead(ll.head);
    }
}
