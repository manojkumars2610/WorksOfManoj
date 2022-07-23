package com.manoj.learning.leetCode.linkedlist;

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

	public void remove(int val) {
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
		if(null== head) {
			return null;
		}
		ListNode temp = head;
		head = head.next;
		temp.next=null;
		
		return temp;
	}
	
	private ListNode removelast() {
		ListNode current = this.head;
		ListNode previous = null;
		if(head == null || head.next==null) {
			head=null;
			return head;
		}
		while (current.next != null) {
			previous = current;
			current= current.next;			
		}
		
		previous.next=null;

		return current;
		
	}

	public void printList() {
		ListNode current = this.head;
		while (current != null) {
			System.out.println(current.val);
			current = current.next;
		}
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

		ll.add(5);
//		ll.add(6);
//		ll.add(7);
//		ll.addInBetween(14, 2);
//		ll.addInBetween(1, 1);
//		ll.addInBetween(2, 2);
//		ll.addInBetween(99, 7);
//		ll.removeFirst();
		
		
		ll.removelast();
		
		ll.printList();
	}

}
