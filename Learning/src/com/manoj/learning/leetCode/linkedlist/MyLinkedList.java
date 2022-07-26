package com.manoj.learning.leetCode.linkedlist;

import java.util.LinkedList;
import java.util.Stack;

public class MyLinkedList {

    public ListNode head = null;

    public void add(int data) {
        ListNode newNode = new ListNode(data);

        if (head == null) {
            head = newNode;
        } else {
            ListNode current = this.head;
            while (null != current.next) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void addFirst(int val) {
        ListNode node = new ListNode(val);
        node.next = this.head;
        head = node;
    }

    public void addInBetween(int data, int pos) {
        ListNode newNode = new ListNode(data);
        ListNode current = this.head;
        int count = 1;

        if (head == null && pos==1)
            head= newNode;

        while (current != null) {
            if (pos == 1) {
                head = newNode;
                newNode.next = current;
                break;
            }
            if (count == pos - 1) {
                newNode.next = current.next;
                current.next = newNode;
                break;
            }
            current = current.next;
            count += 1;
        }
    }

    public ListNode remove() {
        ListNode current = this.head;
        ListNode previous = null;
        if ((head == null) || (head.next == null)) {
            head=null;
            return current;
        }
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next=null;
        return current;
    }

    public void removeValueFromList(int val) {
        ListNode current = this.head;
        while (current != null) {
            if (head.val == val) {
                head = current.next;
                break;
            }
            if ((current.next != null) && (current.next.val == val)) {
                current.next = current.next.next;
                break;
            }
            current = current.next;
        }
    }

    private ListNode removeFirst() {
        if (null == head)
            return null;

        ListNode temp = head;
        head = head.next;
        temp.next = null;

        return temp;
    }

    private ListNode removeLast() {
        ListNode current = this.head;
        ListNode previous = null;
        if (head == null || head.next == null) {
            head = null;
            return head;
        }
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null;

        return current;
    }

    private ListNode removeAtPos(int pos) {
        ListNode current = this.head;
        ListNode previous = null;
        int count = 1;
        if (head == null || head.next == null) {
            head = null;
            return head;
        }
        if (pos == 1) {
            head = head.next;
        }
        while (count <= pos) {
            if (pos == count) {
                previous.next = current.next;
                break;
            }
            previous = current;
            current = current.next;
            count++;
        }
//		if (current.next == null && pos == count) {
//			previous.next=null;
//		}
        return current;
    }

    private boolean find(int data){
        ListNode current= head;
        while(current!= null){
            if(current.val == data)
                return true;
            current=current.next;
        }
        return false;
    }
    public void printList() {
        ListNode current = this.head;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }

    public void printListFromHead(ListNode head) {
        ListNode current = head;
        while (current != null) {
//            System.out.print(current.val+"\t");
            current = current.next;
        }
    }

    @Override
    public String toString() {

        StringBuilder str = new StringBuilder();
        ListNode current = this.head;
        while (current != null) {
            str.append(current.val).append(" ");
            current = current.next;
        }
        return str.toString();
    }

    public static MyLinkedList createList() {
        MyLinkedList ll = new MyLinkedList();

        ll.head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
//		ListNode six = new ListNode(6);

        ll.head.next = second;
        second.next = three;
        three.next = four;
        four.next = five;

        return ll;
    }

 /*   public void reversing(ListNode prev, ListNode current){

        while(current.next != null){
            prev=current;
            current=current.next;
            reversing(prev,current);
            break;
        }

        if (current.next == null)
            System.out.println("Printing value of the node : " + current.val);
        current.next=prev;
        prev.next=null;

    }*/
    /*public void reverseList(ListNode head){
    //Worst solution
        if( head == null || head.next == null)
            return;
        Stack<Integer> temp= new Stack<>();
        ListNode current = head;
        while(current!= null){
            temp.push(current.val);
            current=current.next;
        }
        current=head;
        while(current!= null){
            current.val=temp.pop();
            current=current.next;
        }
    }*/

    public ListNode reverseList(ListNode head){
        ListNode nxt= null, prev = null;
        ListNode current=head;

        while (current!= null){
            nxt = current.next;
            current.next = prev;
            prev = current;
            current = nxt;
            head= prev;
            this.printListFromHead(head);
        }

        return prev;
    }
    public static void main(String[] args) {

        MyLinkedList ll = new MyLinkedList();
//		MyLinkedList ll = MyLinkedList.createList();

//		ll.printList();

//		ll.addNode(6);
//		ll.addInBetween(55, 0);
//		ll.printList();
//		System.out.println("Delete node *******");
//		ll.remove(6);
//		ll.printList();

//		ll.addFirst(15);
//		ll.addFirst(14);
//		ll.addFirst(13);
//		ll.addFirst(12);
//		ll.addFirst(11);
//		ll.addFirst(10);

//        ll.add(5);
//        ll.add(6);
//        ll.add(7);
//        ll.addInBetween(14, 2);
        ll.addInBetween(1, 1);
        ll.addInBetween(2, 2);
        ll.addInBetween(3, 3);
        ll.addInBetween(4, 4);
//        ll.addInBetween(99, 7);
////		ll.removeFirst();

//		ll.removeLast();

//		ll.printList();
//        System.out.println(ll.toString());
//        System.out.println("The element removed is " + ll.removeAtPos(7).val);
//        if(ll.remove()==null) System.out.println("The list is empty");
//        System.out.println("The element removed is " + ll.remove().val);

        System.out.println(ll.toString());
        ll.head=ll.reverseList(ll.head);
//        System.out.println("Find result == "+ll.find(6));
        System.out.println("After Revers : \t"+ll.toString());
        System.out.println("Head ="+ll.head.val);
        ll.printListFromHead(ll.head);
    }


}
