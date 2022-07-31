package com.manoj.learning.leetCode;

import com.manoj.learning.datastructures.linkedlist.ListNode;
import com.manoj.learning.datastructures.linkedlist.MyLinkedList;

public class SwappingNodesLinkedList1721 {

    public static ListNode swapNodes(ListNode head, int k) {

        ListNode left= head;
        ListNode rigt= head;
        ListNode current= head;
        ListNode lnode=null,lAft=null;
        int count=1;

        while (count <= k+1 ){
            if(count < k-1)
                left=left.next;
            else if (count == k) {
                current = left.next;
                lnode = current;
            }
            else if ( count == k+1) {
                rigt = head;
                current = current.next;
                lAft=current;
            }
            count++;
        }
        while (current.next != null ){
            rigt=rigt.next;
            current=current.next;
        }


        rigt = rigt.next;
        System.out.println("Printing Right");

//        lnode.next=rAft;
//        rnode.next=lAft;
        System.out.println("Left :" +lnode.val);
        System.out.println("Right :"+ rigt.val);

        int temp=lnode.val;
        lnode.val=rigt.val;
        rigt.val=temp;
//        System.out.println("current :"+ current.val);


//        temp.printListFromHead(lnode);
//        temp.printListFromHead(rnode);

/*
        left.next=rnode;
        rnode.next = lAft;

        rigt.next = lnode;
        lnode.next=rAft;*/

return head;

    }
    public static void main(String[] args) {
        MyLinkedList list= new MyLinkedList();
//
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
//                list.add(7);
//                list.add(9);
//                list.add(6);
//                list.add(6);
//                list.add(7);
//                list.add(8);
//                list.add(3);
//                list.add(0);
//                list.add(9);
//                list.add(5);

        list.printListFromHead(list.head);

        swapNodes(list.head,7);

        list.printListFromHead(list.head);
    }
}
