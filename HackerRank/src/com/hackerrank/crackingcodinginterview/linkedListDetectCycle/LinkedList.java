package com.hackerrank.crackingcodinginterview.linkedListDetectCycle;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {

	Node head;

	// My way of solving this including removing the loop also included
	public boolean hasCycle(Node head) {

		List<Node> llElements = new ArrayList<>();

		if (head == null) {
			return false;
		}

		Node current = head;
		//For removing the loop
		Node prev = null;

		while (current.next != null) {
			if (llElements.contains(current)) {
				prev.next = null;
				return true;
			}
			llElements.add(current);
			prev = current;
			current = current.next;
		}
		return false;
	}

	//Using Floyd’s Cycle detection algorithm
	//Use two nodes, one is slow and the other fast moving twice the speed of slow.
	public boolean floydsCycleDet(Node head) {
		
		Node slowNode = head;
		Node fastNode = head;
		while (slowNode != null && fastNode != null && fastNode.next != null) {
			slowNode = slowNode.next;
			fastNode = fastNode.next.next;
			//If both if them meet means, there is a loop in the List.
			//Logic for removing loop has to be solved, refer GforG for that
			if(slowNode == fastNode) {
				//removeLoop();
				return true;
			}
		}
		
		return false;
	}

}

class Node {

	public int data;
	public Node next;

	Node(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
