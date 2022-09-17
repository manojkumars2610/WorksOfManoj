package com.manoj.learning.leetCode;

import com.manoj.learning.datastructures.linkedlist.ListNode;
import com.manoj.learning.datastructures.linkedlist.MyLinkedList;

import java.util.ArrayList;
import java.util.List;

public class SwappingNodesLinkedList1721 {

    public static ListNode swapNodes(ListNode head, int k) {

        ListNode left= head;
        ListNode rigt= head;
        ListNode current= head;
        int count=1;

        while (count <= k + 1) {
            if (count == k) {
                left = current;
                current = current.next;
                rigt = head;
                break;
            }
            current = current.next;
            count++;
        }

        List<Integer> l = new ArrayList<Integer>();
        while (current.next != null ){
            rigt=rigt.next;
            current=current.next;
            System.out.println( "Right = "+rigt.val);
            System.out.println( "Current = "+current.val);
        }

        int temp=left.val;
        left.val=rigt.val;
        rigt.val=temp;

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

        swapNodes(list.head,3);

        list.printListFromHead(list.head);
    }
}
