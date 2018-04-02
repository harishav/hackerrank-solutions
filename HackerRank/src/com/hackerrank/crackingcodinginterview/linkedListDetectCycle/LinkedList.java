package com.hackerrank.crackingcodinginterview.linkedListDetectCycle;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {

	Node head;

	public boolean hasCycle(Node head) {

		List<Node> llElements = new ArrayList<>();

		if (head == null) {
			return false;
		}

		Node current = head;

		while (current.next != null) {
			if (llElements.contains(current)) {
				return true;
			}
			llElements.add(current);
			current = current.next;
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
