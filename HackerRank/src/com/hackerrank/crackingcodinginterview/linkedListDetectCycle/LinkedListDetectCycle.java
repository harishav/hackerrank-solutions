package com.hackerrank.crackingcodinginterview.linkedListDetectCycle;

/**
 * Solution for LinkedLists: Detect a cycle in the loop
 * Category: Cracking the coding interview
 * 
 * {@link https://www.hackerrank.com/challenges/ctci-linked-list-cycle/problem}
 * 
 * @author harishav
 *
 */
public class LinkedListDetectCycle {

	public static void main(String[] args) {

		LinkedList linkedList = new LinkedList();
		linkedList.head = new Node(10);
		linkedList.head.next = new Node(20);
		linkedList.head.next.next = new Node(30);
		linkedList.head.next.next.next = new Node(40);
		linkedList.head.next.next.next.next = linkedList.head.next;
		
		System.out.println(linkedList.hasCycle(linkedList.head));

		Node current = linkedList.head;
		do {
			System.out.println(current.data);
			current = current.next;
		} while (current!=null);
		
	}

}
