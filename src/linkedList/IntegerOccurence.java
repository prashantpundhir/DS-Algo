package linkedList;

import java.util.LinkedList;
import java.util.List;

public class IntegerOccurence {
	 Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}

	}

	public void push(int data) {
		Node n = new Node(data);

		n.next = head;
		head = n;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntegerOccurence li = new IntegerOccurence();
		int val = 4;
		li.push(1);
		li.push(2);
		li.push(3);
		li.push(1);
		li.push(4);
		li.push(5);
		li.push(1);

		System.out.println(li.findOccurence(val));

	}

	 int findOccurence(int val) {
		int count = 0;

		Node current = head;
		while (current != null) {
			if (current.data == val)
				count++;
			current = current.next;

		}

		return count;
	}

}
