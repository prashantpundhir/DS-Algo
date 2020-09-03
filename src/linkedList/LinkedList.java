package linkedList;

import java.util.Stack;

public class LinkedList {
	Node head;

	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if (head == null)
			head = node;
		else {
			Node n = head;
			while (n.next != null)
				n = n.next;
			n.next = node;
		}
	}

	public void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
//		node.next = null;
		node.next = head;
		head = node;
	}

	public void insertAtIndex(int index, int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if (index == 0)
			insertAtStart(data);
		else {
			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}

	public void deleteAt(int index) {
		if (index == 0)
			head = head.next;
		else {
			Node n = head;
			Node n1 = null;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;

			System.out.println("Deleted " + n1.data);

			n1 = null;

		}
	}

	public void show() {
		Node node = head;
		while (node.next != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println(node.data);

	}

	public int findMid() {
		if (head == null)
			return -1;

		Node fast = head;
		Node slow = head;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}

		return slow.data;
	}

	public void detectLoop() {
		if (head == null)
			return;

		Node fast = head;
		Node slow = head;
		boolean flag = false;
		while (slow.next != null && fast.next != null && fast != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (slow == fast) {
				flag = true;
				break;
			}
		}
		if (flag)
			System.out.println("Loop Detected");
		else
			System.out.println("No Loop Found");
	}

	public void reverseLinkedList() {
		Node pre = null;
		Node next = null;
		Node curr = head;
		while (curr != null) {
			next = curr.next;
			curr.next = pre;
			pre = curr;
			curr = next;
		}
		head = pre;
	}

	public boolean findPalindrome() {

		Node curr = head;
		Node fast = head;

		Stack<Integer> st = new Stack<>();

		while (fast != null && fast.next != null) {

			st.push(curr.data);
			fast = fast.next.next;
			curr = curr.next;

		}

		if (fast != null)
			curr = curr.next;

		while (curr != null) {
			if (st.pop() != curr.data)
				return false;
			curr = curr.next;
		}

		return true;
	}

	public void rotateLinkedList(int k) {
		Node current = head;
		int count = 1;

		if (k == 0)
			return;

		while (count < k && current.next != null) {
			current = current.next;
			count++;
		}
		
		if (current == null)
			return;

		Node newHead = current;

		while (current.next != null)
			current = current.next;

		current.next = head;

		head = newHead.next;
		newHead.next = null;

	}

}